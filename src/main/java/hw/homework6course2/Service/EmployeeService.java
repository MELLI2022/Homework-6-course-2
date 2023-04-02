package hw.homework6course2.Service;

import hw.homework6course2.Exception.EmployeeAlreadyAddedException;
import hw.homework6course2.Exception.EmployeeNotFoundException;
import hw.homework6course2.Exception.EmployeeStorageIsFullException;
import hw.homework6course2.domane.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private static final int SIZE = 3;
    private final List<Employee> employees = new ArrayList<>(SIZE);


    public Employee add(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employees.size() < SIZE) {
            for (Employee emp : employees) {
                if (emp.equals(employees)) {
                    throw new EmployeeAlreadyAddedException();
                }
            }
            employees.add(employee);
            return employee;
        }
            throw new EmployeeStorageIsFullException();
        }

        public Employee find (String firstName, String lastName){
            Employee employee = new Employee(firstName, lastName);
            if (employees.contains(employee)) {
                    return employee;
                }

            throw new EmployeeNotFoundException();
        }
        public Employee remove (String firstName, String lastName){
            Employee employee = new Employee(firstName, lastName);
                if (employees.remove(employee)) {
                    return employee;
                }

            throw new EmployeeNotFoundException();
        }
    public List<Employee> list (){
        return employees;
    }

    }


