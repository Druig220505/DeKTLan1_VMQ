/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Sach {
    private String masach;
    private String tensach;
    private Double giabia;
    private int namxuatban;

    public Sach(String masach, String tensach, Double giabia, int namxuatban) {
        this.masach = masach;
        this.tensach = tensach;
        this.giabia = giabia;
        this.namxuatban = namxuatban;
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public Double getGiabia() {
        return giabia;
    }

    public void setGiabia(Double giabia) {
        this.giabia = giabia;
    }

    public int getNamxuatban() {
        return namxuatban;
    }

    public void setNamxuatban(int namxuatban) {
        this.namxuatban = namxuatban;
    }
     @Override
    public String toString() {
        return "Sach{"+"masach: "+ masach +",tensach: "+ tensach +", giabia: "+ giabia +", namxuatban: "+ namxuatban +"}";
                }
}
