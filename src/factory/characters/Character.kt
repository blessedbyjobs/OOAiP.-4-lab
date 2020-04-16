package factory.characters


abstract class Character(private val race: String) {

    open fun speak(message: String) {
        println("- $race: $message")
    }
}


abstract class Elf(grade: String) : Character("Эльф в звании - $grade")

abstract class Orc(grade: String) : Character("Орк в звании - $grade")