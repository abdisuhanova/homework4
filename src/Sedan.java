public class Sedan extends Car{
    @Override
    public void gas(){
        System.out.println(getModel() + " started speeding up");
    }
    @Override
    public void brake(){
        System.out.println(getModel() + " stopped!");
    }
    public Sedan(String model, String color, int maxSpeed){
        super(model, color, maxSpeed);
    }
}
