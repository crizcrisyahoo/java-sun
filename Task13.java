public class Task13 {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.displayDetails();
    }    
}

class Vehicle{
    String make;
    String model;
    int year;

    public void displayDetails(){
        make = "Toyota";
        model = "camry";
        year = 2022;
        System.out.println("Make: " + make + "\n" +
                            "Model: " + model + "\n" +
                            "Year: " + make);
    }
}
 
class Car extends Vehicle{
    int numberOfDoors = 4;

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number Of Doors: " + numberOfDoors);
    }
}