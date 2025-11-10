public class Employee {
    private int id;
    private String name;
    private double salary;
    private String address;
    static int count = 0;
    
    public Employee(){};    //Default Constructor
    
    public Employee(int id, String name, double salary, String address){
        this.id = ++count;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
    
     public void setName(String name){    //Setter
        this.name = name;
    }
     
    public void setSalary(double id){
        this.salary = salary;
    } 
    
    public void setAddress(int address){
        this.address = address;
    }
    
    public int getId(){                   //Getter
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getSalary(){
        return this.salary;
    }
    
    public String getAddress(){
        return this.address;
    
    }
}

class Test{
    public static void main(String args[]){
        EmployeeManagement em = new EmployeeManagement();
        // em.add("Khushi", 50000, "Jabalpur");
        // em.add("Ansh", 100000, "Kareli");
        // em.add("Kanan", 40000, "Pipariya");
        // em.add("Anisha", 55000, "Maheswar");
        // em.add("Shiva", 36000, "Narshingpur");
        // em.add("Shree", 20000, "Indore");

        File file = new File("employee.txt");
        if(file.exists()){
            FileOutStream fout = new FileOutStream(file);
        }
        else{
            System.out.println("File does not exists");
            try{
                file.createNewFile();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        
        
    }
}

