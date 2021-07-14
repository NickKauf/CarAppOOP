public abstract class Vehicle {
    private String color;
    private String maker;

    public Vehicle(){    //default constructor

    }

    public Vehicle(String color, String maker){    //overloaded constructor
        this.color = color;
        this.maker = maker;
    }
            //getters and setters
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaker(){
        return this.maker;
    }

    public void setMaker(){
        this.maker = maker;
    }

    //methods
    public void setSpeed (int speed){
        System.out.printf("the %s %s is going %d mph.\n", this.color, this.maker, speed);
    }

    public void accelerate(){
        System.out.printf("the %s %s is accelerating.\n", this.color, this.maker);
    }

    public void start(){
        System.out.printf("the %s %s is starting.\n", this.color, this.maker);
    }

    public void stop(){
        System.out.printf("the %s %s is stopped.\n", this.color, this.maker);
    }



}
