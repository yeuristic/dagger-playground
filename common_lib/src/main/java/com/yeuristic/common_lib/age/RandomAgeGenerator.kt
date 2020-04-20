package com.yeuristic.common_lib.age

import kotlin.random.Random

class RandomAgeGenerator: AgeGenerator {
    override fun generateAge(): Int {
        return Random.nextInt(8, 100)
    }
}