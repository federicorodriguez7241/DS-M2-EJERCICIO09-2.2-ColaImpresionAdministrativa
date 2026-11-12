public class Documento {
    private String id;
    private String nombre;
    private String sector;
    private int cantidadPaginas;

    public Documento(String id, String nombre, String sector, int cantidadPaginas) {
        this.id = id;
        this.nombre = nombre;
        this.sector = sector;
        this.cantidadPaginas = cantidadPaginas;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getSector() { return sector; }
    public int getCantidadPaginas() { return cantidadPaginas; }

    @Override
    public String toString() {
        return "Doc [" + id + "] - " + nombre + " (" + cantidadPaginas + " págs) | Sector: " + sector;
    }
}
