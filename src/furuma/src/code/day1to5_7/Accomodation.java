package code.day1to5_7;

public abstract class Accomodation {
    private String name;
    private int price;
    private int size;

    protected Accomodation() {
    }

    protected Accomodation(String name, int price, int size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void disPlay() {
        System.out.println("Room " + this.name);
        System.out.println("Loai Phong: " + this.size);
        System.out.println("Gia Phong: " + this.price);
    }

}

