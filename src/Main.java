import java.util.Scanner;

interface utility{
   public void get_details();
    public void set_details();
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static public void mainMenu(){
        Scanner sc  = new Scanner(System.in);
        int count = 100;
        while(count !=0){
            System.out.println("==========**** Choose Number of Options ****==========");
            System.out.println("1. Add showroom");
            System.out.println("2. Add Employee");
            System.out.println("3. Add Car");
            System.out.println("4. Get Showroom");
            System.out.println("5. Get Employees");
            System.out.println("6. Get Cars");
            System.out.println("======Enter 0 to exit======");
            count = sc.nextInt();
        }



    }


    public static void main(String[] args) {
        System.out.println("==========**** Welcome to Showroom Management Service ****==========");

        mainMenu();
    }
}