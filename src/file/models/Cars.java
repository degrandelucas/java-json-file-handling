package file.models;

public class Cars {
    private String name;
    private int year;

    public Cars(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Carros{" +
                "Nome ='" + name + '\'' +
                ", Ano =" + year +
                '}';
    }
}
