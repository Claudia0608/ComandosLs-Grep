package ies.es.comando;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ComandoGrep {

    public String ejecutarGrep(String texto, String filtro) throws IOException, InterruptedException {
        Process proceso = Runtime.getRuntime().exec(new String[]{"grep", filtro});
        BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(proceso.getOutputStream()));
        escribir.write(texto);
        escribir.flush();
        escribir.close();
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
