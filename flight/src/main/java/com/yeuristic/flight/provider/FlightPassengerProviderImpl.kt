package com.yeuristic.flight.provider

import com.yeuristic.common_lib.age.AgeGenerator
import com.yeuristic.common_lib.name.NameGenerator

class FlightPassengerProviderImpl(val nameGenerator: NameGenerator, val nameWords: Int, val ageGenerator: AgeGenerator): FlightPassengerProvider {
    override fun providesPassenger(): PassengerData {
        return PassengerData(nameGenerator.generateName(nameWords), ageGenerator.generateAge())
    }
}