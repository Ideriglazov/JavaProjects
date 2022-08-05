public class Accountant extends Employee{
    public Accountant(String name, int id, String title, String dateOfBirth, double salary, String address) {
        super(name, id, title, dateOfBirth, salary, address);

    }
    public void createReport() {
        System.out.println("Accountant " + name + " will prepare the report");
    }
    public void openAccount() {
        System.out.println("Accountant " + name + " will open a new account");
    }
    public void closeAccount() {
        System.out.println("Accountant " + name + " will close an existing account");
    }
}
