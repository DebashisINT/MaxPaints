package com.breezefieldsalesmaxpaints.features.activities.api

import com.breezefieldsalesmaxpaints.features.member.api.TeamApi
import com.breezefieldsalesmaxpaints.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}