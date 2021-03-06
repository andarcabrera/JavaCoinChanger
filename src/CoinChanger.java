import java.util.ArrayList;
import java.util.List;

/**
 * Created by andacabrera29 on 2/4/16.
 */
public class CoinChanger {
    public List<Integer> makeChange(int amount) {
        ArrayList<Integer> change = new ArrayList<>();
        if (amount >= 25){
            change.add(25);
            amount -= 25;
        }

        if (amount >= 10){
            change.add(10);
            amount -= 10;
        }

        if (amount >= 5) {
            change.add(5);
            amount -= 5;
        }
        for (int i = 0; i < amount; i += 1) {
            change.add(1);
        }
        return change;
    }
}
