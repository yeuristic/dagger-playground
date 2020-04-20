package com.yeuristic.flight.di

import com.yeuristic.common_lib.di.CommonComponent
import com.yeuristic.flight.FlightActivity
import com.yeuristic.hotel_api.di.HotelComponent
import dagger.Component

@Component(modules = [FlightModule::class, HotelModule:class], dependencies = [CommonComponent::class, HotelComponent::class])
interface FlightComponent {
    fun inject(flightActivity: FlightActivity)
}