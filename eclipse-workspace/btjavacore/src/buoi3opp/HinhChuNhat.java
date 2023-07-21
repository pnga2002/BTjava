package buoi3opp;

import java.util.Scanner;

public class HinhChuNhat {
	private double dai;
	private double rong;
	
	public HinhChuNhat() {
		
	}
	public HinhChuNhat(double dai, double rong) {
		this.dai = dai;
		this.rong = rong;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui long nhap chieu dai: ");
		this.dai = sc.nextDouble();
		System.out.println("Vui long nhap chieu rong: ");
		this.rong = sc.nextDouble();
		sc.close();
	}
	
	public void xuat() {
		System.out.println("Chieu dai: " + this.dai);
		System.out.println("Chieu rong: " + this.rong);
	}
	public double getDai() {
		return dai;
	}
	public void setDai(double dai) {
		this.dai = dai;
	}
	public double getRong() {
		return rong;
	}
	public void setRong(double rong) {
		this.rong = rong;
	}
	
	
}
