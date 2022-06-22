package model.dao;

import model.entities.Department;

import java.sql.SQLException;
import java.util.List;

public interface DepartmentDAO {

    void insert(Department department) throws SQLException;

    void update(Department department);

    void deleteById(Integer id);

    Department findById(Integer id);

    List<Department> findAll();

}
