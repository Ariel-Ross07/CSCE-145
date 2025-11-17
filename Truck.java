//ariel ross
//calls the parent class vehicle
public class Truck extends Vehicle{

    //instance variables specific to truck
    private double LoadCap;
    private double TowCap;

    //constructors
    public Truck(){
        super();
        this.LoadCap = 0.0;
        this.TowCap = 0.0;
    }

    //calls the parent class for the parameterized constructor
    public Truck(String xmanufacturer, int xcylinders, String xname, double xload, double xtow){
        super(xmanufacturer, xcylinders, xname);
        setLoadCap(xload);
        setTowCap(xtow);
    }

    //accessors for the truck variables
    public double getLoadCap(){
        return this.LoadCap;
    }

    public double getTowCap(){
        return this.TowCap;
    }

    //mutators for the truck variables
    public void setLoadCap(double xload){
        if(xload >= 0){
            this.LoadCap = xload;
        } else {
            System.out.println("Invalid Load Capacity");
        }
    }

    public void setTowCap(double xtow){
        if(xtow >= 0){
            this.TowCap = xtow;
        }else{
            System.out.println("Invalid Tow Capacity");
        }
    }

    //overriding equals method, and toString method
    public boolean equals(Truck t){
        return t != null && super.equals(t)
                && t.getLoadCap() == this.LoadCap
                && t.getTowCap() == this.TowCap;
    }

    public String toString(){
        return super.toString()+"Load Cap: "+this.LoadCap+"\nTow Cap: "+this.TowCap;
    }
}
