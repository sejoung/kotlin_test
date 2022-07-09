package io.github.sejoung

import org.junit.jupiter.api.Test

internal class PersonTest {

    @Test
    fun test() {
        val p2 = Person2()
        val p = Person(firstName = "", lastName = "")

        println("person = $p person2 = ${p2.a} ${p2.b} ${p2.c} ${p2.d} ${p2.e}")

        val a = null

        a?.let {
            println("test")
        }
    }
}