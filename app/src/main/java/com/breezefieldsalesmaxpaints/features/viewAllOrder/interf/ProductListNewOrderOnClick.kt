package com.breezefieldsalesmaxpaints.features.viewAllOrder.interf

import com.breezefieldsalesmaxpaints.app.domain.NewOrderGenderEntity
import com.breezefieldsalesmaxpaints.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}