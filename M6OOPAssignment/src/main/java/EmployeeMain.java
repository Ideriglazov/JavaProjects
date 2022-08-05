public class EmployeeMain {
    public static void main(String[] args) {
        Accountant employee1 = new Accountant("Ivan", 1, "Accountant", "01.01.1990", 5000, "Moscow");
        employee1.openAccount();
        employee1.closeAccount();
        employee1.createReport();
        System.out.println(employee1.toString());

        Accountant employee2 = new Accountant("Igor", 2, "Accountant", "02.02.1991", 6000, "Minsk");
        employee2.openAccount();
        employee2.closeAccount();
        employee2.createReport();
        System.out.println(employee2.toString());

        Accountant employee3 = new Accountant("Olga", 3, "Accountant", "03.03.1992", 5500, "Helsinki");
        employee3.openAccount();
        employee3.closeAccount();
        employee3.createReport();
        System.out.println(employee3.toString());

        Accountant employee4 = new Accountant("Elena", 4, "Accountant", "04.04.1989", 4500, "Paris");
        employee4.openAccount();
        employee4.closeAccount();
        employee4.createReport();
        System.out.println(employee4.toString());

        Accountant employee5 = new Accountant("John", 5, "Accountant", "05.05.1980", 7000, "Miami");
        employee5.openAccount();
        employee5.closeAccount();
        employee5.createReport();
        System.out.println(employee5.toString());

        Manager employee6 = new Manager("Sergey", 6, "Manager", "06.06.1985", 7000, "Toronto", "Alex");
        employee6.hire();
        employee6.fire();
        System.out.println(employee6.toString());

        Clerk employee7 = new Clerk("Anna", 7, "Clerk", "07.07.1987", 4000, "Warsaw", "Oleg");
        employee7.call();
        employee7.answer();
        System.out.println(employee7.toString());

        Clerk employee8 = new Clerk("Denis", 8, "Clerk", "08.08.1977", 4600, "Helsinki", "Vlad");
        employee8.call();
        employee8.answer();
        System.out.println(employee8.toString());

        Clerk employee9 = new Clerk("Mary", 9, "Clerk", "09.09.1986", 5200, "Riga", "Sam");
        employee9.call();
        employee9.answer();
        System.out.println(employee9.toString());
    }
}
