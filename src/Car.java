public class Car extends Vehicle{

    private String registration; 
    private byte colour; 
    private boolean broken; 

    public final static byte BLACK=1; 
    public final static byte WHITE=2; 
    public final static byte BLUE=3; 
    public final static byte RED=4; 
    public final static byte GREEN=5; 

    private final static double ADMIN_FEE = 3; 

    public Car(){
        super();
    }

    public double pay(int hours){
        return super.pay(hours) + hours;
    }
}
