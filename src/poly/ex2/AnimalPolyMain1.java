package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);

    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound(); //메서드 오버라이딩 됐기 때문에 우선권을 가진 오버라이딩 된 자식 클래스에 있는 코드가 실행됨
        System.out.println("동물 소리 테스트 종료");
    }
}
