package com.breezefieldsalesmaxpaints.features.lead.api

import com.breezefieldsalesmaxpaints.features.NewQuotation.api.GetQuotListRegRepository
import com.breezefieldsalesmaxpaints.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}