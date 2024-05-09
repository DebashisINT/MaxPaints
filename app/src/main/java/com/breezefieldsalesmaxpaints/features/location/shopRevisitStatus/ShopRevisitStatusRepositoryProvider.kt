package com.breezefieldsalesmaxpaints.features.location.shopRevisitStatus

import com.breezefieldsalesmaxpaints.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldsalesmaxpaints.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}