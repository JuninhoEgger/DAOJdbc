package main;

import model.entities.Department;

import java.sql.Connection;

import static db.DB.closeConnection;
import static db.DB.getConnection;
import static javax.swing.JOptionPane.showMessageDialog;

public class Main {
    public static void main(String[] args) {
        Connection conn = getConnection();
        closeConnection();

        Department department = new Department(1, "BOOKS");
        showMessageDialog(null, department);

    }
}
