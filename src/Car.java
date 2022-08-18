public abstract class Car {
    private String model, color;
    private int maxSpeed;

    public Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    public abstract void gas();
    public abstract void brake();

    public void setModel(String model){
        this.model = model;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    public String getColor(){
        return color;
    }
    public String getModel(){
        return model;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
}
