/*
Date : 22.04.03
Title : Weather
Project : Observer pattern (java.util)
Name : 20183145 박상현
*/
package ch02.WeatherUtil;

public class Weather_Main {
    public static void main(String args[]){
        WeatherData weatherData = new WeatherData(); //날씨 데이터 객체 생성

        CurrentConditions_1 currentDisplay = new CurrentConditions_1(weatherData); //옵저버 1 생성
        StatisticsDisplay_2 statisticsDisplay = new StatisticsDisplay_2(weatherData); //옵저버 2 생성
        ForecastDisplay_3 forecastDisplay = new ForecastDisplay_3(weatherData); //옵저버 3 생성

        //값 설정
        weatherData.setMeasurements(30, 88, 33.2f);
        //weatherData.setMeasurements(17, 12, 11.1f);
        //weatherData.setMeasurements(24, 25, 16.0f);
    }
}
