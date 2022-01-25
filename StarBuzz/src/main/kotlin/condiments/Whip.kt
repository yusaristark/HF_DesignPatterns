package condiments

import Beverage

class Whip(private val beverage: Beverage) : CondimentDecorator() {

    init {
        description = "${beverage.description}, Whip"
    }

    override fun cost(): Double {
        return 0.25 + beverage.cost()
    }
}