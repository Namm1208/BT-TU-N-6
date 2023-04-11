import java.util.Scanner;

public class bai3_2 {
public static void main(String[] args) {
	int luachon;
    Scanner scanner=new Scanner(System.in);
    System.out.print("Moi ban nhap lua chon: ");
    luachon=scanner.nextInt();
    switch(luachon){
    case 1:
    DIEM d=new DIEM();
    d.Nhapdiem();
    d.Indiem();
    break;
    case 2:
    TAMGIAC tg=new TAMGIAC();
    tg.Nhaptg();
    tg.Intamgiac();
    tg.Kiemtra();
    tg.Chuvi();
    tg.Dientich();
    break;
    case 3:
    DUONGTRON ht=new DUONGTRON();
    ht.Nhapht();
    ht.Inht();
    ht.Chuvi();
    ht.Dientich();
    break;
    }
}
}