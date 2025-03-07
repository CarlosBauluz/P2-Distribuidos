import static org.junit.Assert.assertEquals;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import org.junit.Test; 


public class AppTest {
    
    @Test
    public void testSumar() throws RemoteException, Exception {
        Registry registry = LocateRegistry.getRegistry("localhost", 1100);
        Interfaz interfaz = (Interfaz) registry.lookup("Calculadora"); //Buscar en el registro...
        assertEquals(5, interfaz.sumar(2, 3), 0);
    }

}