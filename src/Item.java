import java.util.List;

public class Item {
    String name;
    Double cost;

    public Item(String name, Double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "item='" + name + '\'' + "cost=" + cost + '\'' +
                '}';
    }

    public static double calculatePrice(List<Item> basket) {
        double price = 0.0;
        Integer melons = 0;
        double melon_price = 0.0;
        Integer limes = 0;
        double lime_price = 0.0;
        for (Item i: basket) {
            if (i.name.equals("Lime")) {
                limes++;
                lime_price = i.cost;
            } else if (i.name.equals("Melon")) {
                melons++;
                melon_price = i.cost;
            } else {
                price += i.cost;
            }
        }
        price += (Math.ceil(melons/2.0)) * melon_price;  //Buy one, get one free
        price += (Math.ceil(limes*2/3.0)) * lime_price;  //3 for the price of 2
        return price;
    }
}
