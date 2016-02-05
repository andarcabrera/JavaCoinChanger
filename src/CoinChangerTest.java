import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by andacabrera29 on 2/4/16.
 */
public class CoinChangerTest {
    private CoinChanger c;

    @Before
    public void setUp() throws Exception {
        c = new CoinChanger();
    }

    @Test
    public void testCents() {

        ArrayList<Integer> testArray = new ArrayList<Integer>() {{
            add(1);
        }};
          assertEquals(makeTestChange(1), c.makeChange(1));
          assertEquals(makeTestChange(1, 1), c.makeChange(2));
          assertEquals(makeTestChange(1, 1, 1), c.makeChange(3));
          assertEquals(makeTestChange(1, 1, 1, 1), c.makeChange(4));
    }

    @Test
    public void testNickle() {
        assertEquals(makeTestChange(5), c.makeChange(5));
        assertEquals(makeTestChange(5, 1), c.makeChange(6));
        assertEquals(makeTestChange(5, 1, 1), c.makeChange(7));
        assertEquals(makeTestChange(5, 1, 1, 1), c.makeChange(8));
        assertEquals(makeTestChange(5, 1, 1, 1, 1), c.makeChange(9));
    }

    @Test
    public void testDime() {
        assertEquals(makeTestChange(10), c.makeChange(10));
    }

    public List makeTestChange(int... a) {
        ArrayList<Integer> testChange = new ArrayList<Integer>();
        for (int i=0; i<a.length; i++) {
            testChange.add(a[i]);
        }
        return testChange;
    }
}

