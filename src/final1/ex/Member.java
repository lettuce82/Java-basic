package final1.ex;

public class Member {
    private final String id; //final 키워드 사용
    private String name;

    public Member(String id, String name) {
        this.id = id; //생성자로 final 변수에 값을 초기화하기 때문에 이후로 재정의 불가능 / 하단 참조
        this.name = name;
    }

    public void changeData(String name) {
        //this.id = id; //컴파일 오류 발생
        this.name = name;
    }

    public void print() {
        System.out.println("id: " + id + " name: " + name);
    }
}
