package main;

import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Logger;

import static db.DB.closeConnection;
import static db.DB.getConnection;
import static javax.swing.JOptionPane.showMessageDialog;
import static model.dao.DAOFactory.createSellerDAO;

public class Main {
    public static void main(String[] args) throws SQLException {
        Logger log = Logger.getLogger(Main.class.getName());
        Connection conn = getConnection();
        log.info(conn.getCatalog());
        closeConnection();

        Department department = new Department(1, "BOOKS");
        showMessageDialog(null, department);

        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, department);
        showMessageDialog(null, seller);

        SellerDAO sellerDAO = createSellerDAO();

    }
}
