public class HomeWorkApp {

    public static void main(String[] argument) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");




    }

    public static void checkSumSign() {
        int a = 14;
        int b = -20;
        int sum = a + b;
        if (sum>0)
        {
            System.out.println("Сумма положительная");
        } else{
            System.out.println("Сумма отрицательная");
        }}
    public static void printColor()

    { int value = 77;
        if (value <=0){
            System.out.println("Красный");}
        else if(value >=0 && 0<=100){
            System.out.println("Желтый");
        } else if(value >100){
            System.out.println("Зеленый");}
    }

    public static void compareNumbers() {
        int a = 45;
        int b = 46;
        if (a>=b){
            System.out.println("a>=b");
        }else if(a<b){
            System.out.println("a<b");
        }

    }


}

public class MainApp {
    public static void (String[] args) {
        System.out.println('*');
    }
}





