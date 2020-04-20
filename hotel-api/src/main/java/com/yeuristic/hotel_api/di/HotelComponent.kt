package com.yeuristic.hotel_api.di

import com.yeuristic.hotel_api.HotelProvider

interface HotelComponent {
    fun getHotelProvider(): HotelProvider
}