package NhapXuat;

import java.util.Scanner;

public class Vidu1 {
	public static void main(String[] args) {
	    int n;
	    String chuoi;
	    Scanner scanner = new Scanner(System.in);
	         
	    System.out.println("Nhập vào chuỗi bất kỳ: ");
	    chuoi = scanner.nextLine();
	    System.out.println("Nhập vào số nguyên: ");
	    n = scanner.nextInt();
	         
	    if (n < 2) {
	        System.out.println(chuoi);
	    } else {
	        for (int i = 0; i < n; i++) {
	            // in chuỗi trên cùng 1 dòng
	            System.out.print(chuoi);    
	        }
	    }
	}

}
