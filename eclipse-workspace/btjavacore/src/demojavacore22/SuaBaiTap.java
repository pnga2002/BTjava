package demojavacore22;

import java.util.Scanner;

public class SuaBaiTap {
	static Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args) {
		System.out.println("Vui long nhap do dai cua mang");
		int[] mangA = new int[sc.nextInt()];
		nhap(mangA);
		xuat(mangA);
	}
	public static void nhap(int[] mang) {
		for(int i=0;i<mang.length;i++) {
			mang[i] = sc.nextInt();
		}
	}
	public static void xuat(int[] mang) {
//		foreach
		for(int i: mang) {
			System.out.println("gia tri: "  + i) ;
		}
	}
	
}
