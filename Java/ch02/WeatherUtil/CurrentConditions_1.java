package ch02.WeatherUtil;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditions_1 implements Observer, DisplayElement { //Display 1 (현재 날씨)
  Observable observable; //observable 객체
  private float temp;
  private float humidity;
  private float pressure;

  public CurrentConditions_1(Observable observable) { //생성자
    this.observable = observable;
    observable.addObserver(this); //Observable 추가 (내장 유틸)
  }

  public void update(Observable obs, Object arg) { //Observer 내장 메서드
    if (obs instanceof WeatherData){ //WeatherData인지 확인한다 (내장 객체는 가끔 다른 데이터가 넘어올 수 있다
      //A instanceof B : A와 B가 같은 객체&클래스인지 확인한다 
      WeatherData weatherData = (WeatherData) obs; //Observable를 WeatherData로 형 변환한다
      this.temp = weatherData.getTemp();
      this.humidity = weatherData.getHumidity();
      this.pressure = weatherData.getPressure();
      display();
    }
  }

  public void display() {
    System.out.println("[현재 날씨]");
    System.out.println("온도 : "+temp);
    System.out.println("습도 : " + humidity);
    System.out.println("기압 : " + pressure + "\n");
  }
}
