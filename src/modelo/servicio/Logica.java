package modelo.servicio;
import controlador.Coordinador;
import javax.swing.JOptionPane;
import modelo.dao.ProductoDao;
import modelo.entidad.Producto;
public class Logica {
    private Coordinador miCoordinador;
    public static boolean consultaProducto=false;
    public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador=miCoordinador;	
    }
    public void validarRegistro(Producto miProducto) throws Exception{
        ProductoDao miProductoDao;
        if (miProducto.getStock() >0) {
                miProductoDao = new ProductoDao();				
                miProductoDao.registrarProducto(miProducto);
        }else {
                JOptionPane.showMessageDialog(null,"El Stock debe ser Positivo","Advertencia",JOptionPane.WARNING_MESSAGE);	
        }	
    }
}