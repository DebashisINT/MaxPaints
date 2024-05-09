package com.breezefieldsalesmaxpaints.features.nearbyuserlist.api

import com.breezefieldsalesmaxpaints.app.Pref
import com.breezefieldsalesmaxpaints.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezefieldsalesmaxpaints.features.newcollection.model.NewCollectionListResponseModel
import com.breezefieldsalesmaxpaints.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}