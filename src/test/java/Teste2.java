import org.junit.jupiter.api.Test;
import org.testng.reporters.jq.TestNgXmlPanel;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Teste2 {
    public static int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a; // a é o maior
        } else if (b > c) {
            return b; // b é maior que c
        } else {
            return c; // caso contrário, c é o maior
        }
    }
    @Test
    public void testAMaior() {
        assertEquals(6, max(6, 2,2 ));

    }

    @Test
    public void testSoma(){
      assertEquals(10, (6 + 2 + 2));


    }

    @Test
    public void testSubtracao(){
        assertEquals(0, (6 -3-3));

    }
}