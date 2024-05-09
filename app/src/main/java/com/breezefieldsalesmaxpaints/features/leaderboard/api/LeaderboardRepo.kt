package com.breezefieldsalesmaxpaints.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezefieldsalesmaxpaints.app.FileUtils
import com.breezefieldsalesmaxpaints.app.Pref
import com.breezefieldsalesmaxpaints.base.BaseResponse
import com.breezefieldsalesmaxpaints.features.addshop.model.AddLogReqData
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
import com.breezefieldsalesmaxpaints.features.dashboard.presentation.DashboardActivity
import com.breezefieldsalesmaxpaints.features.login.model.WhatsappApiData
import com.breezefieldsalesmaxpaints.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}