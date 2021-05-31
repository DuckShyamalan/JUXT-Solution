import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BasketTest {
    Item i1 = new Item("Apple", 0.35);
    Item i2 = new Item("Banana", 0.2);
    Item i3 = new Item("Melon", 0.5);
    Item i4 = new Item("Lime", 0.15);

    @Test
    public void testMethod() {  //basic check
        List<Item> item_list = new ArrayList<Item>();
        item_list.add(i1);
        item_list.add(i1);
        item_list.add(i2);
        Double price = Item.calculatePrice(item_list);
        assertEquals(0.9, price, 0.0001); //allowing an error margin of 10^-4

    }

    @Test
    public void test2() {  //melon check
        List<Item> item_list = new ArrayList<Item>();
        item_list.add(i3);
        item_list.add(i3);
        item_list.add(i2);
        Double price = Item.calculatePrice(item_list);
        assertEquals(0.7, price, 0.0001); //allowing an error margin of 10^-4

    }

    @Test
    public void test3() {  //lime check
        List<Item> item_list = new ArrayList<Item>();
        item_list.add(i4);
        item_list.add(i4);
        item_list.add(i4);
        item_list.add(i2);
        Double price = Item.calculatePrice(item_list);
        assertEquals(0.5, price, 0.0001); //allowing an error margin of 10^-4

    }

    @Test
    public void test4() {
        List<Item> item_list = new ArrayList<Item>();
        item_list.add(i3);
        item_list.add(i4);
        item_list.add(i2);
        System.out.println(item_list.toString());
        Double price = Item.calculatePrice(item_list);
        assertEquals(0.85, price, 0.0001); //allowing an error margin of 10^-4

    }

    @Test
    public void test5() {  //lime check
        List<Item> item_list = new ArrayList<Item>();
        item_list.add(i4);
        item_list.add(i4);
        item_list.add(i4);
        item_list.add(i3);
        item_list.add(i3);
        item_list.add(i3);
        Double price = Item.calculatePrice(item_list);
        assertEquals(1.3, price, 0.0001); //allowing an error margin of 10^-4

    }
}
