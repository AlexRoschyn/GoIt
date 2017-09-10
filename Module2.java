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
        
        //Вариант 2 (текстовый):
        System.out.println("Человек по имени:");
        String name1 = in.nextLine();
        System.out.println("Живет в городе:");
        String city1 = in.nextLine();
        System.out.println("Этому человеку:");
        String age1 = in.nextLine();
        System.out.println("Он любит заниматься:");
        String hobby1 = in.nextLine();
        System.out.println("Человек по имени:"+name1+" Живет в городе:"+city1);
        System.out.println("Этому человеку:"+age1+"лет"+" Он любит заниматься:"+hobby1);
    }
}

