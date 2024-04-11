import java.time.Year;
import java.util.Scanner;

public class NameString {
    static String getName(String name, int age) {
        int year = Year.now().getValue() - age;
        System.out.println(name + ", Вы родились в " + year);
        return name;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        String name = sc.nextLine();
        System.out.println("Введите Ваш возраст");
        int age = sc.nextInt();
        getName(name,age);

        sc.close();
    }
}
