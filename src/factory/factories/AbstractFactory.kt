package factory.factories

import factory.characters.ChiefGeneral
import factory.characters.Colonel
import factory.characters.Private

// фабрика, генерирующая военнослужащих 3 рангов
abstract class BaseArmyFactory  {

    abstract fun generateChiefGeneral(): ChiefGeneral

    abstract fun generateColonel(): Colonel

    abstract fun generatePrivate(): Private

    // для битвы нужны воины
    fun doBattle() {
        val commander = generateChiefGeneral()
        val general = generateColonel()
        val soldier = generatePrivate()

        /**
         * Алгоритм битвы:
         * Главнокомандующий планирует наступление и отдает приказ
         * Полковник обязан среагировать на приказ и отдать команды рядовым
         * Рядовые должны принять их к сведению и выполнить
         */
        commander.planNextBattle()
            .let { order -> general.applyOrder(order) }
            .forEach { command -> soldier.executeCommand(command) }
    }
}