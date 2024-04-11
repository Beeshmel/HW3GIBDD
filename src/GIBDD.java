import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Исправить код таким образом, чтобы ГИБДД не выписывала штраф в
//случае,если скорость движения ТС ниже 80 км/ч.
//• Исправить код так, чтобы штраф был уменьшен в 2 раза, если срок
//оплаты менее 30 дней
public class GIBDD {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Integer maxAccessSpeed = 60;//макс. разрешенная скорость движения
        Integer speedGrade = 20;//коэффициент штрафа, каждые 20 км/ч штраф увелич. на 500р
        Integer fineGrade = 500;
        Integer dangerSpeed = 180;

        System.out.println("введите скорость");
        Integer speed = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());

        if(speed>dangerSpeed) {
            System.out.println("Немедленно остановитесь!");
        }
        else if(speed>maxAccessSpeed) {
            Integer overSpeed = speed - maxAccessSpeed;//скорость превышения
            Integer k = overSpeed/speedGrade;//коэффициент превышения скорости
            Integer fine = k * fineGrade;//величина штрафа
            System.out.println("Штраф составляет "+fine);
            System.out.println("Через сколько дней вы собираетесь оплатить штраф?");
            Integer days = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
            if (days<30){
                System.out.println("Скидка 50%. Штраф составит  "+ fine/2);
            }else {
                System.out.println("Вы заплатите полную сумму штрафа. При оплате в срок до 30 дней скидка 50%.");
            }
        }
        else {
            System.out.println("Доброго пути!");
        }
    }
}
