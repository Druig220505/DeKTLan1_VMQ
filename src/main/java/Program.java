
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QuanLySach qls = new QuanLySach();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== Menu =====");
            System.out.println("1. Xuat danh sach Sach va tong tri gia");
            System.out.println("2. Lay Sach phat hanh truoc nam 2015");
            System.out.println("3. Tim Sach theo ten");
            System.out.println("4. Sap xep Sach theo gia tang dan");
            System.out.println("5. Xoa Sach theo ma so");
            System.out.println("6. Sua gia bia theo ma sach");
            System.out.println("7. Tinh tong tri gia cac Sach");
            System.out.println("0. Thoat");
            System.out.print("Lua chon: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    qls.xuatDS();
                    break;
                case 2:
                    qls.laySach();
                    break;
                case 3:
                    qls.timSach();
                    break;
                case 4:
                    qls.sapXep();
                    System.out.println("Da sap xep theo gia tang dan.");
                    break;
                case 5:
                    System.out.print("Nhap ma so sach can xoa: ");
                    String masachXoa = scanner.nextLine();
                    qls.xoaSachTheoMaSach(masachXoa);
                    System.out.println("Da xoa sach co ma sach: " + masachXoa);
                    break;
                case 6:
                    System.out.print("Nhap ma so sach can sua gia: ");
                    String masachSua = scanner.nextLine();
                    System.out.print("Nhap gia moi: ");
                    double giaMoi = scanner.nextDouble();
                    qls.suaGiaBanTheoMaSo(masachSua, giaMoi);
                    System.out.println("Da sua gia sach co ma sach: " + masachSua);
                    break;
                case 7:
                    double tongTriGia = qls.tongTriGia();
                    System.out.println("Tong tri gia cua cac sach : " + tongTriGia);
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        } while (choice != 0);
    }
}



