package condiments

import Beverage

class Mocha(private val beverage: Beverage) : CondimentDecorator() {

    init {
        description = "${beverage.description}, Mocha"
    }

    override fun cost(): Double {
        return 0.20 + beverage.cost()
    }
}