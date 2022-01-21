fun main() {
    val mallard = MallardDuck()
    mallard.performQuack()
    mallard.performFly()

    val model = ModelDuck()
    model.performFly()
    model.flyBehavior = FlyRocketPowered()
    model.performFly()
}