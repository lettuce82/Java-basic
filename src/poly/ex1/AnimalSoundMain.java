package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Cow cow1 = new Cow();
        Cow cow2 = new Cow();
        Cow cow3 = new Cow();

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        //Cow[] cowArr = {dog, cat, cow}; 불가 -> 타입이 다르기 때문 -> 2. 배열 및 for문 사용 불가
        //같은 타입이라면 가능
        Cow[] cowArr = {cow1, cow2, cow3};

        soundCow(cat);
        soundCow(cow);
    }
    private static void soundCow(Cat cat) { //1. 메서드로 해결 불가
        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");
    }
    private static void soundCow(Cow cow) {
        System.out.println("동물 소리 테스트 시작");
        cow.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
