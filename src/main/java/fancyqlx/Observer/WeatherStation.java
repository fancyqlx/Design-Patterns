package fancyqlx.Observer;

public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4);
        weatherData.setMeasurements(83,60,29.2);
    }
}

class CurrentConditionsDisplay implements Observer, DisplayElement{
    private double temperature;
    private double humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(){
        if(this.weatherData instanceof WeatherData){
            WeatherData w = (WeatherData) this.weatherData;
            this.temperature = w.getTemperature();
            this.humidity = w.getHumidity();
        }
        display();
    }

    public void display(){
        System.out.println("Current conditions " + temperature + "F degrees and " + humidity + "% humidity");
    }

}