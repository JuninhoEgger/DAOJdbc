package main;

import model.dao.SellerDAO;
import model.entities.Seller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;

import static db.DB.closeConnection;
import static db.DB.getConnection;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
import static model.dao.DAOFactory.createSellerDAO;

public class Main {
    public static void main(String[] args) throws SQLException {
        Logger log = Logger.getLogger(Main.class.getName());
        Connection conn = getConnection();
        log.info(conn.getCatalog());

        SellerDAO sellerDAO = createSellerDAO();
        Seller seller = sellerDAO.findById(3);
        showMessageDialog(null, seller, "TEST 1 = seller findById", INFORMATION_MESSAGE);

        closeConnection();

    }
}
