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
        dbCRUD crud = new dbCRUD();

        // Menyimpan data sepatu
        datasepatu sepatu = new datasepatu("V001", "CONVERSE 70S", 16, 800000, 900000);
        crud.Simpandatasepatu(sepatu);

        // Membaca semua data sepatu
        System.out.println("Data Sepatu:");
        crud.selectAllDatasepatu();

        // Memperbarui data sepatu
        sepatu.setNamaBarang("CONVERSE 70S Updated");
        sepatu.setStok(20);
        sepatu.setHargaBeli(850000);
        sepatu.setHargaJual(950000);
        crud.updateDatasepatu(sepatu);

        // Membaca semua data sepatu setelah update
        System.out.println("\nData Sepatu setelah update:");
        crud.selectAllDatasepatu();

        // Menghapus data sepatu
        crud.deleteDatasepatu("V001");

        // Membaca semua data sepatu setelah penghapusan
        System.out.println("\nData Sepatu setelah penghapusan:");
        crud.selectAllDatasepatu();

        // Menyimpan data member
        Member member1 = new member("M001", "John Doe", "08123456789", "Jakarta");
        crud.SimpanMember(member1);

        // Membaca semua data member
        System.out.println("\nData Member:");
        crud.selectAllMember();

        // Memperbarui data member
        member1.setNama("Jane Doe");
        member1.setTelepon("08129876543");
        member1.setAlamat("Bandung");
        crud.updateMember(member1);

        // Membaca semua data member setelah update
        System.out.println("\nData Member setelah update:");
        crud.selectAllMember();

        // Menghapus data member
        crud.deleteMember("M001");

        // Membaca semua data member setelah penghapusan
        System.out.println("\nData Member setelah penghapusan:");
        crud.selectAllMember();

        // Menyimpan data pembelian
        pembelian pembelian1 = new pembelian("P001", "S001", "Supplier A", "CONVERSE 70S", "2022-01-01", 800000, 10, 8000000);
        crud.SimpanPembelian(pembelian1);

        // Membaca semua data pembelian
        System.out.println("\nData Pembelian:");
        crud.selectAllPembelian();

        // Memperbarui data pembelian
        pembelian1.setJumlah(12);
        pembelian1.setTotal(9600000);
        crud.updatePembelian(pembelian1);

        // Membaca semua data pembelian setelah update
        System.out.println("\nData Pembelian setelah update:");
        crud.selectAllPembelian();

        // Menghapus data pembelian
        crud.deletePembelian("P001");

        // Membaca semua data pembelian setelah penghapusan
        System.out.println("\nData Pembelian setelah penghapusan:");
        crud.selectAllPembelian();

        // Menyimpan data penjualan
        penjualan penjualan1 = new penjualan("J001", "V001", "2022-01-10", "CONVERSE 70S", 10, 900000, 5, 4500000, "M001", "John Doe", 0, 0, 4500000, 0);
        crud.SimpanPenjualan(penjualan1);

        // Membaca semua data penjualan
        System.out.println("\nData Penjualan:");
        crud.selectAllPenjualan();

        // Memperbarui data penjualan
        penjualan1.setJumlah(6);
        penjualan1.setTotal(5400000);
        penjualan1.setDiskon(50000);
        penjualan1.setTotalDiskon(300000);
        penjualan1.setBayar(6000000);
        penjualan1.setKembali(6000000 - 5400000);
        crud.updatePenjualan(penjualan1);

        // Membaca semua data penjualan setelah update
        System.out.println("\nData Penjualan setelah update:");
        crud.selectAllPenjualan();

        // Menghapus data penjualan
        crud.deletePenjualan("J001");

        // Membaca semua data penjualan setelah penghapusan
        System.out.println("\nData Penjualan setelah penghapusan:");
        crud.selectAllPenjualan();

        // Menyimpan data supplier
        supplier supplier1 = new supplier("S001", "Supplier A", "CONVERSE 70S");
        crud.SimpanSupplier(supplier1);

        // Membaca semua data supplier
        System.out.println("\nData Supplier:");
        crud.selectAllSupplier();

        // Memperbarui data supplier
        supplier1.setPerusahaan("Supplier B");
        crud.updateSupplier(supplier1);

        // Membaca semua data supplier setelah update
        System.out.println("\nData Supplier setelah update:");
        crud.selectAllSupplier();

        // Menghapus data supplier
        crud.deleteSupplier("S001");

        // Membaca semua data supplier setelah penghapusan
        System.out.println("\nData Supplier setelah penghapusan:");
        crud.selectAllSupplier();
    }
}