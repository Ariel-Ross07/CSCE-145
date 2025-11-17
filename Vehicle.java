//Ariel Ross
public class Vehicle {

    //instance variables for Vehicle Class
    private String manufacturerName;
    private int numOfCylinders;
    private String OwnerName;

    //constructors for vehicle class
    public Vehicle(){
        this.manufacturerName = "No name selected";
        this.numOfCylinders = 1;
        this.OwnerName = "No name selected";
    }

    public Vehicle(String xmanufacturer, int xcylinders, String xname){
        SetManufacturerName(xmanufacturer);
        SetNumOfCylinders(xcylinders);
        SetOwnerName(xname);
    }

    //accessors for vehicle class
    public String getManufacturerName(){
        return this.manufacturerName;
    }

    public int getNumOfCylinders(){
        return this.numOfCylinders;
    }

    public String getOwnerName(){
        return this.OwnerName;
    }

    //mutators for vehicle class
    public void SetManufacturerName(String xmanufacturer){
        if (xmanufacturer.equalsIgnoreCase("Nissan")
        || xmanufacturer.equalsIgnoreCase("Toyota")
        || xmanufacturer.equalsIgnoreCase("Ford")
        || xmanufacturer.equalsIgnoreCase("Honda")
        || xmanufacturer.equalsIgnoreCase("Chevy")){
            this.manufacturerName = xmanufacturer;
        } else {
            System.out.println("Invalid Manufacturer Name");
        }
    }

    public void SetNumOfCylinders(int xcylinders){
        if(xcylinders >=0){
            this.numOfCylinders = xcylinders;
        } else {
            System.out.println("Invalid number of cylinders");
        }
    }

    public void SetOwnerName(String xname){
        this.OwnerName = xname;
    }

    //other methodsn
    public boolean equals(Vehicle v){
        return v.getManufacturerName().equals(this.manufacturerName)
                && v.getNumOfCylinders() == this.numOfCylinders
                && v.getOwnerName().equals(this.OwnerName);
    }

    public String toString(){
        return "Manufacturer Name: "+this.manufacturerName+
                "\nNumber of Cylinders: "+this.numOfCylinders+
                "\nOwner Name: "+this.OwnerName;
    }
}
