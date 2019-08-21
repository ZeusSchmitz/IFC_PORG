package weather;

import display.CurrentConditionsDisplay;
import display.ForecastDisplay;
import display.StatisticsDisplay;

public class Weather {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        
        WeatherData wd = new WeatherData();
        CurrentConditionsDisplay ccd = new CurrentConditionsDisplay();
        ForecastDisplay fd = new ForecastDisplay();
        StatisticsDisplay sd = new StatisticsDisplay();
        
        wd.registerObserver(ccd);
        wd.registerObserver(fd);
        
        wd.measurementsChanged(15, 98, 55);
        
        ccd.display();
        fd.display();
        sd.display();
        
        wd.removeObserver(fd);
        wd.registerObserver(sd);
        
        wd.measurementsChanged(15, 50, 55);
        
        ccd.display();
        fd.display();
        sd.display();
    }
    
}
