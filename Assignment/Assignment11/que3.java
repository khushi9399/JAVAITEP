abstract class Course{
    private String title;
    private float duration;

    public Course(String title, float duration){     //Constructor
        this.title = title;
        this.duration = duration;
    }

    abstract void startCourse();
    abstract void endCourse();

    public void courseDetails(){
        System.out.println("Here is the details");
    }
}

interface  CertificateProvider{
      void generateCertificate();
}

class VideoCourse extends Course implements CertificateProvider{
    public VideoCourse(String title, float duration){
        super(title,duration);
    }

    public void startCourse(){
        System.out.println("Course is start..");
    }
    public void endCourse(){
        System.out.println("Course is end...");
    }
    public void generateCertificate(){
        System.out.println("Generate Certificate..");
    }
} 

class LiveCourse extends Course{
     public LiveCourse(String title, float duration){
        super(title,duration);
    }

    public void startCourse(){
        System.out.println("Start..");
    }
    public void endCourse(){
        System.out.println("End..");
    }
}

class Test{
    public static void main(String args[]){
        VideoCourse vc = new VideoCourse("Java",2);
        vc.startCourse();
        vc.endCourse();
        vc.generateCertificate();
        LiveCourse lc = new LiveCourse("Java Advance",3);
        lc.startCourse();
        lc.endCourse();
    }
}