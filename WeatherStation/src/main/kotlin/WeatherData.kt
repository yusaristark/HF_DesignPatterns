import java.util.Observable

class WeatherData : Observable() {
    var temperature: Float = 0f
    var humidity: Float = 0f
    var pressure: Float = 0f

    fun measurementsChanged() {
        setChanged()
        notifyObservers()
    }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }
}