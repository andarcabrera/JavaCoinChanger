import java.util.ArrayList;

/**
 * Created by andacabrera29 on 2/4/16.
 */
public class CoinChanger {
    public ArrayList<Integer> makeChange(int amount) {
        ArrayList<Integer> change = new ArrayList<>();
        for (int i = 0; i < amount; i += 1) {
            change.add(1);
        }
        return change;
    }
}
