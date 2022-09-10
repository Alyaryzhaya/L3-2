public class Main {

    public static void main(String[] args) {

        /*
        ...
         */

        // int x = 5;


//        long i = 10_000_000_000L;
//        long x = i;
//        int g = (int) x;
//        System.out.println(g);


        //  переполнение
//        long x = 10000000000L;
//        int i = (int) x;
//        System.out.println(i);
//


//        int i = 2_000_000_000;
//        i = i * 10;
//        System.out.println(i); = -1474836480


        // Деление int

//        int x = 7;
//        System.out.println(x / 2); = 3


        // Результат long если в формуле есть long (а вещественных переменных нет);
        //если long в формуле нет, то будет int (даже если int там не было)
//        int i = 5;
//        long x = 5;
//
//        long xx = i + x;


        // Вещественные переменные

//        double - по умолчанию

//        double d1 = 0.9;
//        double d2 = 0.3 + 0.3 + 0.3;
//        System.out.println(d1 == d2); // false
//
//        System.out.println(d1);
//        System.out.println(d2);

//        float f = 0.73F; (насильно)


        // Infinity и  None

//        double d1 = 0.9;
//        double d2 = 0.0;
//        System.out.println(d1 / d2); = infinity


        // ТИП char
//        char c = 'x';


        // ТИП BOOLEAN
//        boolean b = true (false);


        // условие boolean
//        boolean b = 5 > 3;
//        System.out.println(b); = true

// ============================================================

//  УСЛОВИЯ И ОПЕРАТОРЫ СРАВНЕНИЯ

//        System.out.println("Hello");
//
//        int x = 5;
//        if(x > 0){
//            System.out.println("X положительный");


        // Расширенная форма условного оператора

        //           что делать, если условие выполняется:
//            int x = 5;
//            if(x > 0){
//                System.out.println("X положительный");

//             что делать если условие не выполняется:
//        int x = -5;
//        if (x > 0) {
//            System.out.println("X положительный");
//        } else {
//            System.out.println("Х НЕположительный");
//
//        }
//
//        System.out.println("Bye");


        // ЗАДАЧА ПРО БОНУСЫ

        int amount = 500;
        boolean isRegistered = true;
        int percent;

        if(isRegistered) {
            percent = 3;
        } else {
            percent = 1;
        }
//            System.out.println(percent);

        // ТЕРНАРНЫЙ УСЛОВНЫЙ ОПЕРАТОР
//         int percent = isRegistered ? 3 : 1;
        System.out.println("вот" + percent);


        // расчитать количество бонусов

        int bonus =  amount * percent / 100;
        if(bonus > 500) {
            bonus = 500;
        }
        System.out.println("Итоговый бонус: "+ bonus);


        // Ищем дефект расчета (отладчик)





    }


}




