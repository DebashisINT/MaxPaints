package com.breezefieldsalesmaxpaints.features.newcollectionreport

import com.breezefieldsalesmaxpaints.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}