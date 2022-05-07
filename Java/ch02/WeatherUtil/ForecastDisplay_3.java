//Display(Observer) 3
package ch02.WeatherUtil;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay_3 implements Observer, DisplayElement {//Display 3 (기상 예보)
  private float currentTemp = 29.5f; //현재 온도
  private float lastTemp; //지난 온도

  public ForecastDisplay_3(Observable observable) {  observable.addObserver(this); } //Observable 추가 (내장 유틸)

  public void update (Observable obs, Object arg) { //Observer 내장 메서드
      if (obs instanceof WeatherData) {
        WeatherData weatherData = (WeatherData) obs;
        lastTemp = currentTemp;
        currentTemp = weatherData.getPressure();
        display();
      }
  }

  public void display() {
    System.out.println("[날씨 예보]");
    if (currentTemp > lastTemp)
      System.out.println("따뜻할 예정입니다");
    else if (currentTemp == lastTemp)
      System.out.println("기온이 같습니다");
    else if (currentTemp < lastTemp)
      System.out.println("추울 예정입니다");
    System.out.println();
  }
}