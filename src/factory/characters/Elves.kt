package factory.characters


class ElfChiefGeneral : Elf("главнокомандующий"), ChiefGeneral {

    override fun planNextBattle(): Order {
        speak("Приказываю наступать туда вот")
        return "Приказываю наступать туда вот"
    }
}

class ElfColonel : Elf("генерал"), Colonel {

    override fun applyOrder(order: Order): List<Command> {
        speak("Приказ принят к исполнению.")
        return listOf(order)
    }
}

class ElfPrivate : Elf("солдат"), Private {

    override fun executeCommand(command: Command) {
        speak("Есть ${command.replace("Приказываю ", "")}!\n")
    }
}