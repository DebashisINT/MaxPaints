package com.breezefieldsalesmaxpaints.features.document.api

import com.breezefieldsalesmaxpaints.features.dymanicSection.api.DynamicApi
import com.breezefieldsalesmaxpaints.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}