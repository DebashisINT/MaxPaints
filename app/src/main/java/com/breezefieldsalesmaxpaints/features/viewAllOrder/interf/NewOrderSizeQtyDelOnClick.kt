package com.breezefieldsalesmaxpaints.features.viewAllOrder.interf

import com.breezefieldsalesmaxpaints.app.domain.NewOrderGenderEntity
import com.breezefieldsalesmaxpaints.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}