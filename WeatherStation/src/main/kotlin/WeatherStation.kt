fun main() {
    val weatherData = WeatherData()
    val currentDisplay = CurrentConditionsDisplay(weatherData)

    weatherData.setMeasurements(80f, 65f, 30.4f)
    weatherData.setMeasurements(82f, 70f, 29.2f)
    weatherData.setMeasurements(78f, 90f, 29.2f);
}