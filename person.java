public class person {
    private String name;
    private int age;

    //constructors
    public person(){
        this.name = "unknown";
        this.age = 1;
    }

    public person(String xname, int xage){
        this.setName(xname);
        this.setAge(xage);
    }

    //accessors
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    //mutators
    public void setName(String xname){
        this.name = xname;
    }

    public void setAge(int xage){
        if (xage > 0){
            this.age = xage;
        } else {
            System.out.println("Invalid age");
        }
    }

    //others
    public boolean equals(person p){
        return this.name.equalsIgnoreCase(p.getName()) && this.age == p.getAge();
    }

    public void writeOutput(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age+" year(s)");
    }
}
