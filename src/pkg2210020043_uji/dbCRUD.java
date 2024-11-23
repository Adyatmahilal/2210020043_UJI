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

    private Connection connect() {
        String url = "jdbc:mysql://localhost:3306/datasepatu";
        String user = "yourusername";
        String password = "yourpassword";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    // Duplicate key check
    public boolean duplicateKey(String tableName, String columnName, String value) {
        boolean isDuplicate = false;
        String query = "SELECT COUNT(*) FROM " + tableName + " WHERE " + columnName + " = '" + value + "'";

        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            if (rs.next()) {
                isDuplicate = rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return isDuplicate;
    }

    // CRUD operations for datasepatu
    public void Simpandatasepatu(datasepatu sepatu) {
        try {
            if (duplicateKey("datasepatu", "KodeBarang", sepatu.getKodeBarang())) {
                JOptionPane.showMessageDialog(null, "Kode barang sudah terdaftar");
            } else {
                String SQL = "INSERT INTO datasepatu (KodeBarang, nama_barang, stok, harga_beli, harga_jual) VALUES (?, ?, ?, ?, ?)";
                try (Connection conn = this.connect();
                     PreparedStatement pstmt = conn.prepareStatement(SQL)) {
                    pstmt.setString(1, sepatu.getKodeBarang());
                    pstmt.setString(2, sepatu.getNamaBarang());
                    pstmt.setInt(3, sepatu.getStok());
                    pstmt.setDouble(4, sepatu.getHargaBeli());
                    pstmt.setDouble(5, sepatu.getHargaJual());
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
                }
            }
        } catch (SQLException e) {
            System.err.println(e.toString());
        }
    }

    public void updateDatasepatu(datasepatu sepatu) {
        String SQL = "UPDATE datasepatu SET nama_barang = ?, stok = ?, harga_beli = ?, harga_jual = ? WHERE KodeBarang = ?";
        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, sepatu.getNamaBarang());
            pstmt.setInt(2, sepatu.getStok());
            pstmt.setDouble(3, sepatu.getHargaBeli());
            pstmt.setDouble(4, sepatu.getHargaJual());
            pstmt.setString(5, sepatu.getKodeBarang());
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diperbarui");
        } catch (SQLException e) {
            System.err.println(e.toString());
        }
    }

    public void deleteDatasepatu(String kodeBarang) {
        String SQL = "DELETE FROM datasepatu WHERE KodeBarang = ?";
        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, kodeBarang);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        } catch (SQLException e) {
            System.err.println(e.toString());
        }
    }

    public void selectAllDatasepatu() {
        String SQL = "SELECT * FROM datasepatu";
        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnsNumber = rsmd.getColumnCount();
            while (rs.next()) {
                for (int i = 1; i <= columnsNumber; i++) {
                    if (i > 1) System.out.print(",  ");
                    String columnValue = rs.getString(i);
                    System.out.print(columnValue + " " + rsmd.getColumnName(i));
                }
                System.out.println("");
            }
        } catch (SQLException e) {
            System.err.println(e.toString());
        }
    }

    // CRUD operations for member
    public void SimpanMember(member member) {
        try {
            if (duplicateKey("member", "kd_member", member.getKdMember())) {
                JOptionPane.showMessageDialog(null, "Kode member sudah terdaftar");
            } else {
                String SQL = "INSERT INTO member (kd_member, nama, telepon, alamat) VALUES (?, ?, ?, ?)";
                try (Connection conn = this.connect();
                     PreparedStatement pstmt = conn.prepareStatement(SQL)) {
                    pstmt.setString(1, member.getKdMember());
                    pstmt.setString(2, member.getNama());
                    pstmt.setString(3, member.getTelepon());
                    pstmt.setString(4, member.getAlamat());
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
                }
            }
        } catch (SQLException e) {
            System.err.println(e.toString());
        }
    }

    public void updateMember(member member) {
        String SQL = "UPDATE member SET nama = ?, telepon = ?, alamat = ? WHERE kd_member = ?";
        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, member.getNama());
            pstmt.setString(2, member.getTelepon());
            pstmt.setString(3, member.getAlamat());
            pstmt.setString(4, member.getKdMember());
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diperbarui");
        } catch (SQLException e) {
            System.err.println(e.toString());
        }
    }

    public void deleteMember(String kdMember) {
        String SQL = "DELETE FROM member WHERE kd_member = ?";
        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, kdMember);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        } catch (SQLException e) {
            System.err.println(e.toString());
        }
    }

    public void selectAllMember() {
        String SQL = "SELECT * FROM member";
        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnsNumber = rsmd.getColumnCount();
            while (rs.next()) {
                for (int i = 1; i <= columnsNumber; i++) {
                    if (i > 1) System.out.print(",  ");
                    String columnValue = rs.getString(i);
                    System.out.print(columnValue + " " + rsmd.getColumnName(i));
                }
                System.out.println("");
            }
        } catch (SQLException e) {
            System.err.println(e.toString());
        }
    }

    // CRUD operations for pembelian
    public void SimpanPembelian(pembelian pembelian) {
        try {
            if (duplicateKey("pembelian", "no_transaksi", pembelian.getNoTransaksi())) {
                JOptionPane.showMessageDialog(null, "No transaksi sudah terdaftar");
            } else {
                String SQL = "INSERT INTO pembelian (no_transaksi, kd_supplier, perusahaan, nama_barang, tgl_transaksi, harga, jumlah, total) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                try (Connection conn = this.connect();
                     PreparedStatement pstmt = conn.prepareStatement(SQL)) {
                    pstmt.setString(1, pembelian.getNoTransaksi());
                    pstmt.setString(2, pembelian.getKdSupplier());
                    pstmt.setString(3, pembelian.getPerusahaan());
                    pstmt.setString(4, pembelian.getNamaBarang());
                    pstmt.setString(5, pembelian.getTglTransaksi());
                    pstmt.setDouble(6, pembelian.getHarga());
                    pstmt.setInt(7, pembelian.getJumlah());
                    pstmt.setDouble(8, pembelian.getTotal());
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
                }
            }
        } catch (SQLException e) {
            System.err.println(e.toString());
        }
    }

    public void updatePembelian(pembelian pembelian) {
        String SQL = "UPDATE pembelian SET kd_supplier = ?, perusahaan = ?, nama_barang = ?, tgl_transaksi = ?, harga = ?, jumlah = ?, total = ? WHERE no_transaksi = ?";
        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, pembelian.getKdSupplier());
            pstmt.setString(2, pembelian.getPerusahaan());
            pstmt.setString(3, pembelian.getNamaBarang());
            pstmt.setString(4, pembelian.getTglTransaksi());
            pstmt.setDouble(5, pembelian.getHarga());
            pstmt.setInt(6, pembelian.getJumlah());
            pstmt.setDouble(7, pembelian.getTotal());
            pstmt.setString(8, pembelian.getNoTransaksi());
            pstmt.executeUpdate();
            
        }
        
    }

    void selectAllPembelian() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}