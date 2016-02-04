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
        assertEquals(new ArrayList<Integer>() {{ add(1); add(1); add(1);}}, c.makeChange(3));
        assertEquals(new ArrayList<Integer>() {{ add(1); add(1); add(1); add(1);}}, c.makeChange(4));
        assertEquals(new ArrayList<Integer>() {{ add(5);}}, c.makeChange(5));

    }
}

