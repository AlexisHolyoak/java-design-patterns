package memento;

public class Client {

    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        EmployeeOriginator employee = new EmployeeOriginator();
        employee.setName("John Wick");
        employee.setAddress("111 Main Street");
        employee.setPhone("888-555-1212");
        System.out.println("Employee before save: " + employee);

        caretaker.save(employee);

        employee.setPhone("444-555-6666");
        caretaker.save(employee);
        System.out.println("Employee after changed phone number save: " + employee);

        employee.setPhone("333-999-6666"); // <--- we haven't called save!
        caretaker.revert(employee);
        System.out.println("Reverts to last save point: " + employee);

        caretaker.revert(employee);
        System.out.println("Reverted to original: " + employee);

        caretaker.revert(employee);
        System.out.println("Reverted to original: " + employee);
    }
}
