package com.yeuristic.common_lib.di;

import com.yeuristic.common_lib.age.AgeGenerator;
import com.yeuristic.common_lib.age.RandomAgeGenerator;
import com.yeuristic.common_lib.age.SequentialAgeGenerator;
import com.yeuristic.common_lib.name.NameGenerator;
import com.yeuristic.common_lib.name.RandomNameGenerator;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class CommonModule {
    @Provides
    public static RandomNameGenerator providesRandomNameGenerator() {
        return new RandomNameGenerator();
    }

    @Provides
    public static RandomAgeGenerator providesRandomAgeGenerator() {
        return new RandomAgeGenerator();
    }

    @Provides
    public static SequentialAgeGenerator providesSequentialAgeGenerator() {
        return new SequentialAgeGenerator();
    }

    @Binds
    abstract NameGenerator providesNameGenerator(RandomNameGenerator randomNameGenerator);

    @Named("Random")
    @Binds
    abstract AgeGenerator providesAgeGenerator(RandomAgeGenerator randomAgeGenerator);

    @Named("Sequential")
    @Binds
    abstract AgeGenerator providesAgeGeneratorSeq(SequentialAgeGenerator sequentialAgeGenerator);
}

