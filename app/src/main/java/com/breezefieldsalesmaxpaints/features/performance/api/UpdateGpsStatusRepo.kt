package com.breezefieldsalesmaxpaints.features.performance.api

import com.breezefieldsalesmaxpaints.base.BaseResponse
import com.breezefieldsalesmaxpaints.features.performance.model.UpdateGpsInputListParamsModel
import com.breezefieldsalesmaxpaints.features.performance.model.UpdateGpsInputParamsModel
import io.reactivex.Observable

/**
 * Created by Saikat on 15-11-2018.
 */
class UpdateGpsStatusRepo(val apiService: UpdateGpsStatusApi) {
    fun updateGpsStatus(updateGps: UpdateGpsInputParamsModel): Observable<BaseResponse> {
        return apiService.updateGpsStatus(updateGps)
    }
    fun updateGpsStatuswithList(updateGpslist: UpdateGpsInputListParamsModel): Observable<BaseResponse> {
        return apiService.updateGpsStatusWithList(updateGpslist)
    }
}