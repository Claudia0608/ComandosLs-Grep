package ies.es.comando;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComandoLs {

    public String ejecutarLs(String ruta) throws IOException, InterruptedException {
        Process proceso = Runtime.getRuntime().exec(new String[]{"ls", ruta});
        BufferedReader leer = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
        StringBuilder sb = new StringBuilder();
        String linea;
        while ((linea = leer.readLine()) != null) {
            sb.append(linea).append("\n");
        }
        leer.close();
        proceso.waitFor();
        return sb.toString();
    }
}
