/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2210020043_uji;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author LENOVO
 */

public class Main {

    public static void main(String[] args) {
        // Create sample data
        datasepatu sepatu = new datasepatu("B001", "Converse 70s", 42, 500000);
        Member member = new Member("M001", "John Doe", "johndoe@example.com", "123-456-7890");
        Supplier supplier = new Supplier("S001", "Supplier A", "supplierA@example.com");

        // Display sample data
        sepatu.displayData();
        member.displayMemberInfo();
        supplier.displaySupplierInfo();

        // Add additional logic or class interactions as needed
    }
}
