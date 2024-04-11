public class ArithmeticAverage {
    //Найти среднее арифметическое 10 случайных чисел

    public static void main(String[] args){
        double sum = 0;
        double i = 0;

        while (i < 10) {
            i++;
            int a = (int) (Math.random() * 10);
            sum = sum + a;
            System.out.printf(a +"; ");
        }
        double x = (sum/i);
        System.out.println();
        System.out.println(String.format("Сумма чисел %.0f", sum));
        System.out.println("Среднее арифметическое равно " + x);
    }


}
