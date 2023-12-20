package reClass1;

/*
    Student 타입의 변수에 데이터를 입력하는 메서드와 출력하는 메서드
*/
public class ClassStart3Ref1 {
    public static void main(String[] args) {
        //기본형 타입 변수와 메서드 -> 값 변경이 되지 않은 상태로 출력됨
        int basicType = 1;
        initBasicType(basicType);
        printBasicType(basicType);

        //참조형 타입 변수와 메서드 -> 값 변경 및 출력됨
        Student student1 = new Student();
        initStudent(student1, "학생1", 18, 100);

        printStudent(student1);
    }

    static void initBasicType(int basicType) {
        basicType = 2;
        System.out.println(basicType);
    }

    static void printBasicType(int basicType) {
        System.out.println("기본형 타입: " + basicType);
    }
    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    static void printStudent(Student student) {
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
    }


}
