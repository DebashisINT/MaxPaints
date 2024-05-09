package com.breezefieldsalesmaxpaints.features.weather.api

import com.breezefieldsalesmaxpaints.base.BaseResponse
import com.breezefieldsalesmaxpaints.features.task.api.TaskApi
import com.breezefieldsalesmaxpaints.features.task.model.AddTaskInputModel
import com.breezefieldsalesmaxpaints.features.weather.model.ForeCastAPIResponse
import com.breezefieldsalesmaxpaints.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}