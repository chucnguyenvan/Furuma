package code.day9;

public class Vehicle {
    private String bienso;
    private String name;
    private String loaixe;

    public Vehicle() {
    }

    public Vehicle(String loaixe, String name,String bienso ) {
        this.bienso = bienso;
        this.name = name;
        this.loaixe = loaixe;
    }

    public String getBienso() {
        return bienso;
    }

    public void setBienso(String bienso) {
        this.bienso = bienso;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoaixe() {
        return loaixe;
    }

    public void setLoaixe(String loaixe) {
        this.loaixe = loaixe;
    }

    @Override
    public String toString() {
        return "xe:\n" +
                "loaixe=" + loaixe + '\n' +
                "name=" + name + '\n' +
                "bienso= " + bienso + '.'+'\n';
    }
}
