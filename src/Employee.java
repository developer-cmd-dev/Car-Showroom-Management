import java.util.Scanner;

public class Employee extends Showroom implements utility {
    String employeeName;
    int age;
    float salary;
    Scanner sc;
    Employee(){
    sc = new Scanner(System.in);
    }
    @Override
    public void get_details() {
        System.out.println("Employee name: "+employeeName);
        System.out.println("Employee Age: "+age);
        System.out.println("Employee Salary: "+salary);
        System.out.println("Showroom name: "+showroomName);
    }

    @Override
    public void set_details() {
        System.out.println("Enter Employee name: ");
        employeeName = sc.nextLine();
        System.out.println("Enter Employee Age: ");
        age = sc.nextInt();
        System.out.println("Enter Employee Salary: ");
        salary = sc.nextInt();
    }
}
