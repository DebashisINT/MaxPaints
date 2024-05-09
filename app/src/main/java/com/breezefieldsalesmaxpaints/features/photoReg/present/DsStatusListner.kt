package com.breezefieldsalesmaxpaints.features.photoReg.present

import com.breezefieldsalesmaxpaints.app.domain.ProspectEntity
import com.breezefieldsalesmaxpaints.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}