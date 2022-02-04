package memento;

import java.util.Stack;

public class Caretaker {
    private Stack<EmployeeMemento> employeeHistory = new Stack<>();

    public void save(EmployeeOriginator employee) {
        employeeHistory.push(employee.createMemento());
    }

    public void revert(EmployeeOriginator employee) {
        if (employeeHistory.size() > 0) {
            employee.setMemento(employeeHistory.pop());
        }
    }
}
