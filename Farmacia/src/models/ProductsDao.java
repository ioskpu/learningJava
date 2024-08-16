
package models;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProductsDao {
    //Instanciar conexión
    ConnectionMySQL cn = new ConnectionMySQL();
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    
    public boolean registerProductQuery(Products product){
        String query = "INSERT INTO products (code, name, description, unit_price, created, updated, category_id)" + 
                "VALUES (?,?,?,?,?,?,?)";
        Timestamp datetime = new Timestamp(new Date().getTime());
        
        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            pst.setInt(1, product.getCode());
            pst.setString(2, product.getName());
            pst.setString(3, product.getDescription());
            pst.setDouble(4, product.getUnit_price());
            pst.setTimestamp(5, datetime);
            pst.setTimestamp(6, datetime);
            pst.setInt(7, product.getCategory_id());
            pst.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar el producto");
            return false;
        }
    }
    
    //Listar productos
    public List listProductQuery(String value){
        List<Products> list_products = new ArrayList();
        String query = "SELECT pro.*, ca.name AS category_name FROM products pro, categories ca WHERE pro.category_id = ca.id";
        String query_search_product = "SELECT pro.*, ca.name AS category_name FROM products pro INNER JOIN categories ca ON pro.category_id = ca.id WHERE pro.name LIKE '%" + value + "%'";
        
        try{
            conn = cn.getConnection();
            if (value.equalsIgnoreCase("")) {
                pst = conn.prepareStatement(query);
                rs = pst.executeQuery();
            } else {
                pst = conn.prepareStatement(query_search_product);
                rs = pst.executeQuery();
            }
            
            while(rs.next()){
                Products product = new Products();
                product.setId(rs.getInt("id"));
                product.setCode(rs.getInt("code"));
                product.setName(rs.getString("name"));
                product.setDescription(rs.getString("description"));
                product.setUnit_price(rs.getDouble("unit_price"));
                product.setProduct_quantity(rs.getInt("product_quantity"));
                product.setCategory_name(rs.getString("category_name"));
                list_products.add(product);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return list_products;    
    }
}
