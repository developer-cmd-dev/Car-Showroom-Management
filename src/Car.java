import java.util.Scanner;

public class Car extends Showroom implements utility{
    String carName;
    String model;
    int mileage;
    int cc;
    Scanner sc = new Scanner(System.in);

    @Override
    public void get_details() {
        System.out.println("Car name: "+carName);
        System.out.println("Car Model: "+model);
        System.out.println("Car Mileage: "+mileage);
        System.out.println("Car Cc: "+cc);
        System.out.println("Showroom name: "+showroomName);
    }

    @Override
    public void set_details() {
        System.out.println("Enter car name: ");
        carName = sc.nextLine();
        System.out.println("Enter Model name: ");
        model = sc.nextLine();
        System.out.println("Enter Mileage: ");
        mileage = sc.nextInt();
        System.out.println("Enter Cc: ");
        cc = sc.nextInt();

    }
}
