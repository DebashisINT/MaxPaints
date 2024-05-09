package com.breezefieldsalesmaxpaints.features.viewAllOrder.model

import com.breezefieldsalesmaxpaints.app.domain.NewOrderColorEntity
import com.breezefieldsalesmaxpaints.app.domain.NewOrderGenderEntity
import com.breezefieldsalesmaxpaints.app.domain.NewOrderProductEntity
import com.breezefieldsalesmaxpaints.app.domain.NewOrderSizeEntity
import com.breezefieldsalesmaxpaints.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

