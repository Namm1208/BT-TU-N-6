import java.util.Scanner;

class Sach {
    private String maSach;
    private String tenSach;
    private String tenTacGia;
    private int soTrang;
    private String loaiSach;
    private String nhaXuatBan;
    private int soTap;
    private double gia;

    // Phương thức nhập thông tin sách
    public void nhapSach() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLine();

        System.out.print("Nhap ten sach: ");
        tenSach = sc.nextLine();

        System.out.print("Nhap ten tac gia: ");
        tenTacGia = sc.nextLine();

        System.out.print("Nhap so trang: ");
        soTrang = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhap loai sach: ");
        loaiSach = sc.nextLine();

        System.out.print("Nhap nha xuat ban: ");
        nhaXuatBan = sc.nextLine();

        System.out.print("so tap: ");
        soTap = sc.nextInt();

        System.out.print("Nhap gia: ");
        gia = sc.nextDouble();
    }

    // Phương thức in thông tin sách
    public void inSach() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Ten tac gia: " + tenTacGia);
        System.out.println("So trang: " + soTrang);
        System.out.println("Loai sach: " + loaiSach);
        System.out.println("Nha xuat ban: " + nhaXuatBan);
        System.out.println("So tap: " + soTap);
        System.out.println("Gia: " + gia);
    }
}

public class bai3_1 {
    public static void main(String[] args) {
        // Khai báo đối tượng SACH
        Sach sach = new Sach();

        // Nhập thông tin 1 cuốn sách và hiển thị thông tin cuốn sách vừa nhập
        System.out.println("Nhap thong tin cho sach:");
        sach.nhapSach();
        System.out.println("Thong tin sach vừa nhap:");
        sach.inSach();

        // Nhập danh sách các đầu sách của thư viện và in danh sách các cuốn sách đã nhập
        int n = 3; // số lượng sách cần nhập
        Sach[] dsSach = new Sach[n];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cho sách thu " + (i+1) + ":");
            dsSach[i] = new Sach();
            dsSach[i].nhapSach();
        }

        System.out.println("Danh sach cac cuon sach đa nhap:");
        for (int i = 0; i < n; i++) {
            System.out.println("Sach thu " + (i+1) + ":");
            dsSach[i].inSach();
        }
    }
}
