package controlador;
import modelo.servicio.Logica;
import vista.MenuPrincipal;
import vista.RegistroProducto;
public class Principal {
    Logica miLogica;
    MenuPrincipal miMenu;
    RegistroProducto miVentana;
    Coordinador miCoordinador;
    public static void main(String[] args) {
		Principal miPrincipal=new Principal();
		miPrincipal.iniciar();
    }
    private void iniciar() {
		/*Se instancian las clases*/
                miMenu=new MenuPrincipal();
		miVentana=new RegistroProducto();
		miLogica=new Logica();
		miCoordinador= new Coordinador();
		/*Se establecen las relaciones entre clases*/
                miMenu.setCoordinador(miCoordinador);
		miVentana.setCoordinador(miCoordinador);
		miLogica.setCoordinador(miCoordinador);
		/*Se establecen relaciones con la clase coordinador*/
                miCoordinador.setMiMenu(miMenu);
		miCoordinador.setMiRegistro(miVentana);
		miCoordinador.setMiLogica(miLogica);		
		miMenu.setVisible(true);
	}
}