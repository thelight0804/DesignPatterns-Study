/*
Title : Duck
Project : Strategy pattern
Name : 20183145 박상현
*/

package ch01.Duck;

public class MainClass {
    public static void main(String[] args) {
        //오리를 기반으로 된 여러 오리 생성
        Duck mallardDuck = new MallardDuck(); //청둥오리
        Duck redheadDuck = new RedheadDuck(); //빨간 오리
        Duck rubberDuck = new RubberDuck(); //고무 오리
        Duck decoyDuck = new DecoyDuck(); //가짜 오리

        //청둥 오리 행동
        mallardDuck.performFly("Mallard Duck");
        mallardDuck.performQuack("Mallard Duck");

        //빨간 오리 행동
        redheadDuck.performFly("redhead Duck");
        redheadDuck.performQuack("redhead Duck");

        //고무 오리 행동
        rubberDuck.performFly("rubber Duck");
        rubberDuck.performQuack("rubber Duck");

        //가짜 오리 행동
        decoyDuck.performFly("decoy Duck");
        decoyDuck.performQuack("decoy Duck");
    }
}