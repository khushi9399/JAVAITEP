class Student{
    private String name;
    private double mathMarks;
    private double scienceMarks;

    public void setName(String name){
        this.name=name;

    }
     public void setMathMarks(double mathMarks){
        this.mathMarks=mathMarks;

    }
    public void setScienceMarks(double scienceMarks){
        this.scienceMarks=scienceMarks;

    }
    public void display(){
        System.out.println("Name of Student = "+name);
         System.out.println("Marks in Maths = "+mathMarks);
         System.out.println("Marks in Science = "+scienceMarks);
    }
    public void getAverage(){
        // double subjectAverage = (mathMarks+scienceMarks)/2;
        // System.out.println("Average of subjects is : " +subjectAverage);
        System.out.println("Average of subjects is : "+((mathMarks + scienceMarks)/2));              
    }
}
class Test{
    public static void main(String args[]){
        Student s=new Student();
        s.setName("Rahul");
        s.setMathMarks(85.4);
        s.setScienceMarks(90);
        s.display();
        s.getAverage();
    }
}