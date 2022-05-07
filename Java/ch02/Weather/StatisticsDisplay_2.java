//Display(Observer) 2
package ch02.Weather;

class StatisticsDisplay_2 implements Observer, DisplayElement { //Display 2 (날씨 통계)
  private float maxTemp = 0.0f;
  private float minTemp = 100.0f;
  private float sumTemp = 0.0f;
  private float avgTemp = 0.0f;
  private float count = 0.0f;

  private WeatherData weatherData;

  public StatisticsDisplay_2(WeatherData weatherData) { //생성자
    this.weatherData = weatherData;
    weatherData.registerObserver(this); //observer 생성
  }

  public  void update(float temp, float humidity, float pressure) {
    sumTemp += temp;
    count++;
    avgTemp = sumTemp/count;
    if(temp>maxTemp)
      maxTemp = temp;
    if(temp>minTemp)
      minTemp = temp;
    display();
  }

  public void display() {
    System.out.println("[날씨 통계]");
    System.out.println("최고 온도 : "+ maxTemp);
    System.out.println("최저 온도 : " + minTemp);
    System.out.println("평균 온도 : " + avgTemp + "\n");
  }
}
