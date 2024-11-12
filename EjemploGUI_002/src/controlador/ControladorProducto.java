package controlador;
import BDD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Producto;

public class ControladorProducto {
    public boolean agregar(Producto producto)
    {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();

            String sql = "INSERT INTO Producto (idMarca, idCategoria, codigo, " +
                                                "descripcion, stock, precioCosto, precioVenta) " +
                        " VALUES (?,?,?,?,?,?,?)";
            PreparedStatement st;
            st = cx.prepareStatement(sql);
            st.setInt(1, producto.getIdMarca());
            st.setInt(2, producto.getIdCategoria());
            st.setLong(3, producto.getCodigo());
            st.setString(4, producto.getDescripcion());
            st.setInt(5, producto.getStock());
            st.setInt(6, producto.getPrecioCosto());
            st.setInt(7, producto.getPrecioVenta());

            st.executeUpdate();
            st.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }
    public boolean actualizar(Producto producto)
    {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();

            String sql = "UPDATE Producto SET nombre=?, habilitado=? WHERE id=?";
            PreparedStatement st;
            st = cx.prepareStatement(sql);
            st.setString(1, producto.getNombre());
            st.setBoolean(2, producto.isHabilitado());
            st.setInt(3, producto.getId());
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
            String sql = "DELETE FROM Producto WHERE id = ?";        
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
    public Producto buscarPorId(int id)
    {
        Producto producto = null;
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "SELECT id, nombre, habilitado FROM Producto WHERE id = ?";        
            PreparedStatement st = cx.prepareStatement(sql);
            st.setInt(1, id);
            
            ResultSet rs = st.executeQuery();
            if(rs.next())
            {
                producto = new Producto();
                producto.setId(rs.getInt("id"));
                producto.setNombre(rs.getString("nombre"));
                producto.setHabilitado(rs.getInt("habilitado")==1);
            }
            st.close();
            cx.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());        
        }
        return producto;
    }
    public ArrayList<Producto> buscarTodo()
    {
        ArrayList<Producto> listado = new ArrayList<Producto>();
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "SELECT id, nombre, habilitado FROM Producto";        
            PreparedStatement st = cx.prepareStatement(sql);
           
            ResultSet rs = st.executeQuery();
            
            while(rs.next())
            {
                Producto producto = new Producto();
                producto.setId(rs.getInt("id"));
                producto.setNombre(rs.getString("nombre"));
                producto.setHabilitado(rs.getInt("habilitado")==1);
                listado.add(producto);
            }
            st.close();
            cx.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());        
        }
        return listado;
    }
}
