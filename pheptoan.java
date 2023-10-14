import java.util.Scanner;

public class pheptoan {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Nhap phan tu thu nhat: ");
         int a = input.nextInt();
         System.out.println("Nhap phan tu thu hai: ");
         int b = input.nextInt();
        int tong=a+b;
        int hieu=a-b;
        int tich=a*b;
        int thuong=a/b;
        System.out.println(a+" + "+b+" = " + tong);
        System.out.println(a+" - "+b+" = " + hieu);
        System.out.println(a+" * "+b+" = " + tich);
        System.out.println(a+" / "+b+" = " + thuong);
        System.out.println("Vay la chi can nho cai "+a+" va cai "+b+" la ra duoc cai "+tong+" dung khong?");

    }
}
