//Display(Observer) 1
package ch02.Weather;

class CurrentConditions_1 implements Observer, DisplayElement { //Display 1 (현재 날씨)
  private float temp;
  private float humidity;
  private float pressure;
  private Subject weatherData;

  public CurrentConditions_1(WeatherData weatherData) { //생성자
    this.weatherData = weatherData;
    weatherData.registerObserver(this); //observer 생성
  }

  public void update(float temp, float humidity, float pressure) {
    this.temp = temp;
    this.humidity = humidity;
    this.pressure = pressure;
    display();
  }

  public void display() {
    System.out.println("[현재 날씨]");
    System.out.println("온도 : "+temp);
    System.out.println("습도 : " + humidity);
    System.out.println("기압 : " + pressure + "\n");
  }
}
