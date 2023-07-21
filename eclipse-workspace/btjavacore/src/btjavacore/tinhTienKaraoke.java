package btjavacore;

import java.util.Scanner;

public class tinhTienKaraoke {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bd=0;
		int kt=0;
		int nuoc=0;
		do{
			System.out.println("Vui long nhap gio bat dau tu 9h-24h: ");
			bd = sc.nextInt();
		}while(bd<9);
		 do {
				System.out.println("Vui long nhap gio ket thuc: ");
				 kt = sc.nextInt();

		} while (kt>24);
		do {
			System.out.println("Vui long nhap so chai nuoc: ");
			nuoc = sc.nextInt();
		} while (nuoc<0);
		
		sc.close();
		double kq = 0;
		int time = kt - bd;
		if (time <= 3) {
			kq = time * 30000 + nuoc * 10000;
		} else if (time > 3) {
			kq = 3 * 30000 + (time - 3) * 30000 * 0.3 + nuoc * 10000;
		}
		if(kt<=17) {
			kq=kq*0.8;
		}
		
		System.out.println("tong chi phi phai tra: " + kq);
	}

	
}
