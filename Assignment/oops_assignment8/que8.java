//  Write a Java program to create class called "TrafficLight" with attributes for color and duration, and methods to change the color and check for red or green.

class TrafficLight{
    // Attributes
    private String color;            
    private int duration;

    // Contructor
    public TrafficLight(String color, int duration){
        this.color = color;
        this.duration = duration;
    }

    //  method to change color
    public void changeColor(String newColor, int newDuration){
     this.color = newColor;
     this.duration = newDuration;
      System.out.println("Traffic light changed to "+color+ " for " +duration+" seconds.");   
    }
    
    // Getter for color
    public String getColor(){
        return color;
    }

    // Getter for duration
    public int getDuration(){
        return duration;
    }

    // Method to check if light is red
    public boolean isRed(){
        return color.equals("Red");
    }

    // Method to check if light is green
    public boolean isGreen(){
        return color.equals("Green");
    }
}

class Test{
    public static void main(String args[]){
        TrafficLight traf = new TrafficLight("Red",45);

        // Display initial TrafficLight state
        System.out.println("Current Light : " +traf.getColor() + " || "+ "Duration : " +traf.getDuration() +" seconds");

        // Check if it is red and green
        if(traf.isRed()){
            System.out.println("Stop! The Light is Red.");
        }
        else if(traf.isGreen()){
            System.out.println("Go! The Light is Green");
        }

        // Change the color Red to Green
        traf.changeColor("Green",30);

        // Again we check the color of light
        if(traf.isRed()){
            System.out.println("Stop! The Light is Red.");
        }
        else if(traf.isGreen()){
            System.out.println("Go! The Light is Green");
        }
    }
}