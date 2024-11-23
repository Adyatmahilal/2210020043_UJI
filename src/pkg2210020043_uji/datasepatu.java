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
    private String nama_barang;
    private int stok;
    private double harga_beli;
    private double harga_jual;

    // Constructor
    public datasepatu(String kodeBarang, String namaBarang, int stok, double hargaBeli, double hargaJual) {
        this.kodeBarang = kodeBarang;
        this.nama_barang = namaBarang;
        this.stok = stok;
        this.harga_beli = hargaBeli;
        this.harga_jual = hargaJual;
    }

    // Getters and Setters
    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return nama_barang;
    }

    public void setNamaBarang(String namaBarang) {
        this.nama_barang = namaBarang;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public double getHargaBeli() {
        return harga_beli;
    }

    public void setHargaBeli(double hargaBeli) {
        this.harga_beli = hargaBeli;
    }

    public double getHargaJual() {
        return harga_jual;
    }

    public void setHargaJual(double hargaJual) {
        this.harga_jual = hargaJual;
    }

    // Method to display data
    public void displayData() {
        System.out.println("Kode Barang: " + kodeBarang);
        System.out.println("Nama Barang: " + nama_barang);
        System.out.println("Stok: " + stok);
        System.out.println("Harga Beli: " + harga_beli);
        System.out.println("Harga Jual: " + harga_jual);
    }
}