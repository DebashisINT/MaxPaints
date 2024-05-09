package com.breezefieldsalesmaxpaints.features.location.api

import com.breezefieldsalesmaxpaints.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldsalesmaxpaints.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}