//Display(Observer) 3
package ch02.Weather;

class ForecastDisplay_3 implements Observer, DisplayElement {//Display 3 (기상 예보)
  private float currentTemp = 29.5f; //현재 온도
  private float lastTemp; //지난 온도
  private WeatherData weatherData;

  public ForecastDisplay_3(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this); //observer 생성
  }

  public void update(float temp, float humidity, float pressure) {
    lastTemp = currentTemp;
    currentTemp = temp;
    display();
  }

  public void display() {
    System.out.println("[날씨 예보]");
    if (currentTemp > lastTemp)
      System.out.println("따뜻할 예정입니다");
    else if (currentTemp == lastTemp)
      System.out.println("기온이 같습니다");
    else if (currentTemp < lastTemp)
      System.out.println("추울 예정입니다");
  }
}
