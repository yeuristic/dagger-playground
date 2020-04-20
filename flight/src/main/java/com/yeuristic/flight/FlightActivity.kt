package com.yeuristic.flight

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yeuristic.flight.di.DaggerFlightComponent
import com.yeuristic.flight.provider.FlightPassengerProvider
import com.yeuristic.hotel_api.HotelProvider
import javax.inject.Inject

class FlightActivity : AppCompatActivity() {

    @Inject
    lateinit var flightPassengerProvider: FlightPassengerProvider
    @Inject
    lateinit var hotelProvider: HotelProvider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flight)

        DaggerFlightComponent.builder()
            .hotelComponent()
            .commonComponent(DaggerCommonComponent.builder().build())
            .build().inject(this)
    }
}
