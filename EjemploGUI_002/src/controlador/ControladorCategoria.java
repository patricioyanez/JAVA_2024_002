package controlador;
import BDD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import modelo.Categoria;

public class ControladorCategoria {
    public boolean agregar(Categoria categoria)
    {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();

            String sql = "INSERT INTO Categoria (nombre, habilitado) VALUES (?,?)";
            PreparedStatement st;
            st = cx.prepareStatement(sql);
            st.setString(1, categoria.getNombre());
            st.setBoolean(2, categoria.isHabilitado());
            st.executeUpdate();
            st.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }
    public boolean actualizar(Categoria categoria)
    {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();

            String sql = "UPDATE Categoria SET nombre=?, habilitado=? WHERE id=?";
            PreparedStatement st;
            st = cx.prepareStatement(sql);
            st.setString(1, categoria.getNombre());
            st.setBoolean(2, categoria.isHabilitado());
            st.setInt(3, categoria.getId());
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
            String sql = "DELETE FROM Categoria WHERE id = ?";        
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
    public Categoria buscarPorId(int id)
    {
        Categoria categoria = null;
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "SELECT id, nombre, habilitado FROM Categoria WHERE id = ?";        
            PreparedStatement st = cx.prepareStatement(sql);
            st.setInt(1, id);
            
            ResultSet rs = st.executeQuery();
            if(rs.next())
            {
                categoria = new Categoria();
                categoria.setId(rs.getInt("id"));
                categoria.setNombre(rs.getString("nombre"));
                categoria.setHabilitado(rs.getInt("habilitado")==1);
            }
            st.close();
            cx.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());        
        }
        return categoria;
    }
    public ArrayList<Categoria> buscarTodo()
    {
        ArrayList<Categoria> listado = new ArrayList<Categoria>();
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "SELECT id, nombre, habilitado FROM Categoria ORDER BY nombre";        
            PreparedStatement st = cx.prepareStatement(sql);
           
            ResultSet rs = st.executeQuery();
            
            while(rs.next())
            {
                Categoria categoria = new Categoria();
                categoria.setId(rs.getInt("id"));
                categoria.setNombre(rs.getString("nombre"));
                categoria.setHabilitado(rs.getInt("habilitado")==1);
                listado.add(categoria);
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
        listado.add(new Categoria(0, "Seleccionar", true));
        
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "SELECT id, nombre, habilitado FROM Categoria WHERE habilitado=1 ORDER BY nombre";        
            PreparedStatement st = cx.prepareStatement(sql);
           
            ResultSet rs = st.executeQuery();
            
            while(rs.next())
            {
                Categoria categoria = new Categoria();
                categoria.setId(rs.getInt("id"));
                categoria.setNombre(rs.getString("nombre"));
                categoria.setHabilitado(rs.getInt("habilitado")==1);
                listado.add(categoria);
            }
            st.close();
            cx.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());        
        }
        return new javax.swing.DefaultComboBoxModel(listado);
    }
//    public int seleccionarPorId(javax.swing.JComboBox comboBox, int id) {
//        javax.swing.DefaultComboBoxModel<Categoria> model = (javax.swing.DefaultComboBoxModel<Categoria>) comboBox.getModel();
//        for (int i = 0; i < model.getSize(); i++) {
//            if (model.getElementAt(i).getId() == id)
//                return i;            
//        }
//        return 0;
//    }
}
