abstract class Employee{
    private int id;
    private String name;
    private float salary;

    public Employee(int id, String name, float salary){        //1st Constructor
        this.id = id;
        this.name = name; 
        this.salary = salary;
    }

    public Employee(int id, String name){                   //2nd Constructor
        this.id = id;
        this.name = name;
    }

    abstract public void calculateSalary();

    public void showDetails(){
        System.out.println("Id of employee : "+this.id);
        System.out.println("Name of employee :"+this.name);
    }

    public void setSalary(float salary){               //Setter
         this.salary = salary;
    }
    public float getSalary(){                         //Getter
        return salary;
    }
}

interface BonusEligible{         //Interface
     void giveBonus();
}

class FullTimeEmployee extends Employee implements BonusEligible{
    private float bonus;
    
    public FullTimeEmployee(int id, String name, float salary){
        super(id,name,salary);
    }
  
    public void giveBonus(){
        System.out.println("Congratulations!! You got Bonus. ");
        this.bonus = 5000;
    }

    public void calculateSalary(){
        System.out.println("Salary Before Bonus.."+this.getSalary());
        System.out.println("Salary with Bonus.."+(this.getSalary()+this.bonus));
    }
}
class PartTimeEmployee extends Employee implements BonusEligible{
    private int hours;
    private int rate;
    private float bonus;
    public PartTimeEmployee(int id, String name, int hours, int rate){
        super(id,name);
        this.hours = hours;
        this.rate = rate;
    }
    
    public void giveBonus(){
        System.out.println("Congratulations!! You got Bonus. ");
        this.bonus = 2000;
    }

    public void calculateSalary(){
        this.setSalary(hours * rate);
        System.out.println("Salary before bonus.."+this.getSalary());
        System.out.println("Salary with bonus.."+(this.getSalary()+this.bonus));
    }

}

class Intern extends Employee{                                //Intern class
    public Intern(int id, String name, float salary){
        super(id,name,salary);
    }

    public void calculateSalary(){
    System.out.println("Your Stipend is "+this.getSalary());
    }
}

class Test{
    public static void main(String args[]){
        FullTimeEmployee fte = new FullTimeEmployee(101,"Khushi",10000);
        fte.showDetails();
        fte.giveBonus();
        fte.calculateSalary();

        System.out.println();

        PartTimeEmployee pte = new PartTimeEmployee(102,"Kanan",2,4000);
        pte.showDetails();
        pte.giveBonus();
        pte.calculateSalary();

        System.out.println();

        Intern i = new Intern(103,"Sana",4000);
        i.showDetails();
        i.calculateSalary();
    }
}