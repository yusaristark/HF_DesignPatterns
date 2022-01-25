import condiments.Mocha
import condiments.Soy
import condiments.Whip

fun main() {
    val beverage = Espresso()
    println("${beverage.description} ${beverage.cost()}")

    var beverage2: Beverage = Espresso()
    beverage2 = Mocha(beverage2)
    beverage2 = Mocha(beverage2)
    beverage2 = Whip(beverage2)
    println("${beverage2.description} ${beverage2.cost()}")

    var beverage3: Beverage = Espresso()
    beverage3 = Soy(beverage3)
    beverage3 = Mocha(beverage3)
    beverage3 = Whip(beverage3)
    println("${beverage3.description} ${beverage3.cost()}")
}