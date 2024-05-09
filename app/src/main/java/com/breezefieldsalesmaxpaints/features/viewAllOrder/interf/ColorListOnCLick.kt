package com.breezefieldsalesmaxpaints.features.viewAllOrder.interf

import com.breezefieldsalesmaxpaints.app.domain.NewOrderGenderEntity
import com.breezefieldsalesmaxpaints.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}