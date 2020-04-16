package factory.factories

import factory.characters.*

// фабрика армии орков
class OrcArmyFactory : BaseArmyFactory() {

    override fun generateChiefGeneral(): ChiefGeneral = OrcChiefGeneral()

    override fun generateColonel(): Colonel = OrcColonel()

    override fun generatePrivate(): Private = OrcPrivate()
}