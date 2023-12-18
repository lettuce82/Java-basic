package extends1.overriding;

public class ElectricCar extends Car {
    public void charge() {
        System.out.println("충전합니다.");
    }

    //@Override -> 없어도 됨 하지만 무-조건 씀
    //왜? 어노테이션 없이 작성시 클래스명 오타 등을 내면 부모의 기능에서 상속받아 사용하게 됨.
    //하지만 어노테이션으로 해놓으면 자바가 overding이 안 되어 있다는 것을 컴파일 오류로 알려줌
    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }
}
