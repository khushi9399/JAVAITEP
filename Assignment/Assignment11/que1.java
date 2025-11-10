abstract class Vehicle{
    String registrationNumber;
    abstract public void start();                //Abstract Method
    abstract public void stop();                 //Abstract Method
    
    public Vehicle(String registrationNumber){    //Constructor
        this.registrationNumber = registrationNumber;
    }

    public void displayInfo(){
        System.out.println("Registration number is : "+this.registrationNumber);
     }
}

    class Car extends Vehicle{                        //Fuel based
       public Car(String registrationNumber){         //Constructor
        super(registrationNumber);
       }
       public void start(){
            System.out.println("Car " +registrationNumber+ " starting with petrol engine...");
       }
       public void stop(){
        System.out.println("Car " +registrationNumber+ " stopped");
       }
    }

    class Truck extends Vehicle{        //Fuel based
        public Truck(String registrationNumber){
            super(registrationNumber);
        }
        public void start(){
            System.out.println("Truck " +registrationNumber+  " starting with diesel engine...");
        }
        public void stop(){
            System.out.println("Truck " +registrationNumber+ " stopped.");
        }
     }

    interface Chargeable{                     // Interface          
        void ChargeBattery();
     }
    
    class ElectricBike extends Vehicle implements Chargeable{         //Chargeable
        public ElectricBike(String registrationNumber){
        super(registrationNumber);
       }
         public void start(){
            System.out.println("Electricbike " +registrationNumber+ " starting silently...");
        }
        public void stop(){
            System.out.println("Electricbike" +registrationNumber+ " stopped");
        }
        public void ChargeBattery(){
            System.out.println("Electric Bike " +registrationNumber+ " battery charging...");
        }
    }
    
    class ElectricCar extends Vehicle implements Chargeable{          //Chargeable
        public ElectricCar(String registrationNumber){
        super(registrationNumber);
       }
        public void start(){
            System.out.println("ElectricCar" +registrationNumber+  " starting silently...");
        }
         public void stop(){
            System.out.println("Electricbike" +registrationNumber+ " stopped");
        }
        public void ChargeBattery(){
            System.out.println("Electric Bike " +registrationNumber+ " battery charging...");
        }
    }


 class TransportSystem{
    public static void main(String args[]){
      Car c = new Car("KA01AB1234");
      c.start();
      c.stop();

      Truck t = new Truck("KA02XY9876");
      t.start();
      t.stop();

      ElectricBike eb = new ElectricBike("KA03EL5678");
      eb.start();
      eb.stop();
      eb.ChargeBattery();

      ElectricCar ec = new ElectricCar("KA04EV4321");
      ec.start();
      ec.stop();
      ec.ChargeBattery();

      System.out.println("-------------------------");    // for achieving Runtime Binding
      Vehicle vv = new ElectricBike("hhh2222dd");
      Chargeable cc = ( Chargeable) vv;
      vv.start();
      cc.ChargeBattery();
      vv.stop();

    }
 }