// Learning Imports
package curWork;
import java.lang.String;
// Class, access modifiers and Constructor are explored
import vehicle.*;
class User{
    private String name;
    private int age;

    User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

}




// Interface is to be Explored
interface Animal{
    void getCountOfLegs();
    void getFeature();
    private void getName(){
        System.out.println("By Default Animals don't have the names !!!");
    }
}

class Dog implements Animal {
    public void getCountOfLegs() {
        System.out.println("Dogs have four legs !!!");
    }

    public void getFeature() {
        System.out.println("Dogs are loyal to their owner !!!");
    }
}

class Monkey implements Animal {
    public void getCountOfLegs(){
        System.out.println("Monkeys have two legs !!!");
    }
    public void getFeature(){
        System.out.println("Monkeys climbs the trees very well !!!");
    }
}

// operator

class Operators{
    int add(int a, int b){
        return a + b;
    }
    int sub(int a, int b)
    {
        return a - b;
    }
    int mul(int a, int b){
        return a * b;
    }
    int div(int a, int b)
    {
        return a / b ;
    }
    int mod(int a, int b){
        return a % b;
    }
    boolean and(boolean a, boolean b){
        return a && b;
    }
    boolean or(boolean a, boolean b){
        return a || b;
    }
    int inc(int a){
        return a++;
    }
    int dec(int a){
        return a--;
    }
    int ifcond(int a, int b){
        return a > b ? 10: 20;
    }

}
class Safari extends Car{
    void setColor(String name){
        this.Color = name;
    }

    String getColor(){
        return this.Color;
    }

    void setWheelCount(int number){
        this.wheelCount = number;
    }

    int getWheelCount(){
        return this.wheelCount;
    }

    void setCompanyName(String name){
        setCompany(name);
    }

    String getCompanyName(){
        return getCompany();
    }



}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.println("Hello and welcome!");
//
//        // Integer Data Types are usually signed type, they don't have unsigned keyword
//        // boolean Data Type, 1 bit
//        boolean isJavaFun = true;
//        System.out.println("Is Java fun? " + isJavaFun);
//
//        // byte Data type, 8 bits
//        byte age = 126;
//        System.out.println("Age: " + age);
//
//        // short Data Type, 2 bytes
//        short xyz = 1232;
//        System.out.println("Is Java fun? " + xyz);
//
//        // int Data Type, 4 bytes
//        int data = 7836527;
//        System.out.println("Balance: " + data);
//
//        // long Data Type, 8 bytes
//        long test = 729643729L;
//        System.out.println("Population: " + test);
//
//        // float Data type, 4 bytes
//        float random = 1256.76286f;
//        System.out.println("Loss: " + random);
//
//        // double Data type, 8 bytes
//        double new_data = 2183751.67328641;
//        System.out.println("WHO is this: " + new_data);
//
//        // char Data type, 2 bytes, also it is unsigned in nature, it is from 0 to 65535
//        char new_name ='A';
//        System.out.println("Char value is: "+ new_name);
//
//        // String Data type is non-primitive data type
//        // String name = "Vikas";
//
//        // Explored Class, Objects and Encapsulation
//        User myself = new User("Vikas",24);
//
//        System.out.println("Name: " + myself.getName());
//        System.out.println("Age: " + myself.getAge());
//
//        myself.setName("Vikas Sharma");
//        myself.setAge(25);
//        System.out.println("Name: "+ myself.getName());
//        System.out.println("Age: "+ myself.getAge());
//
//        Monkey animal1 = new Monkey();
//        animal1.getCountOfLegs();
//        animal1.getFeature();
//
//
//        Dog animal2 = new Dog();
//        animal2.getCountOfLegs();
//        animal2.getFeature();


// Explored Simple Arrays used
//        int[] data = {1,2,3,4,5};
        String[] names = {"Vikas", "Avneet", "Vedant", "Ashwini"};
//
//        System.out.println(data[1]);
//        System.out.println(names[2]);

        // loops
//        int i = 3;
//        while(i > 0){
//            animal1 : {
//                animal2 : {
//                    animal3 : {
//                        System.out.println("I am Grand Child "+i--);
//                        if (i==1)
//                            break animal1;
//                        if (i==2)
//                            break animal2;
//                        if(i==3)
//                            break animal3;
//                    }
//                }
//            }
//        }
//
//        do{
//            if(i==5)
//                break;
//            System.out.println("2 i = "+i++);
//        }while(i < 10);
//
//        for(i=0;i<5;i++){
//            if(i==2)
//                continue;
//            System.out.println("3 i = "+i);
//        }
//        for(String name: names)
//            System.out.println("Name is "+ name);
//        // Control Statements
//        int a = 10, b = 7;
//        if(a == b)
//            System.out.println("Success");
//
//        if (a>b)
//            System.out.println("Left");
//        else
//            System.out.println("Right");
//
//        if(a>b)
//            System.out.println("Up");
//        else if (a<b)
//            System.out.println("Down");
//        else
//            System.out.println("Done");
//
//        // In similar ways nested if else can be used
//        double i = random()*10;
//        System.out.println(i);
//        int j = (int)i;
//        System.out.println(j);
//        switch(j){
//            case 1: a = a + b;
//            break;
//            case 2: a = a - b;
//            break;
//            case 0: a = a * b;
//            break;
//            default:
//                System.out.println("No Nothing and Enjoy !!!");
//        }
//        System.out.println("Answer : " + a);

//
//        Car obj = new Car();
//        obj.isManual = true;
//
//        Safari veh = new Safari();
//        veh.setColor("Green");
//        veh.setWheelCount(4);
//
//        System.out.println("Safari Color: "+veh.getColor());
//        System.out.println("Car Manual Status: "+obj.isManual);
//
//        System.out.println("Car have "+veh.getWheelCount()+" wheels.");
//
//        veh.setCompanyName("Tata");
//        System.out.println("Car Company: "+veh.getCompanyName());
//
//        Company name1 = new Company();
//        name1.Model = 2001;
//        name1.Color = "Black";
//        name1.isManual = true;
//        name1.wheelCount = 2;
//        name1.setCompany("LNW");
//        System.out.println("Company Name "+name1.getCompany());
//
//
//        LNW obj2 = new LNW();
//        obj2.Color = "Blue";
//        obj2.Model = 2001;
//        obj2.setCompany("Light and Wonder");
//        System.out.println(obj2.getCompany());

//        Arrays obj = new Arrays();
//        obj.display();

        LeCol obj = new LeCol();
        obj.arrayList();

    }
}