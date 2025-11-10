// Create a class Employee with(empNo ,salary and totalSalary)  with following 	features.
// Only parameterized constructor;
// totalSalary always represent total of all the salaries of all employees created.
// empNo should be auto incremented.
// display total employees and totalSalary using class method.
 
class Employee{
    private int empNo;
    private int salary;
    private static int totalSalary;
    private static int count = 0;

    public Employee(int salary){
        this.empNo = count+1;
        this.salary = salary;
        totalSalary += this.salary;
        count++;
    }

    public int totalSalary(){
        return totalSalary;
    }
    public int totalEmp(){
        return count;
    }

    public static void display()
    {
        System.out.println("Toatal employees are " + count + " and their total salary is " + totalSalary);
    }

}

class Test{
    public static void main(String args[]){
        Employee emp1 = new Employee(20000);
        Employee emp2 = new Employee(10000);
        Employee emp3 = new Employee(40000);
        Employee.display();

        // System.out.println(emp1.getEmpNo());

        System.out.println("Total salary is : "+emp1.totalSalary());
        System.out.println("Total Employee is "+emp1.totalEmp());
    }
}
