import java.util.*
import java.util.Observer

class CurrentConditionsDisplay(private val observable: Observable) : Observer, DisplayElement {
    private var temperature: Float = 0f
    private var humidity: Float = 0f

    init {
        observable.addObserver(this)
    }

    override fun display() {
        println("Current conditions: ${temperature}F degrees and ${humidity}% humidity")
    }

    override fun update(o: Observable?, arg: Any?) {
        if (o is WeatherData) {
            this.temperature = o.temperature
            this.humidity = o.humidity
            display()
        }
    }
}