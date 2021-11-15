package basic.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {

/**
 * 11.1 viet chuong trinh tinh tong 1-100
 */
		System.out.println("-Bai 11.1 : ");
		int i = 0;
		int tong = 0;
		while (i <= 100) {
			tong += i;
			i++ ;
		}
		System.out.println("Tong cac so tu [1-100] = " + tong);

		
/**
 * 11.2 Nhap so nguyen n . Tinh tong cac so chia het cho 3 be hon n
 */
		System.out.println("-Bai 11.2 : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so nguyen n = ");
		int n = sc.nextInt();
			tong = 0;
			i = 0;
		while(i < n) {
			if(i % 3 == 0)
				tong += i;
			i++;
		}
		System.out.println("Tong cac so chia het cho 3 = " + tong);
		
/**
 * 11.3 In ra 100 so Fibonacci dau tien
 */
		System.out.println("-Bai 11.3 : ");
		System.out.println("Day 100 so Fibonaci dau tien : ");
		int count = 0;
		long f0 = 0, f1 = 1 , fn = 0;
		while(count <= 100) {
			fn = f0 + f1;
			f0 = f1;
			f1 = fn;
			System.out.print(fn + " ");	
			count++;
		}
		System.out.println();
/**
 * 11.4 Nhap so nguyen n kiem tra so do phai so polinom khong	
 */
		System.out.println("-Bai 11.4 : ");
		System.out.println("Nhap so muon kiem tra polinom : ");
		int n4 = sc.nextInt();
		int temp = n4;
		int invert = 0;
		int mod = 0;
		while(temp > 0) {
			mod = temp % 10;
			temp /= 10;
			invert = invert * 10 + mod;
		}
		if(invert == n4) 
			System.out.println("Day la so polinom");
		else 
			System.out.println("Khong phai la so polinom");
		
/**
 * 11.5 Viet chuong trinh liet ke cac so 100-999 co tong chu so chia het cho 3
 */
		System.out.println("-Bai 11.5 : ");
		System.out.println("Cac so chia het cho 3 [100-999] :");
		int n5 = 100;
		while(n5 <= 999) {
			tong = 0 ;
			int m 	= 0;
			int n51 = n5;
			while(n51 > 0) {
				m 	= n51 % 10 ;
				n51 /= 10;
				tong += m ;	
			}
			if(tong % 3 == 0)
				System.out.print(n5 + " ");
			n5++;
		}		
	}
}
