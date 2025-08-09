public class Validation {
    static long nextAadharNo = 228263293;
    long aadharNo;
    String name;
    String address;
    int age;

    public Validation() {
        // default constructor
    }

    public Validation(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;

        if (name.length() >= 2 && address.length() > 0 && age >= 10) {
            this.aadharNo = ++Validation.nextAadharNo;
            System.out.println("Your Aadhar is created: " + this.aadharNo);
        } else {
            System.out.println("Invalid info.");
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Address: " + address + ", Age: " + age + ", Aadhar No: " + aadharNo;
    }

    public static void main(String[] args) {
        Validation v1 = new Validation("raj", "pune", 60);
        System.out.println(v1); // calls toString()

        Validation v2 = new Validation("a", "", 9); // should print "Invalid info."
    }
}
