package ch02.WeatherUtil;
import java.util.Observable;

class WeatherData extends Observable {
  private float temp; //온도
  private float humidity; //습도
  private float pressure; //기압

  public WeatherData() {  }

  public void measurementsChanged() { //Weatherdata가 변할 때
    setChanged();
    notifyObservers(); //Observable 유틸
  }

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
