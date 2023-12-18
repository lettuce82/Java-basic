package poly.Basic;

//다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        //Child child = parent1; 컴파일 오류 발생
        Child child = (Child) parent1; //다운캐스팅
        child.childMethod(); //문제없음

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; //런타임 오류 발생 (캐스팅 불가 오류) - ClassCastException
        child2.childMethod(); //실행 안 됨
    }
}
