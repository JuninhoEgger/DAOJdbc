package model.dao;

import model.dao.impl.SellerDAOJDBC;

public class DAOFactory {

    private DAOFactory() {
        //CONSTRUTOR VAZIO APONTADO PELO SONAR
    }

    public static SellerDAO createSellerDAO() {
        return new SellerDAOJDBC();
    }

}
