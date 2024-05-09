package com.breezefieldsalesmaxpaints.features.notification.model

import com.breezefieldsalesmaxpaints.base.BaseResponse

/**
 * Created by Saikat on 06-03-2019.
 */
class NotificationListResponseModel : BaseResponse() {
    var notification_list: ArrayList<NotificationListDataModel>? = null
}