
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import ies.es.comando.ComandoLs;

public class TestComandoLs {

    @Test
    public void testLs() throws IOException, InterruptedException {
        ComandoLs ls = new ComandoLs();
        String ruta = ".";
        String resultado = ls.ejecutarLs(ruta);

        assertNotNull(resultado);
        assertFalse(resultado.isEmpty());
        assertTrue(resultado.contains("\n"));
    }
}