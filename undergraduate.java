public class undergraduate extends student {
    private int level;
    private String minor;

    public undergraduate() {
        super();
        this.level = 1;
        this.minor = "no minor selected";
    }

    public undergraduate(String xname, int xage, int xID, String xmajor, double xgpa, int xlevel, String xminor) {
        super(xname, xage, xID, xmajor, xgpa);
        this.setLevel(xlevel);
        this.setMinor(xminor);
    }

    public int getLevel(){
        return this.level;
    }
    public String getMinor(){
        return this.minor;
    }

    public void setLevel(int xlevel){
        if (xlevel >= 1 && xlevel <=4){
            this.level = xlevel;
        } else {
            System.out.println("Invalid level");
        }
    }

    public void setMinor(String xminor){
        if (xminor.equalsIgnoreCase("nuclear engineering") || xminor.equalsIgnoreCase("political science")){
            this.minor = xminor;
        } else {
            System.out.println("Invalid minor");
        }
    }

    public boolean equals(undergraduate ug){
        return  ug != null && super.equals(ug)
                &&this.level == ug.getLevel()
                && this.minor.equalsIgnoreCase(ug.getMinor());
    }

    public void writeOutput(){
        super.writeOutput();
        System.out.println("\nUndergraduate level: "+this.level+"\nMinor: "+this.minor);
    }
}
