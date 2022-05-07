
package ch02.Weather;

import java.util.ArrayList;

class WeatherData implements Subject {
    private float temp; //온도
    private float humidity; //습도
    private float pressure; //기압
    private ArrayList observers; //옵저버 ArrayList

    public WeatherData() {
        observers = new ArrayList();
    } //ArrayList observers 객체 생성

    public void registerObserver(Observer o) {
        observers.add(o);
    } //observers 등록

    public void removeObserver(Observer o) { //observers 삭제
        int i = observers.indexOf(o);
        if (i >= 0) //정상적인 observers인지 확인
            observers.remove(i);
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i); //현재 옵저버 순서 가져오기
            observer.update(temp, humidity, pressure); //observer 객체 업데이트
        }
    }

    public void measurementsChanged() { notifyObservers(); } //Weatherdata가 변할 때

    public void setMeasurements(float temp, float humidity, float pressure) { //data 값 setter
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemp() { return temp; }

    public float getHumidity() { return humidity; }

    public float getPressure() { return pressure; }
}
