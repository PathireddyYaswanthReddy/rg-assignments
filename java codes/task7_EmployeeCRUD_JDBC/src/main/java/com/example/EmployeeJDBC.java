package com.example;

import java.sql.*;

public class EmployeeJDBC {
    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public void addEmployee(Employee e) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "INSERT INTO Employee VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, e.getId());
            ps.setString(2, e.getName());
            ps.setString(3, e.getDepartment());
            ps.executeUpdate();
            System.out.println("Employee added.");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void viewEmployees() {
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Employee");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt(1) + ", Name: " + rs.getString(2)
                        + ", Dept: " + rs.getString(3));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void updateEmployee(int id, String newName, String newDept) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "UPDATE Employee SET name=?, department=? WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, newName);
            ps.setString(2, newDept);
            ps.setInt(3, id);
            int updated = ps.executeUpdate();
            System.out.println(updated > 0 ? "Updated successfully." : "ID not found.");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void deleteEmployee(int id) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "DELETE FROM Employee WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int deleted = ps.executeUpdate();
            System.out.println(deleted > 0 ? "Deleted successfully." : "ID not found.");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
