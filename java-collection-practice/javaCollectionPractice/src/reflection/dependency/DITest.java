package reflection.dependency;
public class DITest {

    public static void main(String[] args) throws Exception {

        Car car = DIContainer.createObject(Car.class);
        car.drive();
    }
}
