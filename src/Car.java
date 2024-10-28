public class Car {
    //Fields,Properties
    private String color;
    private String model;
    private double engine;
    public int doors;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
    public void setEngine(double engine) {
        this.engine = engine;
    }
    public double getEngine(){
        return this.engine;
    }
    public void setDoors(int doors) {
       if (doors==2||doors==4){
           this.doors=doors;
       }
       else{
           System.out.println("Kapı sayısı sadece 2 veya 4 olabilir");
       }
        this.doors = doors;
    }
    public int getDoors(){
        return this.doors;
    }
    public void start(){
        System.out.println("Car started");
    }
    public void stop(){
        System.out.println("Car stopped");
    }
}
