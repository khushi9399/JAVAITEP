// Make list of Students having name, roll no., age, score. Write a program to accept 10 students record and arrange the Students based on the score group [0-50], [50-65],[65-80],[80-100].
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String name;
    private int rollNo;
    private int age;
    private double score;

    public Student(String name, int rollNo, int age, double score) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }

    public void display() {
        System.out.printf("Name: %s, Roll No: %d, Age: %d, Score: %.2f\n", name, rollNo, age, score);
    }
}

class StudentGrouping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter details for Student " + i);

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Roll No: ");
            int rollNo = Integer.parseInt(scanner.nextLine());

            System.out.print("Age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Score: ");
            double score = Double.parseDouble(scanner.nextLine());

            students.add(new Student(name, rollNo, age, score));
            System.out.println();
        }

        List<Student> group0to50 = new ArrayList<>();
        List<Student> group50to65 = new ArrayList<>();
        List<Student> group65to80 = new ArrayList<>();
        List<Student> group80to100 = new ArrayList<>();

        for (Student s : students) {
            double score = s.getScore();

            if (score >= 0 && score < 50) {
                group0to50.add(s);
            } else if (score >= 50 && score < 65) {
                group50to65.add(s);
            } else if (score >= 65 && score < 80) {
                group65to80.add(s);
            } else if (score >= 80 && score <= 100) {
                group80to100.add(s);
            } else {
                System.out.println("Warning: Score out of valid range for student: " + s.getName());
            }
        }

        System.out.println("\nStudents with scores in [0-50):");
         for (Student s : group0to50) 
                s.display();

        System.out.println("\nStudents with scores in [50-65):");
          for (Student s : group50to65) 
               s.display();

        System.out.println("\nStudents with scores in [65-80):");
          for (Student s : group65to80)  
              s.display();

        System.out.println("\nStudents with scores in [80-100]:");
          for (Student s : group80to100)  
              s.display();

        scanner.close();

       
    }
}
