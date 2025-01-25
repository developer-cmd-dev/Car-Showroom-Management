public class Showroom implements utility {
    String showroomName;
    String showroomAddress;
    String managerName;
    String totalEmployee;
    int totalCars =0;

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

    }
}
