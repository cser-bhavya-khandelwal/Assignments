package Feb_20.entity_relationship_association;

public class MediaPlayer {

    private String brand;
    private String name;
    private double price;

    public MediaPlayer(String brand, String name, double price) {
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void displayMediaPlayerDetails() {
        System.out.println("Media Player Details:");
        System.out.println("---------------------");
        System.out.println("Brand: " + brand);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println();
    }
}