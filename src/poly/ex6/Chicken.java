package poly.ex6;

public class Chicken extends AbstractAnimal implements Fly{
    @Override
    public void Fly() {
        System.out.println("닭 날기");
    }

    @Override
    public void sound() {
        System.out.println("꼬끼오");
    }
}
