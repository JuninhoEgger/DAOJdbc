package model.dao;

import model.dao.impl.DepartmentDAOJDBC;
import model.dao.impl.SellerDAOJDBC;

import static db.DB.getConnection;

public class DAOFactory {

    private DAOFactory() {
        //CONSTRUTOR VAZIO APONTADO PELO SONAR
    }

    public static SellerDAO createSellerDAO() {
        return new SellerDAOJDBC(getConnection());
    }

    public static DepartmentDAO createDepartmentDAO() {
        return new DepartmentDAOJDBC(getConnection());
    }

}
