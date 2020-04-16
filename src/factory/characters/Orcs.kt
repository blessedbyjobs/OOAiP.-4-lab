package factory.characters


class OrcChiefGeneral : Orc("главнокомандующий"), ChiefGeneral {

    override fun planNextBattle(): Order {
        speak("Хочу туда")
        return "Хочу туда"
    }
}

class OrcColonel : Orc("генерал"), Colonel {

    override fun applyOrder(order: Order): List<Command> {
        speak("Ага. Идти ${order.replace("Хочу ", "")}")
        return listOf(order)
    }
}

class OrcPrivate : Orc("солдат"), Private {

    override fun executeCommand(command: Command) {
        speak("Опять ${command.replace("Хочу ", "")}...")
    }
}