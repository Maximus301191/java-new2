public class Main {
    public static void main(String[] args) {
        int amount = 100; // начальный баланс клиента
        int replenishment = 1000; // сумма пополнения
        int sum = amount + replenishment; // сумма с пополнением
        int bonus; // количество бонусов
        int result; // =итоговая сумма с бонусом
        if (sum > 1000) {
            bonus = sum / 100;
            result = bonus + sum;
        } else {
            bonus = 0;
            result = bonus + sum;
        }

        System.out.println(bonus + " рублей количество бонусов");
        System.out.println(result + " рублей итоговый счет");
    }
}