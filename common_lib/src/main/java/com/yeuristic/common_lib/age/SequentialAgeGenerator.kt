package com.yeuristic.common_lib.age

class SequentialAgeGenerator: AgeGenerator {
    companion object {
        var lastAge: Int = 8
    }
    override fun generateAge(): Int {
        return lastAge++
    }
}