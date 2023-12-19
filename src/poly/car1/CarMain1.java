package poly.car1;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        //차량 선택(k3)
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.dirve();

        //차량 변경(k3 -> model3)
        Model3 model3 = new Model3();
        driver.setCar(model3);
        driver.dirve();

        //차량 변경(model3 -> newCar)
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.dirve();
    }
}
