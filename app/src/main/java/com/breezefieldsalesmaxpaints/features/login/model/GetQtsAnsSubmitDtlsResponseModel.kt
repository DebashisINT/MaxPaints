package com.breezefieldsalesmaxpaints.features.login.model

import com.breezefieldsalesmaxpaints.app.domain.QuestionSubmitEntity


class GetQtsAnsSubmitDtlsResponseModel {
    var status:String? = null
    var message:String? = null
    var Question_list: ArrayList<QuestionSubmitEntity>? = null
}