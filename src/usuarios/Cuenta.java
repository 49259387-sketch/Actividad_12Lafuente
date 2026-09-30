package usuarios;

// implements Comentable, Reportable
// El "comentario en una cuenta" es lo que se ve en su muro.
import interfaces.Comentable;
import interfaces.Reportable;

public class Cuenta extends Usuario implements Comentable, Reportable {

    private String nombreReal;
    private int cantidadAmigos;

    public Cuenta(String username, String email, String fechaAlta, boolean verificado,
                  String nombreReal, int cantidadAmigos) {
        super(username, email, fechaAlta, verificado);
        this.nombreReal = nombreReal;
        this.cantidadAmigos = cantidadAmigos;
    }

    @Override
    public void mostrarPerfil() {
        String tilde = isVerificado() ? " (V)" : "";
        System.out.println("@" + getUsername() + tilde + " - " + nombreReal
                + " - " + cantidadAmigos + " amigos");
    }

    public String getNombreReal() { return nombreReal; }
    public void setNombreReal(String nombreReal) { this.nombreReal = nombreReal; }
    public int getCantidadAmigos() { return cantidadAmigos; }
    public void setCantidadAmigos(int cantidadAmigos) { this.cantidadAmigos = cantidadAmigos; }

    // aca van los metodos de Comentable y Reportable
    
    @Override
    public void comentar(String autor, String texto) {
        System.out.println("El autor es: " + autor);
        System.out.println("El comentario es: " + texto);
    }

    @Override
    public void reportar(String motivo) {
        System.out.println("El motivo del reporte es: " + motivo);
    }
    
}