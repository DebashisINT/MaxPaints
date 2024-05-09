package com.breezefieldsalesmaxpaints.features.leaderboard.api

import com.breezefieldsalesmaxpaints.app.NetworkConstant
import com.breezefieldsalesmaxpaints.base.BaseResponse
import com.breezefieldsalesmaxpaints.features.addshop.model.AddShopRequestData
import com.breezefieldsalesmaxpaints.features.addshop.model.AddShopResponse
import com.breezefieldsalesmaxpaints.features.addshop.model.LogFileResponse
import com.breezefieldsalesmaxpaints.features.addshop.model.UpdateAddrReq
import com.breezefieldsalesmaxpaints.features.contacts.CallHisDtls
import com.breezefieldsalesmaxpaints.features.contacts.CompanyReqData
import com.breezefieldsalesmaxpaints.features.contacts.ContactMasterRes
import com.breezefieldsalesmaxpaints.features.contacts.SourceMasterRes
import com.breezefieldsalesmaxpaints.features.contacts.StageMasterRes
import com.breezefieldsalesmaxpaints.features.contacts.StatusMasterRes
import com.breezefieldsalesmaxpaints.features.contacts.TypeMasterRes
import com.breezefieldsalesmaxpaints.features.login.model.WhatsappApiData
import com.breezefieldsalesmaxpaints.features.login.model.WhatsappApiFetchData
import io.reactivex.Observable
import okhttp3.MultipartBody
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

/**
 * Created by Puja on 12-40-2014.
 */
interface LeaderboardApi {

    @FormUrlEncoded
    @POST("LeaderboardInfo/LeaderboardBranchLists")
    fun branchList(@Field("session_token") session_token: String): Observable<LeaderboardBranchData>

    @FormUrlEncoded
    @POST("LeaderboardInfo/LeaderboardOwnList")
    fun ownDatalist(@Field("user_id") user_id: String,@Field("activitybased") activitybased: String,@Field("branchwise") branchwise: String,@Field("flag") flag: String): Observable<LeaderboardOwnData>

    @FormUrlEncoded
    @POST("LeaderboardInfo/LeaderboardOverallList")
    fun overAllDatalist(@Field("user_id") user_id: String,@Field("activitybased") activitybased: String,@Field("branchwise") branchwise: String,@Field("flag") flag: String): Observable<LeaderboardOverAllData>


    /**
     * Companion object to create the GithubApiService
     */
    companion object Factory {
        fun create(): LeaderboardApi {
            val retrofit = Retrofit.Builder()
                    .client(NetworkConstant.setTimeOut())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(NetworkConstant.ADD_SHOP_BASE_URL)
                    .build()

            return retrofit.create(LeaderboardApi::class.java)
        }

        fun createWithoutMultipart(): LeaderboardApi {
            val retrofit = Retrofit.Builder()
                    .client(NetworkConstant.setTimeOut())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(NetworkConstant.BASE_URL)
                    .build()

            return retrofit.create(LeaderboardApi::class.java)
        }
    }
}