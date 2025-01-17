/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2210020043_uji;

/**
 *
 * @author LENOVO
 */
public class Pembelian {

    private String noTransaksi;
    private String kdSupplier;
    private String perusahaan;
    private String namaBarang;
    private String tglTransaksi;
    private double harga;
    private int jumlah;
    private double total;

    // Constructor
    public Pembelian(String noTransaksi, String kdSupplier, String perusahaan, String namaBarang, String tglTransaksi, double harga, int jumlah, double total) {
        this.noTransaksi = noTransaksi;
        this.kdSupplier = kdSupplier;
        this.perusahaan = perusahaan;
        this.namaBarang = namaBarang;
        this.tglTransaksi = tglTransaksi;
        this.harga = harga;
        this.jumlah = jumlah;
        this.total = total;
    }

    // Getters and Setters
    public String getNoTransaksi() {
        return noTransaksi;
    }

    public void setNoTransaksi(String noTransaksi) {
        this.noTransaksi = noTransaksi;
    }

    public String getKdSupplier() {
        return kdSupplier;
    }

    public void setKdSupplier(String kdSupplier) {
        this.kdSupplier = kdSupplier;
    }

    public String getPerusahaan() {
        return perusahaan;
    }

    public void setPerusahaan(String perusahaan) {
        this.perusahaan = perusahaan;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getTglTransaksi() {
        return tglTransaksi;
    }

    public void setTglTransaksi(String tglTransaksi) {
        this.tglTransaksi = tglTransaksi;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    // Method to display data
    public void displayData() {
        System.out.println("No Transaksi: " + noTransaksi);
        System.out.println("Kode Supplier: " + kdSupplier);
        System.out.println("Perusahaan: " + perusahaan);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Tanggal Transaksi: " + tglTransaksi);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Total: " + total);
    }
}
