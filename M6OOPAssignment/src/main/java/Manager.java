public class Manager extends Employee {
    String employeeName;

    public Manager(String name, int id, String title, String dateOfBirth, double salary, String address, String employeeName) {
        super(name, id, title, dateOfBirth, salary, address);
        this.employeeName = employeeName;
    }
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void hire() {
        System.out.println("Manager " + name + " will hire " + this.employeeName);
    }
    public void fire() {
        System.out.println("Manager " + name + " will fire " + employeeName);
    }
}
