package factory.factories

import factory.characters.*

// фабрика армии эльфов
class ElfArmyFactory : BaseArmyFactory() {

    override fun generateChiefGeneral(): ChiefGeneral = ElfChiefGeneral()

    override fun generateColonel(): Colonel = ElfColonel()

    override fun generatePrivate(): Private = ElfPrivate()
}