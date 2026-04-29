package com.labs.sussybaka;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testAdd() {
        // Kỳ vọng 5 + 10 = 15. Nếu kết quả ra 15 thì Pass (xanh), ra số khác thì Fail (đỏ)!
        assertEquals(15, App.add(5, 10));
    }

    @Test
    public void testAddNegative() {
        // Thử test với số âm xem code xử lý đúng không nè
        assertEquals(-5, App.add(5, -10));
    }
}