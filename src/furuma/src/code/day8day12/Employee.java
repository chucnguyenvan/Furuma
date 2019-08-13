package code.day8day12;

public class Employee implements Comparable<Employee> {
    private int Msnv=0;
    private String name;
    private  String address;
    private  int age;
    private  String position;

    public Employee() {
    }

    public Employee(int msnv, String name, String address, int age, String position) {
        Msnv = msnv;
        this.name = name;
        this.address = address;
        this.age = age;
        this.position = position;
    }

    public int getMsnv() {
        return Msnv;
    }

    public void setMsnv(int msnv) {
        Msnv = msnv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee detail:" +"\n"
                +"Msnv= " + Msnv +"\n"
                +"name= " + name + '\n'
                +"address= " + address + '\n'
                + "age= " + age + '\n'
                + "position= " + position +".\n";
    }
    @Override
    public int compareTo(Employee o) {
        return this.getName().compareTo(o.getName());
    }
}
