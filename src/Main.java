import java.sql.SQLOutput;
import java.util.Scanner;

interface utility{
   public void get_details();
    public void set_details();
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static public void mainMenu(){
        System.out.println("==========**** Welcome to Showroom Management Service ****==========");
        System.out.println("1].ADD SHOWROOM \t\t\t 2].ADD EMPLOYEE \t\t\t 3].ADD CARS");
        System.out.println("4].GET SHOWROOM \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET CARS");
        System.out.println();
        System.out.println("===========*** Enter 0 to Exit ***==========");




    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom showroom[]= new Showroom[5];
        Employee employee[]= new Employee[5];
        Car cars[]= new Car[5];
        int carCounter = 0;
        int showroomCounter = 0;
        int employeesCounter = 0;
        int choice = 100;
        while(choice !=0){
            mainMenu();
            choice = sc.nextInt();
            while (choice != 9 && choice !=0 ){
                switch (choice){
                    case 1:
                        showroom[showroomCounter] = new Showroom();
                        showroom[showroomCounter].set_details();
                        showroomCounter++;
                        System.out.println();
                        System.out.println("1]. Add New ShowRoom.");
                        System.out.println("9]. Go back to main menu.");
                        choice = sc.nextInt();
                        break;

                    case 4:
                        System.out.println(showroomCounter);
                        for (int i = 0; i <showroomCounter ; i++) {
                            showroom[i].get_details();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("1]. Add New ShowRoom.");
                        System.out.println("9]. Go back to main menu.");
                        choice = sc.nextInt();
                        break;
                }
            }
        }


    }
}