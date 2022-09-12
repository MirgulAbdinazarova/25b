package hWorke25a;

public class Car {
    private int id;
    private int numOfavto;

    public Car(int id, int numOfavto) {
        this.id = id;
        this.numOfavto = numOfavto;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumOfavto(int numOfavto) {
        this.numOfavto = numOfavto;
    }

    public int getId() {
        return id;
    }

    public int getNumOfavto() {
        return numOfavto;
    }

    @Override
    public String toString() {
        return "Car:" +
                "id=" + id +
                ", numOfavto=" + numOfavto ;
    }
}
