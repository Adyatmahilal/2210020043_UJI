/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2210020043_uji;

import com.mysql.jdbc.ResultSetMetaData;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class dbCRUD {

    // JDBC Database URL, Username and Password
    private static final String DB_URL = "jdbc:mysql://localhost:3306/yourdatabase";
    private static final String USER = "yourusername";
    private static final String PASS = "yourpassword";

    // Method to establish database connection
    private Connection connect() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }

    // Create operation
    public void insertMember(Member member) {
        String query = "INSERT INTO members (memberId, name, email, phoneNumber) VALUES (?, ?, ?, ?)";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, member.getMemberId());
            pstmt.setString(2, member.getName());
            pstmt.setString(3, member.getEmail());
            pstmt.setString(4, member.getPhoneNumber());
            pstmt.executeUpdate();
            System.out.println("Member inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Read operation
    public void getMember(String memberId) {
        String query = "SELECT * FROM members WHERE memberId = ?";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, memberId);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println("Member ID: " + rs.getString("memberId"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("Phone Number: " + rs.getString("phoneNumber"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Update operation
    public void updateMember(Member member) {
        String query = "UPDATE members SET name = ?, email = ?, phoneNumber = ? WHERE memberId = ?";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, member.getName());
            pstmt.setString(2, member.getEmail());
            pstmt.setString(3, member.getPhoneNumber());
            pstmt.setString(4, member.getMemberId());
            pstmt.executeUpdate();
            System.out.println("Member updated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}    
