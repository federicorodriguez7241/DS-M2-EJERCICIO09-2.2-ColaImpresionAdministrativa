public class Main {
    public static void main(String[] args) {

        System.out.println("--- ENVIANDO DOCUMENTOS DESDE 10 SECTORES ---");

        // Simulamos 10 sectores distintos
        for (int i = 1; i <= 10; i++) {

            GestorImpresion gestorSector = GestorImpresion.getInstancia();
            String nombreSector = "Sector " + i;

            // Cada sector manda 3 documentos
            for (int j = 1; j <= 3; j++) {
                String id = "S" + i + "-D" + j;
                Documento doc = new Documento(id, "Archivo " + j, nombreSector, 5);

                gestorSector.encolarDocumento(doc);
                System.out.println("Encolado: " + doc.getId() + " desde " + nombreSector);
            }
        }

        System.out.println("\nTodos los documentos fueron encolados exitosamente.");

        // Al final, llamamos a la impresora para que procese toda la cola
        GestorImpresion impresoraCentral = GestorImpresion.getInstancia();
        impresoraCentral.procesarTrabajos();
    }
}