package final1;

public class FieldInit {
    static final int CONST_VALUE = 10; //static final : 상수 - 자바 관례상 대문자로 기입
    final int value = 10;

    public FieldInit() {
        //this.value = value; 컴파일 오류 발생 -> 이미 값이 할당되어 있기 때문에 생성자로도 값 할당 불가
    }
}
