/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;
/**
 *
 * @author ADMIN
 */
public class QuanLySach {
    private ArrayList<Sach> danhSachSach;
  
  public QuanLySach() {
        this.danhSachSach = new ArrayList<>();
        danhSachSach.add(new Sach("K011", "Lap trinh java", 95000, 2017));
         danhSachSach.add(new Sach("K012", "Co so du lieu", 85000, 2001));
         danhSachSach.add(new Sach("K013", "Nhap mon Lap trinh", 72000, 2013));
         danhSachSach.add(new Sach("K014", "Lap trinh Python", 39000, 2018));
          danhSachSach.add(new Sach("K015", "Lap trinh C#", 82000, 2015));
         
    }
  public void xuatDS() {
        double tongTriGia = 0;
        for (Sach s : danhSachSach) {
            System.out.println(s);
            tongTriGia += s.getGiabia();
        }
        System.out.println("Tong tri gia cua cac CD: " + tongTriGia);
    }
   public void laySach() {
        for (Sach cd : danhSachSach) {
            if (cd.getNamxuatban() < 2015) {
                System.out.println(s);
            }
        }
    }
    public void timSach() {
        for (Sach cd : danhSachSach) {
            if (cd.getTensach().toLowerCase().contains("tinh")) {
                System.out.println(s);
            }
        }
    }
    public void sapXep() {
        Collections.sort(danhSachSach, new Comparator<Sach>() {
            @Override
            public int compare(Sach s1, Sach s2) {
                return Double.compare(s2.getGiabia(), s1.getGiabia());
            }
        });
    }
     public void xoaCDTheoMaSo(String maso) {
        danhSachSach.removeIf(cd -> cd.getMasach().equals(maso));
    }

    public void suaGiaBanTheoMaSo(String masach, double giaMoi) {
        for (Sach s : danhSachSach) {
            if (s.getMasach().equals(masach)) {
                s.setGiabia(giaMoi);
                break;
            }
        }
    }
}
