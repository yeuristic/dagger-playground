package com.yeuristic.common_lib.di;

import com.yeuristic.common_lib.age.AgeGenerator;
import com.yeuristic.common_lib.name.NameGenerator;

import javax.inject.Named;

import dagger.Component;

@Component(modules = {CommonModule.class})
public interface CommonComponent {
    NameGenerator getNameGenerator();
    @Named("Random")
    AgeGenerator getAgeGenerator();
}