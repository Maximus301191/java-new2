public class Main {
    public static void main(String[] args) {
        int amount = 100; // начальный баланс клиента
        int plus = 1000; // сумма пополнения
        int summa = amount + plus; // сумма с пополнением
        int bonus; // количество бонусов
        int itog; // =итоговая сумма с бонусом
                if(summa > 1000) {
                bonus = summa / 100;
                itog = bonus + summa;
                        }
                else {
                    bonus = 0;
                    itog = bonus + summa;
                }

                System.out.println( bonus + " рублей количество бонусов");
        System.out.println( itog + " рублей итоговый счет");
    }
}