import junit.framework.TestCase;
import java.util.ArrayList;

/**
 * Created by andacabrera29 on 2/4/16.
 */
public class CoinChangerTest extends TestCase {
    private CoinChanger c;

    protected void setUp() throws Exception {
        c = new CoinChanger();
    }

    public void testCents() throws Exception {
        assertEquals(new ArrayList<Integer>() {{ add(1);}}, c.makeChange(1));
        assertEquals(new ArrayList<Integer>() {{ add(1); add(1);}}, c.makeChange(2));

    }
}

