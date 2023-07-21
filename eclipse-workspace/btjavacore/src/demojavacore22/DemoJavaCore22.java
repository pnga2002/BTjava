package demojavacore22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Nguyen tac dat trn file: Viet hoa chu cai dau
public class DemoJavaCore22 {
	// ham main la ham chay chinh
	public static void main(String[] args) {
//		System.out.println("Hello Cybersoft");
//		System.out.println("   J    a  V     V  a");
//		System.out.println("   J   a a  V   V  a a");
//		System.out.println("J  J  aaaaa  V V  aaaaa");
//		System.out.println(" JJ  a     a  V  a     a");
//		int soA = 7;
//		int soB = 8;
//		int ketQua = soA + soB;
//		double soC = 3.5;
//		float soD = 2.4f;
//		boolean dungSai = false;
//		char kieuChar = 'H';
//		String kieuCHuoi = "Hello";
//		System.out.println("Ket qua la; " + ketQua);
//
//		double dtb = 7;
//		if (dtb >= 0 && dtb <= 10) {
//			if(dtb>=9) {
//				
//			}
//		}
//		int sum = 0;
//		int input = 0;
//		Scanner sc = new Scanner(System.in);
//		do {
//			System.out.println("Vui long nhap so: ");
//			input = sc.nextInt();
//			if(input<0) {
//				break;
//			}
//			sum+=input;
//		}while(input>0);
//		System.out.println(sum);
//		
		//
		List<Integer> ds = new ArrayList<Integer>();
		ds.add(20);
		ds.add(15);
		ds.add(99);
		for(int i=0;i<ds.size();i++) {
			System.out.println("kiemtra: "+ ds.get(i));
		}
	}
}
