import java.util.Scanner;

public class Module2 {
    public static void main(String[] args) {
        //вариант 1 (табличный):
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = in.nextLine();
        System.out.println("Введите город проживания:");
        String city = in.nextLine();
        System.out.println("Введите ваш возраст:");
        String age = in.nextLine();
        System.out.println("Введите ваше хобби:");
        String hobby = in.nextLine();
        System.out.println("Имя:"+name);
        System.out.println("Город:"+city);
        System.out.println("Возраст:"+age);
        System.out.println("Хобби:"+hobby);
    }
}

