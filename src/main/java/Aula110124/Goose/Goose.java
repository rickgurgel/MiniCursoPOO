package Aula110124.Goose;

public class Goose {

    public String name;
    public String plumage;
    public Double height;

    public Goose(String name, String plumage, Double height) {
        this.name = name;
        this.plumage = plumage;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlumage() {
        return plumage;
    }

    public void setPlumage(String plumage) {
        this.plumage = plumage;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Goose{" +
                "name='" + name + '\'' +
                ", plumage='" + plumage + '\'' +
                ", height=" + height +
                '}';
    }
}
