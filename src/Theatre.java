import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        // 1. Создание действующих лиц
        Actor actor1 = new Actor("Леонардо", "Ди Каприо", Gender.MALE, 183);
        Actor actor2 = new Actor("Брэд", "Питт", Gender.MALE, 180);
        Actor actor3 = new Actor("Роберт", "Дауни-младший", Gender.MALE, 174);

        Director director1 = new Director("Стивен", "Спилберг", Gender.MALE, 537);
        Director director2 = new Director("Джеймс", "Кэмерон", Gender.MALE, 198);

        Person musicAuthor = new Person("Ханс", "Циммер", Gender.MALE);
        Person choreographer = new Person("Анжелен", "Прельжокаж", Gender.MALE);

        // 2. Создание спектаклей
        String libretto = """
                В словах этой песни глубокая правда —
                её не принять невозможно!
                Ах, верьте, что всё в этом мире ничтожно,
                и важно веселье одно!
                Любовь не век в душе живёт,
                лета не в нашей воле!
                Цветок, поблёкший в поле,
                опять не зацветёт.
                Ловите ж, ловите минуты веселья,
                пока вам судьба их даёт!""";

        Show show = new Show("Иисус Христос – суперзвезда", 120, director1,
                new ArrayList<>());
        Opera opera = new Opera("Травиата", 180, director2, new ArrayList<>(), musicAuthor,
                libretto, 13);
        Ballet ballet = new Ballet("Щелкунчик", 150, director2, new ArrayList<>(), musicAuthor,
                "Звуки вокализирующего хора", choreographer);

        // 3. Распределение актёров
        System.out.println("Добавляем участников спектакля " + show.getTitle());
        show.addActor(actor1);
        show.addActor(actor2);
        show.addActor(actor3);
        System.out.println();

        System.out.println("Добавляем участников оперы " + opera.getTitle());
        opera.addActor(actor2);
        opera.addActor(actor3);
        System.out.println();

        System.out.println("Добавляем участников балета " + ballet.getTitle());
        ballet.addActor(actor1);
        ballet.addActor(actor3);
        System.out.println();

        // 4. Вывод списков актёров
        System.out.println("Список актёров спектакля: " + show.getTitle());
        show.printActors();
        System.out.println();

        System.out.println("Список актёров оперы: " + opera.getTitle());
        opera.printActors();
        System.out.println();

        System.out.println("Список актёров балета: " + ballet.getTitle());
        ballet.printActors();
        System.out.println();

        // 5. Замена актёра и вывод обновленного списка
        opera.replaceActor(actor1, "Дауни-младший");
        System.out.println("Новый список участников:");
        opera.printActors();
        System.out.println();

        // 6. Замена несуществующего актёра в спектакле
        ballet.replaceActor(actor2, "Борунов");
        System.out.println();

        // 7. Вывод либретто
        System.out.println("Текст либретто для " + opera.getTitle());
        opera.printLibretto();
        System.out.println();

        System.out.println("Текст либретто для " + ballet.getTitle());
        ballet.printLibretto();
    }
}
