package baitaplon;

public class Villa extends baitaplon.Accomodation {
    private boolean status = false;

    public Villa() {
    }

    public Villa(boolean status) {
        this.status = status;
    }

    public Villa(String name, int price, int size, boolean status) {
        super(name, price, size);
        this.status = status;
    }

    public void disPlayVilla() {
            System.out.println(this.toString());
    }

    @Override
    public  String toString() {
        String str="Villa " + this.getName() + "\n"
                + "Gia Phong: " + this.getPrice() + "\n"
                +"So giuong "+this.getSize()
                + "Hien Trang: ";
        if (this.status) {
            return  str+"da dat";
        } else {
            return  str+"con trong";
        }
    }
}