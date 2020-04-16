package factory

import factory.factories.ElfArmyFactory
import factory.factories.OrcArmyFactory

fun main() {
    ElfArmyFactory().doBattle()

    OrcArmyFactory().doBattle()
}