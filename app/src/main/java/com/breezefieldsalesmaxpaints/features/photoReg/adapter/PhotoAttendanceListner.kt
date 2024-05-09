package com.breezefieldsalesmaxpaints.features.photoReg.adapter

import com.breezefieldsalesmaxpaints.features.photoReg.model.UserListResponseModel

interface PhotoAttendanceListner {
    fun getUserInfoOnLick(obj: UserListResponseModel)
    fun getUserInfoAttendReportOnLick(obj: UserListResponseModel)
}