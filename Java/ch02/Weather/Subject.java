//Subject 주제 클래스

package ch02.Weather;

interface Subject {
  void registerObserver(Observer o) ; //옵저버 생성
  void removeObserver(Observer o) ; //옵저버 제거
  void notifyObservers() ; //옵저버 알림
}
