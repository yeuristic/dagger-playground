package com.yeuristic.hotel.di

import com.yeuristic.core.PublicComponentFactory
import com.yeuristic.hotel_api.di.HotelComponent

class HotelApiComponentFactory: PublicComponentFactory<HotelComponent> {
    override fun create(): HotelComponent {
        return DaggerHotelComponentImpl.builder().build()
    }
}