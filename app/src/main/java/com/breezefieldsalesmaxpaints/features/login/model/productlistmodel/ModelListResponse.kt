package com.breezefieldsalesmaxpaints.features.login.model.productlistmodel

import com.breezefieldsalesmaxpaints.app.domain.ModelEntity
import com.breezefieldsalesmaxpaints.app.domain.ProductListEntity
import com.breezefieldsalesmaxpaints.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}