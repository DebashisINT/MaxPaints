package com.breezefieldsalesmaxpaints.features.dashboard.presentation.api.dayStartEnd

import com.breezefieldsalesmaxpaints.app.Pref
import com.breezefieldsalesmaxpaints.base.BaseResponse
import com.breezefieldsalesmaxpaints.features.dashboard.presentation.model.DaystartDayendRequest
import com.breezefieldsalesmaxpaints.features.dashboard.presentation.model.StatusDayStartEnd
import com.breezefieldsalesmaxpaints.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezefieldsalesmaxpaints.features.stockCompetetorStock.api.AddCompStockApi
import io.reactivex.Observable

class DayStartEndRepository (val apiService: DayStartEndApi){
    fun dayStart(daystartDayendRequest: DaystartDayendRequest): Observable<BaseResponse> {
        return apiService.submitDayStartEnd(daystartDayendRequest)
    }

    fun dayStartEndStatus(date:String): Observable<StatusDayStartEnd> {
        return apiService.statusDayStartEnd(Pref.session_token!!, Pref.user_id!!,date)
    }

    fun daystartendDelete(sessionToken:String,usrID:String,date:String,dayStDel:String,dayEndDel:String): Observable<BaseResponse> {
        return apiService.submitDayStartEndDelApi(sessionToken,usrID,date,dayStDel,dayEndDel)
    }


}