package com.yeuristic.core

import java.util.*

class PublicComponentHolder {
    companion object {
        val mutableMap : MutableMap<Objects, PublicComponentFactory> = mutableMapOf()
    }
}
