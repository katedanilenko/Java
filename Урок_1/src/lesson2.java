public class lesson2 {
    public static void main(String[] args) {
        checkSumInInterval(1, 2);
        checkPositive(0);
        System.out.println("is positive boolean "+checkIsPositive(13));
        System.out.println(checkSumInInterval(1, 2));
        System.out.println(checkSumInInterval(10, 2));
        printMyString("Russians will fuck us!", 15);

    }

    public static boolean checkSumInInterval(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else return false;
    }

    public static void checkPositive(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }
public static boolean checkIsPositive(int a) {
        if (a >0) {
            return true;
        } else {
            return false;
        }
}
public static void printMyString(String myString, int N){
        for(int i =0; i<N; i++)
        {
            System.out.println(i);
            System.out.println(myString);
        }
}
}


//1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
//        в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
//        2. Написать метод, которому в качестве параметра передается целое число, метод должен
//        напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль
//        считаем положительным числом.
//        3. Написать метод, которому в качестве параметра передается целое число. Метод должен
//        вернуть true, если число отрицательное, и вернуть false если положительное.
//        4. Написать метод, которому в качестве аргументов передается строка и число, метод должен
//        отпечатать в консоль указанную строку, указанное количество раз;
//        5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean
//        (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого
//        100-го, при этом каждый 400-й – високосный.
//        Если выполнение задач вызывает трудности, можете обратиться к последней странице методического
//        пособия. Для задач со * не нужно искать решение в интернете, иначе нет смысла их выполнять..
