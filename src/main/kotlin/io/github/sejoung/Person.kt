package io.github.sejoung

data class Person(
    val firstName: String,
    var lastName: String
)

enum class User {
    A, B, C, D, E
}

class Person2 {
    val a: User = User.A
    val b: User = User.B
    val c: User = User.C
    val d: User = User.D
    val e: User = User.E
}