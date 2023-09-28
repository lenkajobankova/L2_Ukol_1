import java.math.BigDecimal;

public class Room {
    private int number, bed, price;
    private boolean balcony, sea;

    public Room(int number, int bed, boolean balcony, boolean sea, int price){
        this.number = number;
        this.bed = bed;
        this.balcony = balcony;
        this.sea = sea;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
