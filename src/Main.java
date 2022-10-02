
public class Main {

    /**
     * Вариант 4. Задание: Вывести данные о книгах, в которых тираж не
     * превышает 10000 экземпляров.
     */
    public static void Less10000edition(Book [] book){
        System.out.println("\nКниги тиражем меньше 10000:");
        for (int i = 0; i < book.length; i++){
            if(book[i].getEdition() < 10000)
                System.out.println("\n" + book[i].ToString());
        }
    }

    public static void main(String[] args) {
        Book [] book = new Book[8];

        book[0] = new Book("Эрих Мария Ремарк", "Три товарища", "Роман", 27000);
        book [1] = new Book("Джейн Остин", "Гордость и предубеждение", "Роман", 10000);
        book[2] = new Book("Рувим Исаевич Фраерман", "Дикая собака Динго, или Повесть о первой любви", "Художественный вымысел", 7000);
        book[3] = new Book("Шарлотта Бронте", "Джейн Эйр", "Любовный роман", 16000);
        book[4] = new Book("Рэй Брэдбери", "451 градус по Фаренгейту", "Роман, научная фантастика", 9000);
        book[5] = new Book("Джером Дэвид Сэлинджер", "Над пропастью во ржи", "Роман", 8000);
        book[6] = new Book("Рэй Брэдбери", "Вино из одуванчиков", "Повесть", 7000);
        book[7] = new Book("Эрих Мария Ремарк", "Триумфальная арка", "Роман", 30000);
        System.out.println("Список всех книг:");
        for (int i = 0; i < book.length; i++){
            System.out.println("\n" + book[i].ToString());
        }
        Less10000edition(book);
    }
}