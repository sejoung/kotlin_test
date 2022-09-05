package io.github.sejoung.ksp

enum class AnimalType {
    CAT,
    DOG,
}

fun AnimalFactory(key: AnimalType): Animal = when (key) {
    AnimalType.CAT -> Cat()
    AnimalType.DOG -> Dog()
}

interface Animal
class Dog : Animal
class Cat : Animal