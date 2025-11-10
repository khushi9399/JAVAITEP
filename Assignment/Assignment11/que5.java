abstract class Appliances{
    private String name;
    private String power;

    public Appliances(String name, String power){
        this.name = name;
        this.power = power;
    }

    abstract void turnOn();
    abstract void turnOff();

    public void showStatus(){
        System.out.println("Show the Status of Appliances--"+name+" , "+power);
    }
}

interface SmartDevice{
   public void connectWifi();
}

class Fan extends Appliances{
    public Fan(String name, String power){
        super(name,power);
    }

    public void turnOn(){
        System.out.println("Fan is On");
    }

    public void turnOff(){
        System.out.println("Fan is Off");
    }
}

class Light extends Appliances implements SmartDevice{
    public Light(String name, String power){
        super(name,power);
    }

    public void turnOn(){
        System.out.println("Light is On");
    }

    public void turnOff(){
        System.out.println("Light is Off");
    }

    public void connectWifi(){
        System.out.println("Wifi is connected");
    }
}

class WashingMachine extends Appliances implements SmartDevice{
    public WashingMachine(String name, String power){
        super(name,power);
    }

    public void turnOn(){
        System.out.println("Washing Machine is On");
    }

    public void turnOff(){
        System.out.println("Washing Machine is Off");
    }

    public void connectWifi(){
        System.out.println("Wifi is connected");
    }
}

class Test{
    public static void main(String args[]){
        Fan f = new Fan("Anupriya","Power1");
        f.showStatus();
        f.turnOn();
        f.turnOff();

        System.out.println();

        Light l  = new Light("khushi","Power2");
        l.showStatus();
        l.turnOn();
        l.turnOff();
        l.connectWifi();

        System.out.println();
  
        WashingMachine wm = new WashingMachine("Anisha", "Power3");
        wm.showStatus();
        wm.turnOn();
        wm.turnOff();
        wm.connectWifi();
       
    }
}