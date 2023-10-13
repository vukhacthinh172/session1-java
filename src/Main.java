import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static int global;
     static char text ;
    public static void main(String[] args) {
        int a = 10;
        double d = 5.6;
        float f = 3.2f; // ép kiểu về float
        boolean check = true;
        short sh = 100;
        long l = 1000;
        char c = '.';
        System.out.println("giá trị biến a " + a);
        System.out.println("giá trị biến a " + d);
        System.out.println("giá trị biến a " + f);
        System.out.println("giá trị biến a " + check);
        System.out.println("giá trị biến a " + sh);
        System.out.println("giá trị biến a " + c);
        System.out.println("giá trị biến a " + l);
        System.out.println(global);
        // ấn giữ crlt

        String fullName = " acbh sdfjhk";
        // giá trị mặc định của các đối tượng tạo ra từ class
        String name = new String("abcdvhg"); // từ khóa new dùng để gọi đến hàm khỏi tạo
        System.out.println(name);
        //cách để lấy ngày tháng
        Date date = new Date();// đã lỗi thời k dùng nữa
        System.out.println("ngày giờ hiện tại " + date);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        // nhập xuất dữ liệu
        Scanner sc = new Scanner(System.in);
        System.out.println("hãy nhập vào tên cảu bạn ");
        String hoTen = sc.nextLine();// là phương thức cho phép người dùng nhạp 1 chuỗi
        System.out.println("ban vua nhap" + hoTen);
        System.out.println(" nhap 1 so");
        int number = Integer.parseInt(sc.nextLine()); // tránh bị nuốt chuỗi
        System.out.println("nhap chuoi");
        String str= sc.nextLine();
        // nhap so
//        int number = sc.nextInt();
//        float real = sc.nextFloat();
//        double db =sc.nextDouble(); // nhập double
//        char ch = sc.nextLine().charAt(0);// lấy kí tự đầu tiên
//        boolean boll = sc.nextBoolean();
        // System.out.print ko có ln : tất cả các kí tự in trên cùng 1 hàng , k xuôsng dòng
        // System.out.println :tất cả các kí tự  xuôsng dòng
        // kí hiệu %s- đại diện cho chuỗi
        // kí hiệu %d - đại diện cho số nguyên
        //kí hiệu %f - đại diện cho số thực
        // ví dụ
        System.out.printf("ten:%s,tuoi:%d,diem:%.2f",fullName,a,d);
    }
}

