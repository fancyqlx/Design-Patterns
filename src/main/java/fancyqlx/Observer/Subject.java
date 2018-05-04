package fancyqlx.Observer;

import java.util.LinkedList;
import java.util.List;

public interface Subject {
    void registerObserver(Observer ob);
    void removeObserver(Observer ob);
    void notifyObservers();
}

class WeatherData implements Subject{
    private List<Observer> observers;
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherData(){
        observers = new LinkedList<>();
    }

    public void registerObserver(Observer ob){
        observers.add(ob);
    }

    public void removeObserver(Observer ob){
        observers.remove(ob);
    }

    public void notifyObservers(){
        for(Observer ob: observers){
            ob.update();
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(double temperature, double humidity, double pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public double getTemperature(){
        return temperature;
    }

    public double getHumidity(){
        return humidity;
    }

    public double getPressure(){
        return pressure;
    }
}