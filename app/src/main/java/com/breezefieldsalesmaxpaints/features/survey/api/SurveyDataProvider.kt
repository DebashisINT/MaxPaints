package com.breezefieldsalesmaxpaints.features.survey.api

import com.breezefieldsalesmaxpaints.features.photoReg.api.GetUserListPhotoRegApi
import com.breezefieldsalesmaxpaints.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}