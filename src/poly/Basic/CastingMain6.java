package poly.Basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);
        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        //Child 인스턴스인 경우 childMethod() 실행
        if (parent instanceof Child child) {
            System.out.println("Child 인스턴스 맞음");
            //Child child = (Child) parent; -> if 문 조건식 안에서 변수 선언하여 다운캐스팅 가능
            child.childMethod();
        } /* else {
            System.out.println("Child 인스턴스 아님");
        } */
    }
}
