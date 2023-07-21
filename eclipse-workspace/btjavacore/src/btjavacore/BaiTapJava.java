package btjavacore;

import static java.lang.Integer.parseInt;

import java.io.File;
import java.lang.reflect.Array;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaiTapJava {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		run(menu());
	}

	public static int menu() {
		// IN MENU
		System.out.println(
				"+=============================================================================================================+");
		System.out.println(
				"|                                               MENU                                                          |");
		System.out.println(
				"+-------------------------------------------------------------------------------------------------------------+");
		System.out.println(
				"| 1 - Viết chương trình in quốc kỳ Mỹ như hình bên                                                            |");
		System.out.println(
				"| 2 - chuyển đổi số từ hệ cơ số 10 sang hệ cơ số nhị phân và ngược lại                                        |");
		System.out.println(
				"| 3 - Viết chương trình in ra các thông tin sau đây                                                           |");
		System.out.println(
				"| 4 - Nhập vào một số tự nhiên và in ra tổng các chữ số của số tự nhiên đó                                    |");
		System.out.println(
				"| 5 - Viết chương trình nhập vào tọa độ A(x1, y1) và B(x2, y2) trên hệ trục toạ độ Oxy. Tinh AB               |");
		System.out.println(
				"| 6 - Viết chương trình cho phép nhập vào một chuỗi, In ra chuỗi theo thứ tự ngược lại                        |");
		System.out.println(
				"| 7 - nhập và in ra các ước số của số tự nhiên đó                                                             |");
		System.out.println(
				"| 8 - nhập vào một chuỗi viết thường, in ra chuỗi trên các ký tự đầu tiên được viết in hoa                    |");
		System.out.println(
				"| 9 - nhập vào 2 số nguyên dương (từ 10 đến 99),TRUE nếu 2 số trên có cùng một hoặc 2 chữ số, ngược lại FALSE |");
		System.out.println(
				"| 10 - nhập vào số tự nhiên n, in ra tổng các số nguyên tố từ 1 đến n                                         |");
		System.out.println(
				"| 0 - THOAT                                                                                                   |");
		System.out.println(
				"+=============================================================================================================+");

		// CHON CHUC NANG
		int choose = 0;
		System.out.println("   >>>>> MOI BAN CHON CHUC NANG <<<<<");
		do {
			try {
				choose = parseInt(input.nextLine());
			} catch (NumberFormatException e) { // KIEM TRA KIEU GIA TRI NHAP
				// YEU CAU NHAP LAI
				System.out.println("+======================================+");
				System.out.println("   #########  KHONG HOP LE  ########");
				System.out.println("+======================================+");
				System.out.println("  >>>> MOI BAN CHON CHUC LAI NANG <<<<");
				choose = 0;
				continue;
			}
			if (choose >= 0 && choose <= 10) // KIEM TRA CO CHON TRONG 10 CHUC NANG
				break;
			System.out.println("+======================================+");
			System.out.println("  ######  KHONG CO CHUC NANG " + choose + " ######");
			System.out.println("+======================================+");
			System.out.println("  >>>> MOI BAN CHON CHUC LAI NANG <<<<");
		} while (true);

		return choose;

	}

	public static void run(int chosen) {
		switch (chosen) {
		case 1: // CHUC NANG 1
			System.out.println("+======================================+");
			System.out.println("|                CHUC NANG 1           |");
			System.out.println("+======================================+");
			quocKy();
			break;
		case 2: // CHUC NANG 2
			System.out.println("+======================================+");
			System.out.println("|                CHUC NANG 2           |");
			System.out.println("+======================================+");
			chuyenDoi();
			break;
		case 3: // CHUC NANG 3
			System.out.println("+======================================+");
			System.out.println("|                CHUC NANG 3           |");
			System.out.println("+======================================+");
			ThongTin();
			break;
		case 4: // CHUC NANG 4
			System.out.println("+======================================+");
			System.out.println("|                CHUC NANG 4           |");
			System.out.println("+======================================+");
			tongKySo();
			break;
		case 5: // CHUC NANG 5
			System.out.println("+======================================+");
			System.out.println("|                CHUC NANG 5           |");
			System.out.println("+======================================+");
			tinhAB();
			break;
		case 6: // CHUC NANG 6
			System.out.println("+======================================+");
			System.out.println("|                CHUC NANG 6           |");
			System.out.println("+======================================+");
			daoNguoc();
			break;
		case 7: // CHUC NANG 7
			System.out.println("+======================================+");
			System.out.println("|                CHUC NANG 7           |");
			System.out.println("+======================================+");
			timUoc();
			break;
		case 8: // CHUC NANG 8
			System.out.println("+======================================+");
			System.out.println("|                CHUC NANG 8           |");
			System.out.println("+======================================+");
			inHoa();
			break;
		case 9: // CHUC NANG 9
			System.out.println("+======================================+");
			System.out.println("|                CHUC NANG 9           |");
			System.out.println("+======================================+");
			case9();
			break;
		case 10: // CHUC NANG 10
			System.out.println("+======================================+");
			System.out.println("|                CHUC NANG 10          |");
			System.out.println("+======================================+");
			tongNuyenTo();
			break;
		case 0: // THOAT CHUONG TRINH
			System.out.println("+======================================+");
			System.out.println("|         KET THUC CHUONG TRINH        |");
			System.out.println("+======================================+");
			askExit();
		}
	}

//	THOAT Hay Tiep Tuc
	// THOAT CHUONG TRINH
	public static void askExit() {
		System.out.println("  >>>>>>>>>>>> THOAT(Y/N) <<<<<<<<<<<");
		yn: while (true) {
			String answer = input.nextLine();
			switch (answer) {
			case "n":
				run(menu());
				break yn;
			// dong y tiep tuc chuong trinh
			case "N":
				run(menu());
				break yn;
			case "y": // thoat chuong trinh
			case "Y":
				System.out.println("+======================================+");
				System.out.println("     !!!!!!!!!! KET THUC !!!!!!!!!");
				System.out.println("+======================================+");
				System.exit(0);
			default:
				System.out.println("+======================================+");
				System.out.println("   #########  KHONG HOP LE  ########");
				System.out.println("+======================================+");
				System.out.println("  >>>>>>>>>>>> THOAT(Y/N) <<<<<<<<<<<");
			}
		}
	}

//  CHUC NANG 1
	public static void quocKy() {
		System.out.println("-----------------------USA-----------------");
		System.out.println("* * * * * * ================================");
		System.out.println(" * * * * *  ================================");
		System.out.println("* * * * * * ================================");
		System.out.println(" * * * * *  ================================");
		System.out.println("* * * * * * ================================");
		System.out.println(" * * * * *  ================================");
		System.out.println("* * * * * * ================================");
		System.out.println(" * * * * *  ================================");
		System.out.println("* * * * * * ================================");
		System.out.println("============================================");
		System.out.println("============================================");
		System.out.println("============================================");
		System.out.println("============================================");
		System.out.println("============================================");
		System.out.println("============================================");
		askExit();

	}

//  CHUC NANG 2
	public static void chuyenDoi() {
		System.out.println("Chuyen tu thap -> nhi phan: nhan phim 1");
		System.out.println("Chuyen tu nhi -> thap phan: nhan phim 2");
		int check = input.nextInt();
		if (check == 1) {
			System.out.println("Nhap so muon chuyen doi");
			int n = input.nextInt();
			String kq = "";
			while (n > 0) {
				kq += n % 2;
				n = n / 2;
			}
			StringBuilder str = new StringBuilder(kq);
			System.out.println(str.reverse().toString());
		}
		if (check == 2) {
			System.out.println("Nhap so muon chuyen doi");
			int n = input.nextInt();
			int i = 0;
			int kq = 0;
			while (n > 0) {
				kq += n % 10 * Math.pow(2, i);
				i++;
				n = n / 10;
			}
			System.out.println(kq);
		}
		askExit();
	}

//  CHUC NANG 3
	public static void ThongTin() {
		File file = new File("");
		System.out.println("Java Version: 1.8.0_71");
		System.out.println("Java Runtime Version: 1.8.0_71-b15");
		System.out.println("Java Home: /otp/jdk/jdk1.8.0_71/jre");
		System.out.println("Java Vendor: Oracle Corporation");
		System.out.println("Java Vendor URL: http://Java.oracle.com/");
		System.out.println("Java Class Path: " + file.getAbsolutePath());
		askExit();
	}

//  CHUC NANG 4
	public static void tongKySo() {
		System.out.println("Nhap so: ");
		int num = input.nextInt();
		int kq = 0;
		int bienDem;
		while (num <= 0) {
			System.out.print("Số nhập vào phải lớn hơn 0. Mời bạn nhập lại: ");
			num = input.nextInt();
		}
		while (num > 0) {
			bienDem = num % 10;
			kq += bienDem;
			num /= 10;
		}
		System.out.println("Tong cac chu so: " + kq);
		askExit();
	}

//	CHUC NANG 5
	public static void tinhAB() {
		double xA, yA; // tọa độ điểm A
		double xB, yB; // tọa độ điểm B
		double dodaiAB; // độ dài đoạn thắng AB
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập tọa độ điểm A: ");
		System.out.println("\tNhập hoành độ điểm A:");
		xA = scanner.nextDouble();
		System.out.println("\tNhập tung độ điểm A: ");
		yA = scanner.nextDouble();

		System.out.println("\nNhập tọa độ điểm B: ");
		System.out.println("\tNhập hoành độ điểm B: ");
		xB = scanner.nextDouble();
		System.out.println("\tNhập tung độ điểm B: ");
		yB = scanner.nextDouble();

		// tính độ dài AB
		dodaiAB = Math.sqrt(Math.pow((xB - xA), 2) + Math.pow((yB - yA), 2));
		System.out.println("Độ dài đoạn thắng AB = " + dodaiAB);
		askExit();
	}

//	CHUC NANG 6
	public static void daoNguoc() {
		System.out.println("Vui long nhap chuoi: ");
		String chuoi = input.nextLine();
		StringBuilder str = new StringBuilder(chuoi);
		System.out.println(str.reverse().toString());
		askExit();
	}

//	CHUC NANG 7
	public static void timUoc() {
		System.out.println("Nhap so muon tim uoc: ");
		List<Integer> list = new ArrayList<>();
		int num = input.nextInt();
		while (num <= 0) {
			System.out.print("Số nhập vào phải lớn hơn 0. Mời bạn nhập lại: ");
			num = input.nextInt();
		}
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				list.add(i);
			}
		}
		System.out.println(list);
		askExit();

	}

//	CHUC NANG 8
	public static void inHoa() {
		System.out.println("Nhap chuoi muon chuyen doi: ");

		String kq = "";
		String num = input.nextLine();
		String[] list = num.split(" ");
		for (String x : list) {
			String firstLetter = x.substring(0, 1);
			String remainingLetters = x.substring(1, x.length());
			firstLetter = firstLetter.toUpperCase();
			x = firstLetter + remainingLetters;
			kq += x + " ";
		}
		System.out.println(kq.trim());
		askExit();
	}

//	CHUC NANG 9
	public static void case9() {
		boolean kq = false;
		System.out.println("Nhap so thu nhat: ");
		int s1 = input.nextInt();
		System.out.println("Nhap so thu hai: ");
		int s2 = input.nextInt();
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		list1.add(s1 / 10);// 15/10=1
		list1.add(s1 - (s1 / 10) * 10);
		list2.add(s2 / 10);
		list2.add(s2 - (s2 / 10) * 10);
		for (int x : list1) {
			for (int y : list2) {
				if (x == y) {
					kq = true;
				}
			}
		}
		System.out.println("Ket qua : " + kq);
		askExit();
	}

//	CHUC NANG 10
	public static void tongNuyenTo() {
		System.out.println("Nhap so: ");
		int soNhap = input.nextInt();
		int num = 0;
		int kq = 0;
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= soNhap; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count += 1;
				}
			}
			if (count == 2) {
				list.add(i);
			}
		}
		for (int x : list) {
			kq += x;
		}
		System.out.println(list);
		System.out.println("Tong cac so Nguyen To là: " + kq);
		askExit();
	}
}
