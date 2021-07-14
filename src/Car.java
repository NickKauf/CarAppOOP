public final class Car extends Vehicle {
    private Driver carDriver;

    public Car(){
        carDriver = new Driver();   //need an instance in each constructor
    }

    public Car(String color, String maker, String driverName, int driverAge){
        super(color, maker);   //use super in constructor to set inherited defaults
        carDriver = new Driver(driverName,driverAge); //need an instance in each constructor
    }

    public Car(String color, String maker){
        super(color, maker);   //use super in constructor to set inherited defaults
        carDriver = new Driver(); //need an instance in each constructor
    }


    public void setCarDriverName(String driverName){
        this.carDriver.setName(driverName);
    }
    public String getCarDriverName(){
        return carDriver.getName();
    }
    public void getCarDescription(){
        System.out.printf("A %s %s driven by %s\n",getColor(),getMaker(),getCarDriverName());
    }



}
