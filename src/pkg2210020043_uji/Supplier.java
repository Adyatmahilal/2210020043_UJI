/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2210020043_uji;

/**
 *
 * @author LENOVO
 */
public class Supplier {

    private String kd_supplier;
    private String perusahaan;
    private String nama_barang;

    // Constructor
    public Supplier(String kdSupplier, String perusahaan, String namaBarang) {
        this.kd_supplier = kdSupplier;
        this.perusahaan = perusahaan;
        this.nama_barang = namaBarang;
    }

    // Getters and Setters
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

    // Method to display data
    public void displayData() {
        System.out.println("kd_supplier: " + kd_supplier);
        System.out.println("Perusahaan: " + perusahaan);
        System.out.println("nama_barang: " + nama_barang);
    }

    public static void main(String[] args) {
        // Contoh penggunaan
        Supplier supplier1 = new Supplier("S001", "Supplier A", "CONVERSE 70S");
        supplier1.displayData();
    }
}
