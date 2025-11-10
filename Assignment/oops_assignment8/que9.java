// Write a Java program to create a class called "Employee" with a name, salary, and hire date attributes, and a method to calculate years of service.

// import java.time.LocalDate;
// import java.time.LocalTime;
// class Test{
//     public static void main(String args[]){
//     System.out.println(LocalDate.now());
//      System.out.println(LocalTime.now());
//     }
// }
class Employee{
    // Attributes
    private String name;
    private float salary;
    private int hireDate;

    // Constructor
    public Employee(String name, float salary, int hireDate){
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public int getHireDate(){
        return hireDate;
    }

    // Method to calculate years of service
    public void yearsOfService(){
        yearsOfService = 2025-hireDate;
        System.out.println(yearsOfService);
    }

}

class Test{
    public static void main(String args[]){
        Employee e = new Employee("Peehu",15.5000f,23);
        // e.Employee();
         System.out.println(e.yearsOfService());
    }
}

