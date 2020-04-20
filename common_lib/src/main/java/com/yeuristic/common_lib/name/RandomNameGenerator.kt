package com.yeuristic.common_lib.name

import java.lang.StringBuilder
import kotlin.random.Random
import kotlin.random.nextInt

class RandomNameGenerator: NameGenerator {
    companion object {
        val nameDictionary: Array<String> = arrayOf(
            "Doni",
            "Daniel",
            "Fery",
            "Harlie",
            "Winardi"
        )
    }
    override fun generateName(words: Int): String {
        val stringBuilder = StringBuilder()
        for (i in 0 until words) {
            stringBuilder.append(nameDictionary[Random.nextInt(nameDictionary.indices)])
            stringBuilder.append(" ")
        }

        return stringBuilder.toString()
    }

}