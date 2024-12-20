package controlador;
import BDD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import modelo.Marca;

public class ControladorMarca {
    public boolean agregar(Marca marca)
    {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();

            String sql = "INSERT INTO Marca (nombre, habilitado) VALUES (?,?)";
            PreparedStatement st;
            st = cx.prepareStatement(sql);
            st.setString(1, marca.getNombre());
            st.setBoolean(2, marca.isHabilitado());
            st.executeUpdate();
            st.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }
    public boolean actualizar(Marca marca)
    {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();

            String sql = "UPDATE Marca SET nombre=?, habilitado=? WHERE id=?";
            PreparedStatement st;
            st = cx.prepareStatement(sql);
            st.setString(1, marca.getNombre());
            st.setBoolean(2, marca.isHabilitado());
            st.setInt(3, marca.getId());
            st.executeUpdate();
            st.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }
    public boolean eliminar(int id)
    {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "DELETE FROM Marca WHERE id = ?";        
            PreparedStatement st = cx.prepareStatement(sql);
            st.setInt(1, id);
            
            st.executeUpdate();
            st.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());        
        }
        return false;
    }
    public Marca buscarPorId(int id)
    {
        Marca marca = null;
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "SELECT id, nombre, habilitado FROM Marca WHERE id = ?";        
            PreparedStatement st = cx.prepareStatement(sql);
            st.setInt(1, id);
            
            ResultSet rs = st.executeQuery();
            if(rs.next())
            {
                marca = new Marca();
                marca.setId(rs.getInt("id"));
                marca.setNombre(rs.getString("nombre"));
                marca.setHabilitado(rs.getInt("habilitado")==1);
            }
            st.close();
            cx.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());        
        }
        return marca;
    }
    public ArrayList<Marca> buscarTodo()
    {
        ArrayList<Marca> listado = new ArrayList<Marca>();
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "SELECT id, nombre, habilitado FROM Marca ORDER BY nombre";        
            PreparedStatement st = cx.prepareStatement(sql);
           
            ResultSet rs = st.executeQuery();
            
            while(rs.next())
            {
                Marca marca = new Marca();
                marca.setId(rs.getInt("id"));
                marca.setNombre(rs.getString("nombre"));
                marca.setHabilitado(rs.getInt("habilitado")==1);
                listado.add(marca);
            }
            st.close();
            cx.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());        
        }
        return listado;
    }
    
    public javax.swing.DefaultComboBoxModel llenarComboBox()
    {
        Vector listado = new Vector();
        listado.add(new Marca(0, "Seleccionar", true));
        
         try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "SELECT id, nombre, habilitado FROM Marca WHERE habilitado = 1 ORDER BY nombre";        
            PreparedStatement st = cx.prepareStatement(sql);
           
            ResultSet rs = st.executeQuery();
            
            while(rs.next())
            {
                Marca marca = new Marca();
                marca.setId(rs.getInt("id"));
                marca.setNombre(rs.getString("nombre"));
                marca.setHabilitado(rs.getInt("habilitado")==1);
                listado.add(marca);
            }
            st.close();
            cx.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());        
        }
        return new javax.swing.DefaultComboBoxModel(listado);
        
    }
}
