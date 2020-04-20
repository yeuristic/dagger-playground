package com.yeuristic.core

interface PublicComponentFactory<C> {
    fun create(): C
}