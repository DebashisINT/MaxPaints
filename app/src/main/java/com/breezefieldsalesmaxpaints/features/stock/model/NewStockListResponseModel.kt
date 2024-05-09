package com.breezefieldsalesmaxpaints.features.stock.model

import com.breezefieldsalesmaxpaints.base.BaseResponse


/**
 * Created by Saikat on 17-09-2019.
 */
class NewStockListResponseModel : BaseResponse() {
    var stock_list: ArrayList<StockListDataModel>? = null
}