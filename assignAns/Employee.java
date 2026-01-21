package assignAns;
// Importing Objects
import java.util.Objects;

// Employee Class is defined with some instance variables
public class Employee {
    String name;
    int income;
    String address;
    int age;

    //Employee Constructor
    Employee(String name, String address, int age, int income)
    {
        this.name = name;
        this.age = age;
        this.income = income;
        this.address = address;
    }

    // overridden the toString to print the object in desired format
    @Override
    public String toString() {
        return "Employee name is "+ name + " having age "+age+" years, lives in "+address+", earns Rs. "+income+" monthly";
    }

    // overridden the equals to check employee objects are different or same in our terms
    @Override
    public boolean equals(Object obj) {
        Employee emp = (Employee) obj;
        return emp.income == income && emp.age == age && Objects.equals(emp.address,address) && Objects.equals(emp.name,name);
    }

    // overridden the hashcode to get the hash of the object as we define to calculate
    @Override
    public int hashCode() {
        return Objects.hash(name,address,income,age);
    }
}
