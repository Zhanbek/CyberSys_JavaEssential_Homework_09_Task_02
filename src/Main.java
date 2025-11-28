import model.Client;

public class Main {
    public static void main(String[] args) {
        MyList<Client> list = new MyList<>(4);

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
        System.out.println("Список з " + list.getSize() + "-х клієнтів після додавання 4-х елементів при capacity, Рівному:" + list.getCapacity());
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println(list);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Посилання на об'єкт клієнта: " + clientForSearch +
                           " збережено в списку елементі списку з індексом: " + list.getIndexByValue(clientForSearch));
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Видалимо елемент списку з індексом 1:");
        list.removeByIndex(1);
        System.out.println("Список клієнтів після додавання:");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println(list);
        System.out.println("--------------------------------------------------------------------------------");

        list.setCapacity(10);
        list.add(new Client(127, "Mendel", 19));
        list.add(new Client(128, "Rukaber", 67));
        list.add(new Client(129, "Meyer", 49));
        list.add(new Client(130, "Opengeymer", 75));

        System.out.println("Список з " + list.getSize() + "-х клієнтів після додавання 4-х елементів при capacity, Рівному:" + list.getCapacity());
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println(list);
        System.out.println("--------------------------------------------------------------------------------");
    }
}