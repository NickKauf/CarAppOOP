import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        ArrayList<Car> garage = new ArrayList<>();
        Scanner kb = new Scanner(System.in);
        Car car1 = new Car("red", "ford", "steve", 53);
        Car car2 = new Car("blue", "honda", "emily", 34);
        car1.start();
        car2.start();
        car1.accelerate();
        car2.accelerate();
        car1.setSpeed(80);
        car2.setSpeed(103);
        car1.stop();


        System.out.printf("the %s %s is being driven by %s\n", car1.getColor(), car1.getMaker(), car1.getCarDriverName());
        System.out.printf("the %s %s is being driven by %s\n", car2.getColor(), car2.getMaker(), car2.getCarDriverName());

        garage.add(car1);
        garage.add(car2);


        System.out.println("Add a car to the garage:");
        System.out.println("what is the color of the car?");
        String input1 = kb.nextLine();
        System.out.println("what is the maker of the car?");
        String input2 = kb.nextLine();
        System.out.println("what is the driver's name?");
        String input3 = kb.nextLine();
        System.out.println("what is the driver's age?");
        int input4 = kb.nextInt();
        Car inputCar = new Car(input1,input2,input3,input4);
        garage.add(inputCar);
        System.out.println("the garage now contains: ");
        for(Car car: garage){
            car.getCarDescription();
        }















    }
}
