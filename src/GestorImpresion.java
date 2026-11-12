import java.util.LinkedList;
import java.util.Queue;

public class GestorImpresion {

    private static GestorImpresion instancia;
    private Queue<Documento> colaImpresion;

    private GestorImpresion() {

        this.colaImpresion = new LinkedList<>();
    }

    public static GestorImpresion getInstancia() {
        if (instancia == null) {
            instancia = new GestorImpresion();
        }
        return instancia;
    }

    public void encolarDocumento(Documento doc) {
        this.colaImpresion.add(doc);
    }

    public void procesarTrabajos() {
        System.out.println("\n--- INICIANDO PROCESO DE IMPRESIÓN ---");
        int trabajosProcesados = 0;

        // procesa hasta que la cola quede vacia
        while (!colaImpresion.isEmpty()) {
            Documento doc = colaImpresion.poll();
            System.out.println("Imprimiendo... " + doc.toString());
            trabajosProcesados++;
        }

        System.out.println("\nResumen: Se imprimieron " + trabajosProcesados + " documentos en total.");
    }
}
