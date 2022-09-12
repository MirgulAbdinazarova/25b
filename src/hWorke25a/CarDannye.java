package hWorke25a;

public class CarDannye {

        private int godVypusk;
        private String model;
        private String color;
        private int price;

    public CarDannye(int godVypusk, String model, String color, int price) {
        this.godVypusk = godVypusk;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public void setGodVypusk(int godVypusk) {
        this.godVypusk = godVypusk;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getGodVypusk() {
        return godVypusk;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String
    toString() {
        return "CarDannye:" +
                "godVypusk=" + godVypusk +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price ;
    }
}

