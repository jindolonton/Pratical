package practical1;

import java.util.Scanner;

public class Item {
    private int itemId;
    private String Name;
    private String Producer;
    private double Price;
    public Item(){

    }
    public Item(int itemId, String Name, String Producer, double Price){
        this.itemId=itemId;
        this.Name=Name;
        this.Producer=Producer;
        this.Price=Price;

    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getProducer() {
        return Producer;
    }

    public void setProducer(String producer) {
        Producer = producer;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public void inPut(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input item details:");
        System.out.println("itemId:");
        this.itemId=Integer.valueOf(scanner.nextLine());
        System.out.println("Name:");
        this.Name=scanner.nextLine();
        System.out.println("Producer:");
        this.Producer=scanner.nextLine();
        System.out.println("Price:");
        this.Price=Double.valueOf(scanner.nextLine());
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", Name='" + Name + '\'' +
                ", Producer='" + Producer + '\'' +
                ", Price=" + Price +
                '}';
    }
}
