/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2210020043_uji;

/**
 *
 * @author LENOVO
 */
public class Penjualan {
    public class penjualan {

    private String no_transaksi;
    private String kodeBarang;
    private String tgl_transaksi;
    private String nama_barang;
    private int stok;
    private double harga;
    private int jumlah;
    private double total;
    private String kd_member;
    private String nama;
    private double diskon;
    private double total_diskon;
    private double bayar;
    private double kembali;

    // Constructor
    public penjualan(String noTransaksi, String kodeBarang, String tglTransaksi, String namaBarang, int stok, double harga, int jumlah, double total, String kdMember, String nama, double diskon, double totalDiskon, double bayar, double kembali) {
        this.no_transaksi = noTransaksi;
        this.kodeBarang = kodeBarang;
        this.tgl_transaksi = tglTransaksi;
        this.nama_barang = namaBarang;
        this.stok = stok;
        this.harga = harga;
        this.jumlah = jumlah;
        this.total = total;
        this.kd_member = kdMember;
        this.nama = nama;
        this.diskon = diskon;
        this.total_diskon = totalDiskon;
        this.bayar = bayar;
        this.kembali = kembali;
    }

    // Getters and Setters
    public String getNoTransaksi() {
        return no_transaksi;
    }

    public void setNoTransaksi(String noTransaksi) {
        this.no_transaksi = noTransaksi;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getTglTransaksi() {
        return tgl_transaksi;
    }

    public void setTglTransaksi(String tglTransaksi) {
        this.tgl_transaksi = tglTransaksi;
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

    public String getKdMember() {
        return kd_member;
    }

    public void setKdMember(String kdMember) {
        this.kd_member = kdMember;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getDiskon() {
        return diskon;
    }

    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }

    public double getTotalDiskon() {
        return total_diskon;
    }

    public void setTotalDiskon(double totalDiskon) {
        this.total_diskon = totalDiskon;
    }

    public double getBayar() {
        return bayar;
    }
    }
    
}
