import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TradeTest {
    @Test
    public void testMethod() {
        Trade t1 = new Trade("FERG");
        Trade t2 = new Trade("BARC");

        List<Trade> trade_list = new ArrayList<Trade>();
        trade_list.add(t1);
        trade_list.add(t1);
        trade_list.add(t2);
        List<Trade> removedList = Trade.removeConsecutive(1, trade_list);
        assertEquals(1, removedList.size());

    }

    @Test
    public void testMethod2() {  //testing input 2
        Trade t1 = new Trade("FERG");
        Trade t2 = new Trade("BARC");

        List<Trade> trade_list = new ArrayList<Trade>();
        trade_list.add(t1);
        trade_list.add(t1);
        trade_list.add(t2);
        List<Trade> removedList = Trade.removeConsecutive(2, trade_list);
        assertEquals(3, removedList.size());

    }

    @Test
    public void test() {
        Trade t1 = new Trade("FERG");
        TradeList l = new TradeList();
        l.add(t1);
        assertEquals(1, l.countTrades());
    }
}
