import static org.junit.Assert.assertEquals;

import org.junit.Test; 

public class AppTest {
    
    @Test
    public void testSumar() {
        Interfaz interfaz = new InterfazImpl();
        assertEquals(5, interfaz.sumar(2, 3), 0);
    }

}