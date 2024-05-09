package com.breezefieldsalesmaxpaints.features.location.shopRevisitStatus

import com.breezefieldsalesmaxpaints.base.BaseResponse
import com.breezefieldsalesmaxpaints.features.location.model.ShopDurationRequest
import com.breezefieldsalesmaxpaints.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}