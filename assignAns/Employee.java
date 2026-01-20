package assignAns;
import java.util.Objects;

public class Employee {
    String name;
    int income;
    String address;
    int age;

    Employee(String name, String address, int age, int income)
    {
        this.name = name;
        this.age = age;
        this.income = income;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee name is "+ name + " having age "+age+" years, lives in "+address+", earns Rs. "+income+" monthly";
    }

    @Override
    public boolean equals(Object obj) {
        Employee emp = (Employee) obj;
        return emp.income == income && emp.age == age && Objects.equals(emp.address,address) && Objects.equals(emp.name,name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,address,income,age);
    }
}
