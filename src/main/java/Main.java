import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Book> titleSortedSet = new TreeSet<>();
        titleSortedSet.add(new Book("C", 230, "Author C", "2022-01-05"));
        titleSortedSet.add(new Book("D", 278, "Author D", "2019-09-16"));
        titleSortedSet.add(new Book("A", 361, "Author A", "2020-07-02"));
        titleSortedSet.add(new Book("E", 400, "Author E", "2023-03-09"));
        titleSortedSet.add(new Book("B", 300, "Author B", "2021-05-21"));

        System.out.println("Kitaplar isme göre sıralanmıştır:");
        for (Book book : titleSortedSet) {
            System.out.println(book);
        }

        System.out.println("=========================================================================");

        Set<Book> pageCountSortedSet = new TreeSet<>(Comparator.comparingInt(Book::getPageCount));
        pageCountSortedSet.add(new Book("C", 230, "Author C", "2022-01-05"));
        pageCountSortedSet.add(new Book("D", 278, "Author D", "2019-09-16"));
        pageCountSortedSet.add(new Book("A", 361, "Author A", "2020-07-02"));
        pageCountSortedSet.add(new Book("E", 400, "Author E", "2023-03-09"));
        pageCountSortedSet.add(new Book("B", 300, "Author B", "2021-05-21"));

        System.out.println("Kitaplar sayfa sayılarına göre sıralanmıştır:");
        for (Book book : pageCountSortedSet) {
            System.out.println(book);
        }
    }
}