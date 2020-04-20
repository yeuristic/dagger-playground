package com.yeuristic.flight.di

import com.yeuristic.common_lib.age.AgeGenerator
import com.yeuristic.common_lib.name.NameGenerator
import com.yeuristic.flight.provider.FlightPassengerProvider
import com.yeuristic.flight.provider.FlightPassengerProviderImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
abstract class FlightModule {
    companion object {
        @Provides
        fun providesFlightPassengerProviderImpl(nameGenerator: NameGenerator, words: Int, @Named("Random") ageGenerator: AgeGenerator): FlightPassengerProviderImpl {
            return FlightPassengerProviderImpl(nameGenerator, words, ageGenerator)
        }

        @Provides
        fun providesWords(): Int {
            return 4
        }
    }

    @Binds
    abstract fun providesFlightPassengerProvider(flightPassengerProviderImpl: FlightPassengerProviderImpl): FlightPassengerProvider
}