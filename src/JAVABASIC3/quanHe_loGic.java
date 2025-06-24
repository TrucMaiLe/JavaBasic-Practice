package JAVABASIC3;

public class quanHe_loGic {
    static int number = 100;

    static void soSanh(int n) {
        if (n == number) {
            System.out.println("Sồ vừa truyền vào bằng " + number);
        } else if (n < number) {
            System.out.println("Sồ vừa truyền vào là " + n + " nhỏ hơn " + number);
        } else {
            System.out.println("Sồ vừa truyền vào là " + n + " lớn hơn " + number);
        }
    }

    public static void main(String[] args) {
        int age = 25;
        String adress = "Đà Lạt";
        String name = "Mai";
        if (adress.equals("Đà Lạt") && name.equals("Mai")) {
            System.out.println(name + ", " + adress);
        } else {
            System.out.println("ko có kết quả");
        }
        System.out.println("================================================================");
        soSanh(50);
    }
}
