package com.breezefieldsalesmaxpaints.features.NewQuotation.api



object GetQuotRegProvider {

    fun provideSaveButton(): GetQuotListRegRepository {
        return GetQuotListRegRepository(GetQutoListApi.create())
    }


}