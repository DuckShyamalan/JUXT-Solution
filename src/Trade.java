import java.util.ArrayList;
import java.util.List;

public class Trade {

    String t_id;

    public Trade(String t_id) {
        this.t_id = t_id;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "t_id='" + t_id + '\'' +
                '}';
    }

    public static List<Trade> removeConsecutive(int threshold, List<Trade> tradeList) {
        int consec = 1;
        List<Trade> newList = new ArrayList<>(tradeList);
        for (int i = 0; i < tradeList.size() - 1; i++) {
            if (tradeList.get(i).equals(tradeList.get(i+1))) {
                consec++;
                if (consec > threshold) {
                    for (int j = 0; j < consec; j++) {
                        newList.remove(tradeList.get(i));
                    }
                }
            } else {
                consec = 1;
            }
        }

        return newList;
    }

}
