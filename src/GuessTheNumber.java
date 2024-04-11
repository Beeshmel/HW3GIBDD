import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessTheNumber {
    public static void main(String[] args) throws IOException {
        var reader = new BufferedReader((new InputStreamReader((System.in))));
        System.out.println("Введите Вашу сумму");
        int money = Integer.parseInt((reader.readLine()));
        int rate = 0;
        if (money<1000){
            System.out.println("Недостаточно средств для начала игры (Не менее 1000):");
        }else {

            while (money>0) {

                System.out.println(("Введите Вашу ставку"));
                rate = Integer.parseInt((reader.readLine()));
                if (rate > 0 && rate <= money) {
                    System.out.println("Угадайте число от 1 до 9. Игра началась!");

                } else {
                    if (rate == -1) {
                        System.out.println("Вы вышли из игры");
                        System.exit(0);
                    } else {
                        System.out.println("Некорректная ставка");
                    }
                }


                int number = (int) (Math.random()*9+1);
                int count = 3;// счетчик попыток
                final int COUNT_MAX = 4; //константа
                if(money>=rate) {
                    while (count > 0) {
                        System.out.println("Попытка №" + (COUNT_MAX - count));
                        int answer = Integer.parseInt(reader.readLine());
                        if (answer == number) {
                            money = money + rate;
                            System.out.println();
                            System.out.println("Поздравляем, Вы выиграли! Сумма = " + money);
                            break;
                        } else {
                            if (count == 1) {
                                money = money - rate;
                                System.out.println("Было загадано: " + number + ", Вы проиграли, попробуйте еще раз." +
                                        "\nОстаток = " + money);
                            }

                        }
                        count--;
                    }
                }
            }
        }
    }
}
