package com.breezefieldsalesmaxpaints.features.orderList.model

import com.breezefieldsalesmaxpaints.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}