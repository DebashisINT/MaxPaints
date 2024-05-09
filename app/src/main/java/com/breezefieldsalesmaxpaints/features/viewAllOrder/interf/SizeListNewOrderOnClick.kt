package com.breezefieldsalesmaxpaints.features.viewAllOrder.interf

import com.breezefieldsalesmaxpaints.app.domain.NewOrderProductEntity
import com.breezefieldsalesmaxpaints.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}