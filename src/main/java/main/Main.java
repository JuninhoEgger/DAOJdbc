package main;

import java.sql.Connection;

import static db.DB.closeConnection;
import static db.DB.getConnection;

public class Main {
    public static void main(String[] args) {
        Connection conn = getConnection();
        closeConnection();
    }
}
