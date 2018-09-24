import java.util.Scanner;

/**
 * Created by ПК on 03.09.2018.
 */
public class Test {

    public static void printAgeAndName(String name, int age) {
        System.out.println("Меня зовут " + name + ", мне " + age + " лет");
    }

    public static  int calculate(int first, int second) {
        int summa = first + second;
        System.out.println(summa);
        return summa;
    }

    public static void main(String[] args) {

        int temp = calculate(10,15);
        double percentage = 5;

        System.out.println(temp * percentage / 100);



        /*
        String name = "Олег";   // Имя
        Integer age = 20;           // Возраст

        String name = "Анна";   // Имя
        Integer age = 21;           // Возраст
        System.out.println("Меня зовут " + name + ", мне " + age + " лет");

        String approve = (age > 18) ? "нельзя" : "можно";
        System.out.println("Мне " + approve + " пить пиво");*/

    }
}
