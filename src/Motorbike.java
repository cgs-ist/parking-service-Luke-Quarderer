public class Motorbike extends Vehicle{
    private String registration; 
    private byte colour; 
    private boolean broken; 

    public final static byte BLACK=1; 
    public final static byte WHITE=2; 
    public final static byte BLUE=3; 
    public final static byte RED=4; 
    public final static byte GREEN=5; 

    private final static double ADMIN_FEE = 3; 

    public Motorbike(){
        super();
    }

}
