package org.example.kotlin.kotlin15

fun <T> Iterable<T>.randomTake(): T = this.shuffled().first()
