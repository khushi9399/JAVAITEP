class Time{
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours,int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public Time(){
         this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }
    public int getHours(){
        return hours;
    }
    public int getMinutes(){
        return minutes;
    }
    public int getSeconds(){
        return seconds;
    }
    public void display(){
          System.out.print("Hours "+ this.hours + "\n Minutes "+ this.minutes + "\n Seconds "+ this.seconds);
    }
    public Time add(Time t2 ){
        Time t = new Time();
        t.hours = this.hours + t2.hours;
        t.minutes = this.minutes + t2.minutes;
        t.seconds = this.seconds + t2.seconds;
       return t;
    }
}
class Test{
    public static void main(String args[]){
       Time t1 = new Time(5,20,10);
       Time t2 = new Time(5,20,10);
       Time TotalTime = t1.add(t2);
       TotalTime.display();
    //    System.out.print(result.getHours()+ " "+ result.getMinutes()+ " "+ result.getSeconds());
    }
}
