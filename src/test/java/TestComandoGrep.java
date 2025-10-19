
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import ies.es.comando.ComandoGrep;

public class TestComandoGrep {

    @Test
    public void testFiltradoLetraA() throws IOException, InterruptedException {
        ComandoGrep grep = new ComandoGrep();

        String texto = "apple\nbanana\ncherry\ndate\nfig\n";
        String filtro = "a";

        String resultado = grep.ejecutarGrep(texto, filtro);

        assertTrue(resultado.contains("apple"));
        assertTrue(resultado.contains("banana"));
        assertTrue(resultado.contains("date"));
        assertFalse(resultado.contains("cherry"));
        assertFalse(resultado.contains("fig"));
    }
}
