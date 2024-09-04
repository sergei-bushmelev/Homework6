public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Задача 1
        for (int i = 1; i < 11; i++){
            System.out.println(i);
        }
        System.out.println();

        //Задача 2
        for (int i = 10; i > 0; i--){
            System.out.println(i);
        }
        System.out.println();

        //Задача 3
        for (int i = 0; i < 17; i = i + 2){
            System.out.println(i);
        }
        System.out.println();

        //Задача 4
        for (int i = 10; i > -11; i--){
            System.out.println(i);
        }
        System.out.println();

        //Задача 5
        for (int i = 1904 ; i < 2096; i = i + 4){
            System.out.println(i + " год является високосным");
        }
        System.out.println();

        //Задача 6
        for (int i = 7; i < 99; i = i + 7){
            System.out.print(i + " ");
        }
        System.out.println();

        //Задача 7
        for (int i = 1; i < 513; i = i * 2){
            System.out.print(i + " ");
        }
        System.out.println();

        //Задача 8
        int salary = 29_000;
        int total = 0;
        for (int i = 1; i < 13; i++){
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();

        //Задача 9
        int newSalary = 29_000;
        int newTotal = 0;
        for (int i = 1; i < 13; i++){
            newTotal = newTotal + newTotal / 100;
            newTotal = newTotal + newSalary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + newTotal + " рублей");
        }
        System.out.println();

        //Задача 10
        int number = 2;
        int result;
        for (int i = 1; i < 11; i++){
            result = number * i;
            System.out.println(number + "*" + i + "=" + result);
        }

    }
}