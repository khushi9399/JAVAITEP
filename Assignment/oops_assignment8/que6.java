//  Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.
class Employee{
    private String name;
    private String jobTitle;
    private float salary;

    public Employee(String name, String jobTitle, float salary){
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public void setSalary(float salary){
        this.salary = salary;
    }
    // public String getName(){
    //     return this.name;
    // }
    public float getSalary(){
        return this.salary;
    }
}
class Test{
    public static void main(String args[]){
    Employee e = new Employee("Rohan","HR",10000f);
    e.setSalary(12000f);
    System.out.println(e.getSalary());
    // System.out.println(e.getName());
    }
}