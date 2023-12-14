package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(); //참조형
        //data = new Data(); final로 참조형 변수를 만들었기 때문에 참조값을 재정의할 수 없음

        //참조 대상의 값은 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
