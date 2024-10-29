package controlador;
import BDD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Marca;

public class ControladorMarca {
    public boolean agregar(Marca marca)
    {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();

            String sql = "INSERT INTO marca (nombre, habilitado) VALUES (?,?)";
            PreparedStatement st;
            st = cx.prepareStatement(sql);
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        
    }
}
