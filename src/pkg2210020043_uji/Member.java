/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2210020043_uji;

/**
 *
 * @author LENOVO
 */
public class Member {
    public class member {

    private String kd_member;
    private String nama;
    private String telepon;
    private String alamat;

    // Constructor
    public member(String kdMember, String nama, String telepon, String alamat) {
        this.kd_member = kdMember;
        this.nama = nama;
        this.telepon = telepon;
        this.alamat = alamat;
    }

    // Getters and Setters
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

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Method to display data
    public void displayData() {
        System.out.println("Kode Member: " + kd_member);
        System.out.println("Nama: " + nama);
        System.out.println("Telepon: " + telepon);
        System.out.println("Alamat: " + alamat);
    }
    }
    
}
    
