package com.breezefieldsalesmaxpaints.features.weather.api

import com.breezefieldsalesmaxpaints.features.task.api.TaskApi
import com.breezefieldsalesmaxpaints.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}