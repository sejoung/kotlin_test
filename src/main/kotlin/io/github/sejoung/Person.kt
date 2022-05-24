package io.github.sejoung

import io.github.sejoung.User.A
import io.github.sejoung.User.B
import io.github.sejoung.User.C
import io.github.sejoung.User.D
import io.github.sejoung.User.E

data class Person(
    val firstName: String,
    var lastName: String,
)


enum class User {
    A, B, C, D, E
}

class Person2 {
    val a: User = A
    val b: User = B
    val c: User = C
    val d: User = D
    val e: User = E
}

fun main() {
    val p2 = Person2()
    val p = Person(firstName = "", lastName = "")

    println("person = $p person2 = ${p2.a} ${p2.b} ${p2.c} ${p2.d} ${p2.e}")
}