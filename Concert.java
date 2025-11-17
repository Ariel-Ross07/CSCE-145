//ariel ross
public class Concert {

    // instance variables
    private String bandName;
    private int capacity;
    private double numTicketsSoldByPhone;
    private double numTicketsSoldByVenue;
    private double priceByPhone;
    private double priceAtVenue;

    //constructors
    public Concert() {
        this.bandName = "no name chosen";
        this.capacity = 0;
        this.numTicketsSoldByPhone = 0;
        this.numTicketsSoldByVenue = 0;
        this.priceByPhone = 0.0;
        this.priceAtVenue = 0.0;
    }

    public Concert(String xbandName, int xcapacity, double xpriceByPhone, double xpriceByVenue) {
        this.setBandName(xbandName);
        this.setCapacity(xcapacity);
        this.setPriceByPhone(xpriceByPhone);
        this.setPriceAtVenue(xpriceByVenue);
    }

    //accessors
    public String getBandName() {
        return this.bandName;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public double getNumTicketsSoldByPhone() {
        return this.numTicketsSoldByPhone;
    }

    public double getNumTicketsSoldAtVenue() {
        return this.numTicketsSoldByVenue;
    }

    public double getPriceByPhone() {
        return this.priceByPhone;
    }

    public double getPriceAtVenue() {
        return this.priceAtVenue;
    }

    //mutators
    public void setBandName(String xbandName) {
        this.bandName = xbandName;
    }

    public void setCapacity(int xcapacity) {
        if (xcapacity > 0) {
            this.capacity = xcapacity;
        } else {
            System.out.println("Invalid capacity!");
        }
    }

    public void setNumTicketsSoldByPhone(int xsoldByPhone) {
        if (xsoldByPhone > 0) {
            this.numTicketsSoldByPhone = xsoldByPhone;
        } else {
            System.out.println("Invalid ticket number!");
        }
    }

    public void setNumTicketsSoldByVenue(int xsoldByVenue) {
        if (xsoldByVenue > 0) {
            this.numTicketsSoldByVenue = xsoldByVenue;
        } else {
            System.out.println("Invalid ticket number!");
        }
    }

    public void setPriceByPhone(double xpriceByPhone) {
        if (xpriceByPhone > 0) {
            this.priceByPhone = xpriceByPhone;
        } else {
            System.out.println("Invalid price!");
        }
    }

    public void setPriceAtVenue(double xpriceAtVenue) {
        if (xpriceAtVenue > 0) {
            this.priceAtVenue = xpriceAtVenue;
        } else {
            System.out.println("Invalid price!");
        }
    }

    //others
    public double totalNumberOfTicketsSold() {
        return this.numTicketsSoldByPhone + this.numTicketsSoldByVenue;
    }

    public double ticketsRemaining() {
        return this.capacity - this.totalNumberOfTicketsSold();
    }

    public void buyTicketsAtVenue(int xvenueTickets) {
        if (xvenueTickets <= ticketsRemaining()) {
            setNumTicketsSoldByVenue(xvenueTickets);
        } else {
            System.out.println("Concert is sold out!");
        }
    }

    public void buyTicketsByPhone(int xphoneTickets) {
        if (xphoneTickets <= ticketsRemaining()) {
            setNumTicketsSoldByPhone(xphoneTickets);
        } else {
            System.out.println("Concert is sold out!");
        }
    }

    public double totalSales() {
        return (this.numTicketsSoldByVenue * this.priceAtVenue) + (this.numTicketsSoldByPhone * this.priceByPhone);
    }
}


