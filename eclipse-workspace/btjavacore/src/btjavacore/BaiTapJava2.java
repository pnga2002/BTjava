package btjavacore;

import static java.lang.Integer.parseInt;

import java.io.File;
import java.lang.reflect.Array;
import java.nio.file.Path;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class BaiTapJava2 {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		run(menu());
	}

	public static int menu() {
		// IN MENU
		System.out.println(
				"+==============================================================================================================+");
		System.out.println(
				"|                                               MENU                                                        -  |");
		System.out.println(
				"+--------------------------------------------------------------------------------------------------------------+");
		System.out.println(
				"| 11 - nhập vào số tự nhiên n, in ra số tự nhiên lớn nhất nhỏ hơn log2 (n).                                    |");
		System.out.println(
				"| 12 - nhập vào số tự nhiên n (từ 1 đến 9) và in ra tam giác vuông có độ dài tương ứng                         |");
		System.out.println(
				"| 13 - Viết chương trình cho phép nhập vào số phần tử và từng phần tử của một mảng                             |");
		System.out.println(
				"| 14 - Viết chương trình cho phép nhập vào số phần tử và từng phần tử của một mảng, xóa phần tử bị lập         |");
		System.out.println(
				"| 15 - Viết chương trình cho phép nhập vào một chuỗi                                                           |");
		System.out.println(
				"| 16 - Viết chương trình kiểm tra xem năm nhập vào có phải năm nhuận hay không?                                |");
		System.out.println(
				"| 17 - Chương trình cho phép máy tính phát sinh ngẫu nhiên một số từ 1 đến 1000                                |");
		System.out.println(
				"| 18 - Chương trình tính và in số năm chờ đợi                                                                  |");
		System.out.println(
				"| 19 - Viết chương trình giải phương trình bậc 1 và bậc 2                                                      |");
		System.out.println(
				"| 20 - Viết chương trình tách một mảng số tự nhiên được nhập từ bàn phím thành 2 mảng                          |");
		System.out.println(
				"| 21 - Cho 2 con kangaroo ở tren cùng 1 đường, vị trí dương                                                    |");
		System.out.println(
				"| 22 - . Viết chương trình cho phép nhập vào String, tìm ra sub string palindromic có độ dài dài nhất          |");
		System.out.println(
				"| 0 - THOAT                                                                                                    |");
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
			if (choose >= 11 && choose <= 22) // KIEM TRA CO CHON TRONG 10 CHUC NANG
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
		case 11: // CHUC NANG 11
			System.out.println("+======================================+");
			System.out.println("|                CHUC NANG 11          |");
			System.out.println("+======================================+");
			case11();
			break;
		case 12: // CHUC NANG 12
			System.out.println("+======================================+");
			System.out.println("|                CHUC NANG 12          |");
			System.out.println("+======================================+");
			tamgiacSo();
			;
			break;
		case 13: // CHUC NANG 13
			System.out.println("+======================================+");
			System.out.println("|                CHUC NANG 13          |");
			System.out.println("+======================================+");
			mang13();
			break;
		case 14: // CHUC NANG 14
			System.out.println("+======================================+");
			System.out.println("|                CHUC NANG 14          |");
			System.out.println("+======================================+");
			case14();
			break;
		case 15: // CHUC NANG 15
			System.out.println("+======================================+");
			System.out.println("|                CHUC NANG 15          |");
			System.out.println("+======================================+");
			case15();
			break;
		case 16: // CHUC NANG 16
			System.out.println("+======================================+");
			System.out.println("|                CHUC NANG 16          |");
			System.out.println("+======================================+");
			case16();
			break;
		case 17: // CHUC NANG 17
			System.out.println("+======================================+");
			System.out.println("|                CHUC NANG 17          |");
			System.out.println("+======================================+");
			case17();
			break;
		case 18: // CHUC NANG 18
			System.out.println("+======================================+");
			System.out.println("|                CHUC NANG 18          |");
			System.out.println("+======================================+");
			case18();
			break;
		case 19: // CHUC NANG 19
			System.out.println("+======================================+");
			System.out.println("|                CHUC NANG 19          |");
			System.out.println("+======================================+");
			case19();
			break;
		case 20: // CHUC NANG 20
			System.out.println("+======================================+");
			System.out.println("|                CHUC NANG 20          |");
			System.out.println("+======================================+");
			case20();
			break;
		case 21: // CHUC NANG 21
			System.out.println("+======================================+");
			System.out.println("|                CHUC NANG 21          |");
			System.out.println("+======================================+");
			case21();
			break;
		case 22: // CHUC NANG 22
			System.out.println("+======================================+");
			System.out.println("|                CHUC NANG 22          |");
			System.out.println("+======================================+");
			case22();
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

//  CHUC NANG 11
	public static void case11() {
		System.out.println("Nhap so: ");
		int n = input.nextInt();
		while (n <= 0) {
			System.out.print("Số nhập vào phải lớn hơn 0. Mời bạn nhập lại: ");
			n = input.nextInt();
		}
		int kq = (int) (Math.log(n) / Math.log(2));
		System.out.println("ket qua la: " + kq);
		askExit();

	}

//  CHUC NANG 12
	public static void tamgiacSo() {
		System.out.println("Nhap so tu 1 -> 9: ");
		int num = input.nextInt();
		while (num <= 0 || num > 9) {
			System.out.print("Số nhập vào phải lớn hơn 0. Mời bạn nhập lại: ");
			num = input.nextInt();
		}
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		askExit();
	}

//  CHUC NANG 13
	public static void mang13() {
		// Khai bao cac ket qua tra ve
		double average;
		int min, max, amMax, duongMin;
		int tong = 0;

		System.out.println("Nhap so phan tu cua mang: ");
		int soLuong = input.nextInt();
		int arr[] = new int[soLuong];
		for (int i = 0; i < soLuong; i++) {
			System.out.println("Nhap so phan tu thu " + i + ": ");
			arr[i] = input.nextInt();
		}
		// tinh tong
		max = arr[0];
		min = arr[0];
		amMax = -1;
		duongMin = -1;
		for (int i = 0; i < arr.length; i++) {
			tong += arr[i];
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
			if ((duongMin == -1 || duongMin > arr[i]) && arr[i] > 0) {
				duongMin = arr[i];
			}
			if ((amMax == -1 || amMax < arr[i]) && arr[i] < 0) {
				amMax = arr[i];
			}

		}
		// so chan
		System.out.print("So chan: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		// so le
		System.out.print("So le: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		System.out.println("Trung binh: " + tong / (arr.length + 1));
		System.out.println("Lon nhat: " + max);
		System.out.println("Nho nhat: " + min);
		System.out.println("Duong Nho nhat: " + duongMin);
		System.out.println("Am lon nhat: " + amMax);
		
		
		// Khởi tạo một ArrayList mới và sao chép tất cả các phần tử từ ArrayList cũ sang ArrayList mới
        List<Integer> newList = new ArrayList<>();

        for(int i=0;i < soLuong;i++){
            newList.add(arr[i]);
        }

        System.out.println("Nhập vào vị trí muốn thêm");
        int index = input.nextInt();

        System.out.println("Nhập vào giá trị muốn thêm");
        int newValue = input.nextInt();

        newList.add(index, newValue);
        System.out.println("Mảng được thêm là: " + newList + "\n");

        System.out.println("Nhập vào vi tri muốn xóa");
        int indexRemove = input.nextInt();

        newList.remove(indexRemove);
        System.out.println("Mảng đã xóa là: " + newList + "\n");
		
		
		askExit();
	}

//  CHUC NANG 14
	public static void case14() {
        // Nhập vào số phần tử của mảng
        System.out.print("Nhập vào số phần tử của mảng: ");
        int m = input.nextInt();

        // Khởi tạo một HashSet để lưu trữ các giá trị của mảng
        Set<Integer> set = new HashSet();

        // Nhập giá trị cho mảng và thêm vào HashSet
        for (int i = 0; i < m; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            int value = input.nextInt();
            set.add(value);
        }

        // Khởi tạo một mảng mới với độ dài bằng kích thước của HashSet
        int[] newArray = new int[set.size()];

        // Chuyển các giá trị từ HashSet sang mảng mới
        int index2 = 0;
        for (int value : set) {
            newArray[index2++] = value;
        }

        // In ra mảng mới
        System.out.println("Mảng mới sau khi loại bỏ các phần tử trùng lặp:");
        System.out.println(Arrays.toString(newArray));
		askExit();
	}

//	CHUC NANG 15
	public static void case15() {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String input = scanner.nextLine();

        // a) Độ dài của chuỗi
        int length = input.length();
        System.out.println("Độ dài của chuỗi là: " + length);

        // b) Ký tự tại vị trí nhất định
        System.out.print("Nhập vị trí muốn lấy ký tự: ");
        int index = scanner.nextInt();
        char character = input.charAt(index);
        System.out.println("Ký tự tại vị trí " + index + " là: " + character);

        // c) Kiểm tra xem có chuỗi phụ "abcdef" hay không
        boolean containsSubstring = input.contains("abcdef"); //contains kiểm tra xem chuỗi (?) có phụ thuộc ? không
        if (containsSubstring) {
            System.out.println("Chuỗi vừa nhập có chứa chuỗi phụ \"abcdef\".");
        } else {
            System.out.println("Chuỗi vừa nhập không có chứa chuỗi phụ \"abcdef\".");
        }
		askExit();
	}
	
//	CHUC NANG 16
	public static void case16() {
		int year;
        System.out.println("Nhập vào năm bạn cần kiểm tra:");
        year = input.nextInt();
        boolean isLeap = false;
        if(year % 4 == 0)//chia hết cho 4 là năm nhuận
        {
            if( year % 100 == 0)
            //nếu vừa chia hết cho 4 mà vừa chia hết cho 100 thì không phải năm nhuận
            {
                if ( year % 400 == 0)//chia hết cho 400 là năm nhuận
                    isLeap = true;
                else
                    isLeap = false;//không chia hết cho 400 thì không phải năm nhuận
            }
            else//chia hết cho 4 nhưng không chia hết cho 100 là năm nhuận
                isLeap = true;
        }
        else {
            isLeap = false;
        }
        if(isLeap==true)
            System.out.println(year + " là năm nhuận.");
        else
            System.out.println(year + " không phải là năm nhuận.");
		askExit();
	}

//	CHUC NANG 17
	public static void case17() {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int guess = 0;
        int numGuesses = 0;

        System.out.println("Đây là game mò số hehe!");
        System.out.println("Bạn hãy đoán thử từ số 1 đến số 100");
        System.out.println("Bạn đoán nó sẽ là gì? Bạn có 4 lần đoán!");

        while (guess != secretNumber && numGuesses < 4) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numGuesses++;
            if (guess < secretNumber) {
                System.out.println("Hơi thấp rồi. Lại đi!.");
            } else if (guess > secretNumber) {
                System.out.println("Cao quá bạn tôi ơi. Lại nào!.");
            } else {
                System.out.println("Đoán trúng rồi! Qúa đỉnh cậu ơi.");
            }
        }

        if (numGuesses >= 4) {
            System.out.println("Xin lỗi bạn đã thua cuộc. Bạn đã hết lượt");
            System.out.println("Đáp án là " + secretNumber);
        }


		askExit();

	}

//	CHUC NANG 18
	public static void case18() {
		Scanner sc = new Scanner(System.in);
        double interestRate = 0.05;

        System.out.println("Chào mừng đến với ngân hàng siêu cấp vô địch uy tín ");
        System.out.println("Bạn hãy nhập số tiền muốn gửi: ");
        double money = sc.nextDouble();
        
        double xe_hoi = 20000, nha = 50000;
        System.out.println("Mời bạn chọn thứ muốn mua");
        System.out.println("1. Xe hơi. Giá: " + xe_hoi + "USD");
        System.out.println("2. Nhà. Giá: " + nha + "USD");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
            	if(money>xe_hoi) {
            		System.out.println("Bạn quá giàu rồi không cần phải đợi chờ gì nữa, mua luôn đi!");
            	} else {
            		
                double t = (Math.log(xe_hoi/money))/(Math.log(Math.E)*interestRate);
                System.out.printf("Số năm ít nhất mà anh X phải chờ đợi là: %.2f \n", t);
            	}
                break;
            case 2:
            	if(money>nha) {
            		System.out.println("Bạn quá giàu rồi không cần phải đợi chờ gì nữa, mua luôn đi!");
            	} else {
                double result = (Math.log(nha/money))/(Math.log(Math.E)*interestRate);
                System.out.printf("Số năm ít nhất mà anh X phải chờ đợi là: %.2f \n", result);
            	}
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }
		askExit();
	}

//	CHUC NANG 19
	public static void case19() {
		DecimalFormat decimalFormat = new DecimalFormat("#.##");    // làm tròn đến 2 chữ số thập phân
        Scanner scanner = new Scanner(System.in);

        int aNumber, bNumber;
        System.out.println("Nhập vào số a: ");
        aNumber = scanner.nextInt();
        System.out.println("Nhập vào số b: ");
        bNumber = scanner.nextInt();
        System.out.println("Phương trình bạn vừa nhập vào là: " + aNumber + "x + " + bNumber + " = 0.");
        if (aNumber == 0) {
            if (bNumber == 0) {
                System.out.println("Phương trình này có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double nghiem = (double) -bNumber / aNumber;   // ép kiểu để cho ra kết quả chính xác
            System.out.println("Phương trình có nghiệm x = " + decimalFormat.format(nghiem) + ".");
        }
		askExit();
	}

//	CHUC NANG 20
	public static void case20() {
		Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("\nNhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
            System.out.println(n);
        } while (n < 0);

        int array[] = new int[n];

        System.out.println("\nNhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }

        int[] evenNumbers = new int[array.length];
        int[] oddNumbers = new int[array.length];
        int evenIndex = 0;
        int oddIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenNumbers[evenIndex] = array[i];
                evenIndex++;
            } else {
                oddNumbers[oddIndex] = array[i];
                oddIndex++;
            }
        }

        System.out.print("Số chẵn: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();

        System.out.print("Số lẻ: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
		askExit();
	}
	public static void case21() {
		System.out.println("Tới khúc này đọc đề nhức đầu quá mentor oiiiiii");
		System.out.println("Em sẽ hoàn thiện sau khi hết nhức đầu!!!");
		askExit();
	}
	public static void case22() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int maxLength = 0;
		 String longestPalindromicSubStr = "";

	        for (int i = 0; i < str.length(); i++) {
	            for (int j = i + 1; j <= str.length(); j++) {
	                String subStr = str.substring(i, j);
	                if (isPalindromic(subStr) && subStr.length() > maxLength) {
	                    maxLength = subStr.length();
	                    longestPalindromicSubStr = subStr;
	                }
	            }
	        }

	        System.out.println("Longest palindromic substring: " + longestPalindromicSubStr);
	        System.out.println();
	        System.out.println();
	        System.out.println("CẢM ƠN MENTOR NHIỀU LẮM !!!!!");
	        askExit();
	}
	//ho tro case 22
	public static boolean isPalindromic(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
