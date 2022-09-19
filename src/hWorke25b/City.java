package hWorke25b;

import java.util.Comparator;

public class City implements Comparable<City> {
    private int cod;
    private String name;

    public City(int cod, String name) {
            this.cod = cod;
        this.name = name;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCod() {
        return cod;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "City  " +
                "cod:" + cod +
                ", name:'" + name + '\'';
    }


    @Override
    public int compareTo(City o) {
        return o.cod-cod;
    }
}
