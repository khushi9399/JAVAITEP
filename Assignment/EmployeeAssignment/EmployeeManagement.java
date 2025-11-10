import java.util.ArrayList;
class EmployeeManagement{
    private ArrayList<Employee> employees;
    public EmployeeManagement(){
      employees = new ArrayList<Employee>();
    }

    public addEmployee(String name, double salary, String address){
      Employee e = new Employee(name, salary, address);
      employee.add(e);
    }

    public void removeEmployee(int id){
        for(Employee e : employees){
            if(id == getId()){
                employee.remove(e);
            }
        }
    }
}
  