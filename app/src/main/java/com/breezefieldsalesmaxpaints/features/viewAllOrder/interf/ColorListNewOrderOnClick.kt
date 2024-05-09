package com.breezefieldsalesmaxpaints.features.viewAllOrder.interf

import com.breezefieldsalesmaxpaints.app.domain.NewOrderColorEntity
import com.breezefieldsalesmaxpaints.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}