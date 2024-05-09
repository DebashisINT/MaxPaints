package com.breezefieldsalesmaxpaints.features.stockAddCurrentStock.api

import com.breezefieldsalesmaxpaints.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldsalesmaxpaints.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}