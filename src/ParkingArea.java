public class ParkingArea {
    private Vehicle vehicles[]; 
    private String name; 

    ParkingArea(String name, int capacity) { 
        this.name = name; 

        if (capacity == 300) {
            capacity = 300; 
            this.vehicles = new Vehicle[capacity]; 

        }
    } 
  
    String getName() { 
        return name; 
    } 

    public int getCapacity() { 
        return vehicles.length; 
    } 

    public int findVehicle(String reg) { 

    //find where the vehicle is located in the array and 
    //return the index not yet written 
        int len = vehicles.length;
        for(int i = 0; i < len; i++){
            if(vehicles[i].getRegistration().equals(reg)) return i;
        }
        return -1;
    } 

    public int addVehicle(Vehicle v){
        int len = vehicles.length;
        for(int i = 0; i<len; i++){
            if(vehicles[i] == null){
                vehicles[i] = v;
                return i;
            }
        }
        return -1;
    }

} 
