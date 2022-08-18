public class Minivan extends Car{
    @Override
    public void gas(){
        System.out.println(getModel() + " started speeding up");
    }
    @Override
    public void brake(){
        System.out.println(getModel() + " stopped!");
    }
    public Minivan(String model, String color, int maxSpeed){
        super(model, color, maxSpeed);
    }
}
