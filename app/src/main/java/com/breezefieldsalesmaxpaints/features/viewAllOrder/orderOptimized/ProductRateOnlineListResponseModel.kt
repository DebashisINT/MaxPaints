package com.breezefieldsalesmaxpaints.features.viewAllOrder.orderOptimized

import com.breezefieldsalesmaxpaints.app.domain.ProductOnlineRateTempEntity
import com.breezefieldsalesmaxpaints.base.BaseResponse
import com.breezefieldsalesmaxpaints.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}