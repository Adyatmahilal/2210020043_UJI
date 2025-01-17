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

    private String noTransaksi;
    private String kodeBarang;
    private String tglTransaksi;
    private String namaBarang;
    private int stok;
    private double harga;
    private int jumlah;
    private double total;
    private String kdMember;
    private String nama;
    private double diskon;
    private double totalDiskon;
    private double bayar;
    private double kembali;

    // Constructor
    public Penjualan(String noTransaksi, String kodeBarang, String tglTransaksi, String namaBarang, int stok, double harga, int jumlah, double total, String kdMember, String nama, double diskon, double totalDiskon, double bayar, double kembali) {
        this.noTransaksi = noTransaksi;
        this.kodeBarang = kodeBarang;
        this.tglTransaksi = tglTransaksi;
        this.namaBarang = namaBarang;
        this.stok = stok;
        this.harga = harga;
        this.jumlah = jumlah;
        this.total = total;
        this.kdMember = kdMember;
        this.nama = nama;
        this.diskon = diskon;
        this.totalDiskon = totalDiskon;
        this.bayar = bayar;
        this.kembali = kembali;
    }

    // Getters and Setters
    public String getNoTransaksi() {
        return noTransaksi;
    }

    public void setNoTransaksi(String noTransaksi) {
        this.noTransaksi = noTransaksi;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getTglTransaksi() {
        return tglTransaksi;
    }

    public void setTglTransaksi(String tglTransaksi) {
        this.tglTransaksi = tglTransaksi;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
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
        return kdMember;
    }

    public void setKdMember(String kdMember) {
        this.kdMember = kdMember;
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
        return totalDiskon;
    }

    public void setTotalDiskon(double totalDiskon) {
        this.totalDiskon = totalDiskon;
    }

    public double getBayar() {
        return bayar;
    }

    public void setBayar(double bayar) {
        this.bayar = bayar;
    }

    public double getKembali() {
        return kembali;
    }

    public void setKembali(double kembali) {
        this.kembali = kembali;
    }
}
