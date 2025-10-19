package ies.es.comando;

public class EjecutarComando {

    public static void main(String[] args) {
        try {
            String ruta = args.length > 0 ? args[0] : "/home/debian/Desktop";
            ComandoLs Ls = new ComandoLs();
            ComandoGrep Grep = new ComandoGrep();
            String salidaLs = Ls.ejecutarLs(ruta);
            String salidaGrep = Grep.ejecutarGrep(salidaLs, "a");
            System.out.println(salidaGrep);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
