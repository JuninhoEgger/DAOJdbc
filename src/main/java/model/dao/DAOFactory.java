package model.dao;

import model.dao.impl.SellerDAOJDBC;

import static db.DB.getConnection;

public class DAOFactory {

    private DAOFactory() {
        //CONSTRUTOR VAZIO APONTADO PELO SONAR
    }

    public static SellerDAO createSellerDAO() {
        return new SellerDAOJDBC(getConnection());
    }

}
