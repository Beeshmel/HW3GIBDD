import java.util.Scanner;

public class CalculatingMethods {
    // Создать 4 метода для расчета суммы, разности, произведения и деления двух чисел.
    //Создать пятый метод, который принимает 3 параметра – два числа и знак операции.
    //На основании знака операции необходимо вызывать ранее созданный метод и
    //получать результат операции.
    static int getSum(int x, int y){
        System.out.println("Сложение равно " + (x+y));
        return x + y;
    }
    static int getDif(int x, int y){
        System.out.println("Вычитание равно " + (x-y));
        return x - y;
    }
    static int getMultiply(int x, int y){
        System.out.println("Умножение равно " + (x*y));
        return x * y;
    }
    static double getDiv(int x,int y) {
        System.out.println(String.format("Деление равно %.2f", (double) (x/y)));
        return (double) x / y;
    }

    static double getQ(int x,int y, String s) {
        System.out.println("Решение вашей операции");
        if (s.equals("+")){
            return getSum(x,y);
        }else if (s.equals("-")){
            return getDif(x,y);
        }else if (s.equals("*")){
            return getMultiply(x,y);
        }else if (s.equals("/")){
            return getDiv(x,y);
        } else {
            System.out.println("Проверьте введенные данные");
            return x;}
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);//сделали объект класса
        System.out.println("Введите первое число");
        int a = sc.nextInt();
        System.out.println("Введите второе число");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("Введите знак операции (+, -, *, /)");
        String string = sc.nextLine();
        sc.close();

        getSum(a,b);
        getDif(a,b);
        getMultiply(a,b);
        getDiv(a,b);
        getQ(a,b,string);

    }
}
