public class Clerk extends Employee{
    String customerName;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Clerk(String name, int id, String title, String dateOfBirth, double salary, String address, String customerName) {
        super(name, id, title, dateOfBirth, salary, address);
        this.customerName = customerName;
    }
    public void call() {
        System.out.println("Clerk " + name + " will call " + customerName);
    }
    public void answer() {
        System.out.println("Clerk " + name + " will answer a call from " + customerName);
    }
}
