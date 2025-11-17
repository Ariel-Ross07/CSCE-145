public class UndergradDemo {
    public static void main(String[] args) {
        undergraduate ug = new undergraduate("Thomas", 18, 12, "english", 4.0, 2, "mathematics");
        System.out.println("Details of the first undergrad: ");
        ug.WriteOutput();
        undergraduate uug = new undergraduate("flynn", 20, 4, "Mathematics", 4.0, 3, "nuclear engineering");
        System.out.println("Details of the second undergrad: ");
        uug.WriteOutput();
        System.out.println("Is the first object the same as the second object? "+ug.equals(uug));
    }
}
