public class Vehicle { 

    private String registration; 
    private byte colour; 
    private boolean broken; 

    public final static byte BLACK=1; 
    public final static byte WHITE=2; 
    public final static byte BLUE=3; 
    public final static byte RED=4; 
    public final static byte GREEN=5; 

    private final static double ADMIN_FEE = 3; 

    public Vehicle() {
        
    } 

    public Vehicle(String registration) { 
        this.registration = registration; 
    } 

    public Vehicle(String registration, byte colour) { 
        this.registration = registration; 
        this.colour = colour; 
    } 

    public void setBroken(boolean broken) { 
        this.broken = broken; 
    } 

    public void setColour(byte colour) { 
        this.colour = colour; 

    } 

    public boolean getBroken() { 
        return broken; 
    } 

    public String getRegistration() { 
        return registration; 
    } 

    public double pay(int hours) { 

    // code to return admin fee - only if applicable 
        if(hours<=5) return ADMIN_FEE;
        return 0;

    } 

} 
