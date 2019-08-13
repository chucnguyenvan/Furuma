package baitaplon;

public class Customer {
    private int stt=1;
    private String name="A";
    private int age=0;
    private int numberVilla=0;
    private int numberHouse=0;
    private  int dayRent=0;
    private int rent=0;
    public Customer() {
    }

    public Customer(int stt, String name, int age, int numberVilla, int numberHouse, int dayRent) {
        this.stt = stt;
        this.name = name;
        this.age = age;
        this.numberVilla = numberVilla;
        this.numberHouse = numberHouse;
        this.dayRent = dayRent;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberVilla() {
        return numberVilla;
    }

    public void setNumberVilla(int numberVilla) {
        this.numberVilla = numberVilla;
    }

    public int getNumberhouse() {
        return numberHouse;
    }

    public void setNumberhouse(int numberhouse) {
        this.numberHouse = numberhouse;
    }

    public int getDayRent() {
        return dayRent;
    }

    public void setDayRent(int dayRent) {
        this.dayRent = dayRent;
    }

    public  int calculateRent(){
        this.rent=(this.numberVilla*10+this.numberHouse*5)*this.dayRent;
        return  this.rent;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", numberVilla=" + numberVilla +
                ", numberhouse=" + numberHouse +
                ", dayRent=" + dayRent +
                ", Tien thue phong=" + this.calculateRent() +
                '}';
    }
}
