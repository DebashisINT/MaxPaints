package com.breezefieldsalesmaxpaints.features.dashboard.presentation.api.dayStartEnd

import com.breezefieldsalesmaxpaints.features.stockCompetetorStock.api.AddCompStockApi
import com.breezefieldsalesmaxpaints.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}