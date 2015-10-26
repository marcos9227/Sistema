package controlador;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.entidad.Producto;
import modelo.servicio.Logica;
import vista.MenuPrincipal;
import vista.RegistroProducto;
public class Coordinador {
    private Logica miLogica;
    private MenuPrincipal miMenu;
    private RegistroProducto miRegistro;

    public MenuPrincipal getMiMenu() {
        return miMenu;
    }
    public void setMiMenu(MenuPrincipal miMenu) {
        this.miMenu = miMenu;
    }
    public RegistroProducto getMiRegistro() {
        return miRegistro;
    }

    public void setMiRegistro(RegistroProducto miRegistro) {
        this.miRegistro = miRegistro;
    }
    public Logica getMiLogica() {
		return miLogica;
	}
	public void setMiLogica(Logica miLogica) {
		this.miLogica = miLogica;
	}
    //-------------------------------
    public void mostrarVentanaRegistro() {
		miRegistro.setVisible(true);
    }
    public void registrarProducto(Producto miProducto) {
        try {
            miLogica.validarRegistro(miProducto);
        } catch (Exception ex) {
            Logger.getLogger(Coordinador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}