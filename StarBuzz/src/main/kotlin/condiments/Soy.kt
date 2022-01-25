package condiments

import Beverage

class Soy(private val beverage: Beverage) : CondimentDecorator() {

    init {
        description = "${beverage.description}, Soy"
    }

    override fun cost(): Double {
        return 0.1 + beverage.cost()
    }
}