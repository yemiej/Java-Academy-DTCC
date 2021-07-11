package assignment_3.item_package;

public class Item {

    private String name;
    private ItemType type;
    private double price;
    private String description;

    enum ItemType {
        Food, Weapon, Safety, Footwear, Knowledge
    }

    public Item(String name, ItemType type, double price, String description) {
        this.price = price;
        this.description = description;
        this.name = name;
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ItemType getItemType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return  " Name  : " + name + "\n" +
                " Type  : " + type + "\n" +
                " Price : $" + String.format("%,.2f", price) + "\n" +
                " Description : " + description  + "\n" +
                "********************************" ;
    }
    public String toString1() {
        return "Item{" +
                "name = '" + name + '\'' +
                ", type = '" + type + '\'' +
                ", price = " + price +
                ", description = '" + description + '\'' +
                '}';
    }
}
