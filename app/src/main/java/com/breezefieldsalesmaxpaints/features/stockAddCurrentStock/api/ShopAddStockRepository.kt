package com.breezefieldsalesmaxpaints.features.stockAddCurrentStock.api

import com.breezefieldsalesmaxpaints.base.BaseResponse
import com.breezefieldsalesmaxpaints.features.location.model.ShopRevisitStatusRequest
import com.breezefieldsalesmaxpaints.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldsalesmaxpaints.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezefieldsalesmaxpaints.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezefieldsalesmaxpaints.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}