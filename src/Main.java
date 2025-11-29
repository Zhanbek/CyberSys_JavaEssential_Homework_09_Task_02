import model.Client;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyList<Client> list = new MyList<>(10);

        // додамо перший елемент списку
        list.add(new Client(123, "Sokolov", 56));
        // додамо другий елемент списку
        list.add(new Client(124, "Vovk", 34));
        // додамо третій елемент списку
        Client clientForSearch = new Client(125, "Disney", 45);
        list.add(clientForSearch);
        // додамо четвертий елемент списку
        list.add(new Client(126,  "Gates", 67));

        System.out.println();
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Створено список з " + list.getSize() + "-х клієнтів при capacity, рівному: " + list.getCapacity());
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println(list);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Посилання на об'єкт клієнта: " + clientForSearch +
                           " збережено в елементі списку MyList<Client> з індексом: " + list.getIndexByValue(clientForSearch));
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Видалимо елемент списку з індексом 1:");
        try {
            list.removeByIndex(1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Список клієнтів після видалення:");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println(list);
        System.out.println("--------------------------------------------------------------------------------");

        try {
            list.setCapacity(10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        list.add(new Client(127, "Mendel", 19));
        list.add(new Client(128, "Rukaber", 67));
        list.add(new Client(129, "Meyer", 49));
        list.add(new Client(130, "Opengeymer", 75));

        System.out.println("Список з " + list.getSize() + "-х клієнтів після додавання 4-х елементів при capacity, Рівному:" + list.getCapacity());
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println(list);
        System.out.println("--------------------------------------------------------------------------------");

        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Вкажіть id нового клієнта: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Вкажіть прізвище нового клієнта: ");
        String lastName = sc.nextLine();
        System.out.println("Вкажіть вік нового клієнта:: ");
        int age = sc.nextInt();
        Client newClient = new Client(id, lastName, age);

        try {
            System.out.println("Елемент списку з яким індексом ви хочете замінити посиланням на об'єкт: " + newClient + " : ");
            int index = sc.nextInt();
            list.setValueByIndex(index, newClient);
            System.out.println();
            System.out.println("Список клієнтів після заміни елемента списку з індексом " + list.getIndexByValue(newClient) +
                               " посиланням на новий об'єкт: " + newClient) ;
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println(list);
            System.out.println("--------------------------------------------------------------------------------");

        } catch (IndexOutOfBoundsException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}