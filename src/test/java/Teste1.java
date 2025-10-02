import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Teste1 {

    public static int foo(int x, int y) {
        if (x > 0) {
            if (y > 0) {
                return x + y;
            } else {
                return x - y;
            }
        } else {
            if (y > 0) {
                return y - x;
            } else {
                return -(x + y);
            }
        }
    }

   // testes de números
    @Test
    public void testPositivos() {
        assertEquals(7, foo(3, 4)); // 3 + 4 = 7
    }

    @Test
    public void testXPosYNeg() {
        assertEquals(5, foo(3, -2)); // 3 - (-2) = 3 + 2 = 5
    }

    @Test
    public void testXNegYPos() {
        assertEquals(7, foo(-3, 4)); // 4 - (-3) = 7
    }

    @Test
    public void testNegativos() {
        assertEquals(5, foo(-2, -3)); // -( -2 + -3 ) = -(-5) = 5
    }
}
