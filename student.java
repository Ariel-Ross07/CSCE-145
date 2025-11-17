public class student extends person {
    //inheritance -> student inherits all the properties of the person class
    private int studentID;
    private String major;
    private double gpa;

    public student(){
        super();   //call the parent class default constructor
        this.studentID = 1;
        this.major = "no Major selected";
        this.gpa = 1.0;
    }

    public student(String xname, int xage, int xid, String xmajor, double xgpa){
        super(xname,xage);
        this.setStudentID(xid);
        this.setMajor(xmajor);
        this.setGpa(xgpa);
    }

    public int getStudentID() {
        return this.studentID;
    }

    public String getMajor(){
        return this.major;
    }

    public double getGpa(){
        return this.gpa;
    }

    public void setStudentID(int xID){
        this.studentID = xID;
    }

    public void setMajor(String xmajor){
        if(xmajor.equalsIgnoreCase("mathematics")
                || xmajor.equalsIgnoreCase("Computer Science")
                || xmajor.equalsIgnoreCase("English")
                || xmajor.equalsIgnoreCase("Business")){

                this.major = xmajor;
        } else {
            System.out.println("Invalid major");
        }
    }

    public void setGpa(double xgpa){
        if(xgpa >= 1 && xgpa <=4){
            this.gpa = xgpa;
        } else{
            System.out.println("Invalid gpa");
        }

    }

    public void WriteOutput(){
        //method overriding - same method signature but different method body
        super.writeOutput();
        System.out.println("\nStudent ID: "+this.studentID+"\nGPA: "+this.gpa+"\nMajor: "+this.major);

    }

    public boolean equals(student s){
        return s != null && super.equals(s)
                && this.studentID == s.getStudentID()
                && this.gpa == s.getGpa()
                && this.major.equalsIgnoreCase(s.getMajor());
    }
}
