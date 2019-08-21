package display;

import observer.Observer;
import weather.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {

    float minTemp = 0, maxTemp = 0, mediaTemp = 0,
            minPressao = 0, maxPressao = 0, mediaPressao = 0,
            minUmidade = 0, maxUmidade = 0, mediaUmidade = 0;

    WeatherData wd;

    @Override
    public void update(Object o) {
        wd = (WeatherData) o;

        if (wd.getTemperatura() < minTemp) {
            minTemp = wd.getTemperatura();
        }

        if (wd.getTemperatura() > maxTemp) {
            maxTemp = wd.getTemperatura();
        }

        if (wd.getPressao() < minPressao) {
            minPressao = wd.getPressao();
        }

        if (wd.getPressao() > maxPressao) {
            maxPressao = wd.getPressao();
        }

        if (wd.getUmidade() < minUmidade) {
            minUmidade = wd.getUmidade();
        }

        if (wd.getUmidade() > maxUmidade) {
            maxUmidade = wd.getUmidade();
        }

    }

    @Override
    public void display() {

        System.out.println("Menor temperatura: " + minTemp + " | Maior temperatura: " + maxTemp + " | Media Temperatura: " + ((minTemp + maxTemp) / 2)
        + "\n" + "Menor pressao: " + minPressao + " | Maior pressao: " + maxPressao + " | Media Pressao: " + ((minPressao+maxPressao)/2) 
        + "\n" + "Menor umidade: " + minUmidade + " | maior umidade: " + maxUmidade + " | Media umidade: " + ((minUmidade+maxUmidade)/2));

    }

}
