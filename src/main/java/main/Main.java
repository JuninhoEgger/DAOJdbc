package main;

import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import static db.DB.closeConnection;
import static db.DB.getConnection;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;
import static model.dao.DAOFactory.createSellerDAO;

public class Main {
    public static void main(String[] args) throws SQLException {
        Logger log = Logger.getLogger(Main.class.getName());
        Connection conn = getConnection();
        log.info(conn.getCatalog());

        SellerDAO sellerDAO = createSellerDAO();
        Seller seller = sellerDAO.findById(3);
        showMessageDialog(null, seller, "TEST 1 = seller findById", INFORMATION_MESSAGE);

        Department department = new Department(2, null);
        List<Seller> sellers = sellerDAO.findByDepartment(department);
        StringBuilder response = new StringBuilder("VENDEDORES FILTRADOS POR DEPARTAMENTO\n");
        sellers.forEach(s -> response.append(s).append("\n"));
        showMessageDialog(null, response, "TEST 2 = seller findByDepartment", INFORMATION_MESSAGE);

        sellers = sellerDAO.findAll();
        StringBuilder resposta = new StringBuilder("TODOS OS VENDEDORES\n");
        sellers.forEach(s -> resposta.append(s).append("\n"));
        showMessageDialog(null, resposta, "TEST 3 = seller findAll", INFORMATION_MESSAGE);

        seller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDAO.insert(seller);
        showMessageDialog(null, "INSERIDO! Novo id: " + seller.getId(), "TEST 4 = seller insert", INFORMATION_MESSAGE);

        seller = sellerDAO.findById(1);
        seller.setName("Martha Wayne");
        sellerDAO.update(seller);
        showMessageDialog(null, "UPDATED COMPLETED!", "TEST 5 = seller update", INFORMATION_MESSAGE);

        sellerDAO.deleteById(parseInt(showInputDialog(("INSIRA UM ID A SER DELETADO"))));
        showMessageDialog(null, "DELETADO COM SUCESSO!", "TEST 6 = seller delete", INFORMATION_MESSAGE);

        closeConnection();

    }
}
