package code.day6;

public class Catology {
    private String name;
    private int price;
    private int yearProduct;

    public Catology() {
    }

    public Catology(String name, int price, int yearProduct) {
        this.name = name;
        this.price = price;
        this.yearProduct = yearProduct;
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

    public int getYearProduct() {
        return yearProduct;
    }

    public void setYearProduct(int yearProduct) {
        this.yearProduct = yearProduct;
    }
    @Override
    public String toString() {
        return "name: "+this.getName()+"\n"
                +"Gia tien: " +this.getPrice()+"\n"
                +"Nam san xuat: "+this.getYearProduct();
    }
}
