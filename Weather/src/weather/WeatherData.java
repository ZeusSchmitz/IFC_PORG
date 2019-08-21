package weather;

import java.util.ArrayList;
import observer.Observer;
import observer.Subject;
//Esta classe é o subject, que ira notificar todos os observer quando ocorrer alguma mudança

public class WeatherData implements Subject{
    
    private float temperatura;
    private float umidade;
    private float pressao;
    ArrayList<Observer> observers = new ArrayList();

    @Override
    public void registerObserver(Observer ob) {
        observers.add(ob);
        
    }

    @Override
    public void removeObserver(Observer ob) {
        observers.remove(ob);
       
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(this);   
        }
    }
    
    public void measurementsChanged(float temp, float umidade, float pressao){
        setTemperatura(temp);
        setUmidade(umidade);
        setPressao(pressao);
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
        notifyObserver();
    }

    public float getUmidade() {
        return umidade;
    }

    public void setUmidade(float umidade) {
        this.umidade = umidade;
        notifyObserver();
    }

    public float getPressao() {
        return pressao;
    }

    public void setPressao(float pressao) {
        this.pressao = pressao;
        notifyObserver();
    }
    
}
