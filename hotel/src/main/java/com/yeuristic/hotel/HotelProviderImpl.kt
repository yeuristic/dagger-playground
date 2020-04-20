package com.yeuristic.hotel

import com.yeuristic.hotel_api.HotelProvider
import javax.inject.Inject

class HotelProviderImpl @Inject constructor(): HotelProvider {
    override fun randomHotel(): String {
        return "Hotel A"
    }
}