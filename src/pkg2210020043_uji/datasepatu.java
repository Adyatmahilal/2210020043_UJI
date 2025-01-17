/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2210020043_uji;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 *
 * @author LENOVO
 */

public class datasepatu {

    private String kodeBarang;
    private String namaBarang;
    private int ukuran;
    private double harga;

    // Constructor
    public datasepatu(String kodeBarang, String namaBarang, int ukuran, double harga) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.ukuran = ukuran;
        this.harga = harga;
    }

    // Getters and Setters
    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getUkuran() {
        return ukuran;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Method to display shoe data
    public void displayData() {
        System.out.println("Kode Barang: " + kodeBarang);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga: " + harga);
    }
}
