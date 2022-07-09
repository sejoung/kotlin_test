package io.github.sejoung

import org.junit.jupiter.api.Test

internal class MapOfUseTest {
    @Test
    fun mapOfTest() {
        val mapOfUse = MapOfUse()
        val actual = mapOfUse.getMap("123", MapOfUse.Atest.A)
        println(actual)
    }
}