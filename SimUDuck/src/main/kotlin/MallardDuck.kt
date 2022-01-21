class MallardDuck : Duck() {

    init {
        quackBehavior = Quack()
        flyBehavior = FlyWithWings()
    }

    override fun display() {
        println("I'm real Mallard duck")
    }
}