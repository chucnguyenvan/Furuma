package baitaplon;

public class House extends Accomodation {
    private boolean status = false;

    public House() {
    }

    public House(boolean status) {
        this.status = status;
    }

    public House(String name, int price, int size, boolean status) {
        super(name, price, size);
        this.status = status;
    }

    public void disPlayVilla() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        String str = "House " + this.getName() + "\n"
                + "Gia Phong: " + this.getPrice() + "\n"
                + "So giuong " + this.getSize()+"\n"
                + "Hien Trang: ";
        if (this.status) {
            return str + "da dat";
        } else {
            return str + "con trong";
        }
    }
}
