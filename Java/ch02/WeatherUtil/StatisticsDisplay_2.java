//Display(Observer) 2

package ch02.WeatherUtil;

import java.util.Observable;
import java.util.Observer;


public class StatisticsDisplay_2 implements Observer, DisplayElement { //Display 2 (날씨 통계)
    private float maxTemp = 0.0f;
    private float minTemp = 100.0f;
    private float sumTemp = 0.0f;
    private float avgTemp = 0.0f;
    private float count = 0.0f;

    public StatisticsDisplay_2(Observable observable) { //생성자
        observable.addObserver(this); //Observable 추가 (내장 유틸)
    }

    public void update(Observable obs, Object arg) { //Observer 내장 메서드
        count++;
        avgTemp = sumTemp/count;
        if (obs instanceof WeatherData) { //WeatherData인지 확인한다 (내장 객체는 가끔 다른 데이터가 넘어올 수 있다
            WeatherData weatherData = (WeatherData) obs;
            float temp = weatherData.getTemp();
            sumTemp += temp;
            if (temp > maxTemp)
                maxTemp = temp;
            if (temp < minTemp)
                minTemp = temp;
        }
        display();
    }

    public void display() {
        System.out.println("[날씨 통계]");
        System.out.println("최고 온도 : " + maxTemp);
        System.out.println("최저 온도 : " + minTemp);
        System.out.println("평균 온도 : " + avgTemp + "\n");
    }
}