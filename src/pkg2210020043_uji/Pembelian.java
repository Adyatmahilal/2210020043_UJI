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
    public class pembelian {

    private String no_transaksi;
    private String kd_supplier;
    private String perusahaan;
    private String nama_barang;
    private String tgl_transaksi;
    private double harga;
    private int jumlah;
    private double total;

    // Constructor
    public pembelian(String noTransaksi, String kdSupplier, String perusahaan, String namaBarang, String tglTransaksi, double harga, int jumlah, double total) {
        this.no_transaksi = noTransaksi;
        this.kd_supplier = kdSupplier;
        this.perusahaan = perusahaan;
        this.nama_barang = namaBarang;
        this.tgl_transaksi = tglTransaksi;
        this.harga = harga;
        this.jumlah = jumlah;
        this.total = total;
    }

    // Getters and Setters
    public String getNoTransaksi() {
        return no_transaksi;
    }

    public void setNoTransaksi(String noTransaksi) {
        this.no_transaksi = noTransaksi;
    }

    public String getKdSupplier() {
        return kd_supplier;
    }

    public void setKdSupplier(String kdSupplier) {
        this.kd_supplier = kdSupplier;
    }

    public String getPerusahaan() {
        return perusahaan;
    }

    public void setPerusahaan(String perusahaan) {
        this.perusahaan = perusahaan;
    }

    public String getNamaBarang() {
        return nama_barang;
    }

    public void setNamaBarang(String namaBarang) {
        this.nama_barang = namaBarang;
    }

    public String getTglTransaksi() {
        return tgl_transaksi;
    }

    public void setTglTransaksi(String tglTransaksi) {
        this.tgl_transaksi = tglTransaksi;
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
        System.out.println("No Transaksi: " + no_transaksi);
        System.out.println("Kode Supplier: " + kd_supplier);
        System.out.println("Perusahaan: " + perusahaan);
        System.out.println("Nama Barang: " + nama_barang);
        System.out.println("Tanggal Transaksi: " + tgl_transaksi);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Total: " + total);
    }
    }
}
