package display;

import observer.Observer;
import weather.WeatherData;

public class CurrentConditionsDisplay implements Observer,DisplayElement{

    WeatherData wd;
    @Override
    public void update(Object o) {
        wd = (WeatherData) o;
    }
    
    @Override
    public void display() {
        System.out.println("Temperatura: " + wd.getTemperatura() + "\n" +
                           "Umidade: " + wd.getUmidade() + "\n" + 
                           "Pressao: " + wd.getUmidade());
    }   
}
