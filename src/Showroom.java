import java.util.Scanner;

public class Showroom implements utility {
    String showroomName;
    String showroomAddress;
    String managerName;
    String totalEmployee;
    int totalCars =0;
    Scanner sc;

    Showroom(){
    sc = new Scanner(System.in);
    }

    @Override
    public void get_details() {
        System.out.println("Showroom Name: "+showroomName);
        System.out.println("Showroom address: "+showroomAddress);
        System.out.println("Manager Name: "+managerName);
        System.out.println("Total Employee: "+totalEmployee);
        System.out.println("Total Cars: "+totalCars);
    }

    @Override
    public void set_details() {
        System.out.println("Enter Showroom Name: ");
        showroomName = sc.nextLine();
        System.out.println("Enter Showroom Address: ");
        showroomAddress = sc.nextLine();
        System.out.println("Enter Manager Name: ");
        managerName = sc.nextLine();
        System.out.println("Enter Total Employees");
        totalEmployee = sc.nextLine();
        System.out.println("Enter Total Cars");
        totalCars = sc.nextInt();

    }
}
