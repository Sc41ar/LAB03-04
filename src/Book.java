import java.io.*;

public class Book {
    private Genre genre;
    private Author author;
    private Publisher publisher;
    private int publisherYear;
    private String name;

    Book(){
        genre = new Genre("Детектив");
        author = new Author("Игорь");
        publisher = new Publisher("Заря");
        publisherYear = 0;
        name = "Книга";
    }

    Book(String genreName)
    {
        genre = new Genre(genreName);
        author = new Author("Игорь");
        publisher = new Publisher("Заря");
        publisherYear = 0;
        name = "Книга";
    }

    Book(String name, String genreName, String authorName, String publisherName, int year)
    {
        name = name;
        genre = new Genre(genreName);
        author = new Author(authorName);
        publisher = new Publisher(publisherName);
        publisherYear = year;
    }

    void Output() throws UnsupportedEncodingException {
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out, "Cp866"), true);
        pw.println("Вывод информации о книге \"" + name + "\" жанр: " + genre.GetName()
                + "автор: " + author.GetName() + " издатель: "
                + publisher.GetName()
                + " год публикации: " + publisherYear);
    }

    void Input ()
    {
        try {
            BufferedReader scan = new BufferedReader(new InputStreamReader(System.in, "Cp866"));
            System.out.println("Введите информацию о книге в следующем порядке: "
                    + "\nназвание\nжанр\nавтор\nиздатель\nгод издания");
            name = scan.readLine();
            genre.SetName(scan.readLine());
            author.SetName(scan.readLine());
            publisher.SetName(scan.readLine());
            String year = scan.readLine();
            while (!IsNumber(year)) {
                System.out.println("Введите год издания в формате числа");
                year = scan.readLine();
            }
            publisherYear = Integer.parseInt(year);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static boolean IsNumber(String s) {
        try {
            int a = Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

