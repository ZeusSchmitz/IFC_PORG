package display;

import observer.Observer;
import weather.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement{

    WeatherData wd;
    
    @Override
    public void update(Object o) {
        
        wd = (WeatherData) o;
        
    }

    @Override
    public void display() {
        
        if(wd.getUmidade() > 50){
            System.out.println("Previsao é chuva");
        }else{
            System.out.println("Previsao é sol");
        }
        
    }
    
}
