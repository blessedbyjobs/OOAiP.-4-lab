package factory.characters

// приказы отдает только главнокомандующий
typealias Order = String

// команды отдает уже полковник, рядовые подчиняются командам
typealias Command = String

// главнокомандующий, задача - планировать наступление
interface ChiefGeneral {

    fun planNextBattle(): Order
}

// полковник, задача - доводить команды до подчиненных
interface Colonel {

    fun applyOrder(order: Order): List<Command>
}

// рядовой, задача - исполнять команды
interface Private {

    fun executeCommand(command: Command)
}

