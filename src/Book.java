import java.io.*;

public class Book {
    private Genre genre;
    private Author author;
    private Publisher publisher;
    private int publisherYear;
    public String name;

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

    void Output () throws UnsupportedEncodingException
    {
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out, "Cp866"), true);
        pw.println("Вывод информации о книге \"" + name + "\" жанр: " + genre.genreName
        + "автор: " + author.name + " издатель: "
                + publisher.name
                + " год публикации: " + publisherYear);
    }

    void Input ()
    {
        try {
            BufferedReader scan = new BufferedReader(new InputStreamReader(System.in, "Cp866"));
            System.out.println("Введите информацию о книге в следующем порядке: "
                    + "\nназвание\nжанр\nавтор\nиздатель\nгод издания");
            name = scan.readLine();
            genre.genreName = scan.readLine();
            author.name = scan.readLine();
            publisher.name = scan.readLine();
            publisherYear = Integer.parseInt(scan.readLine());
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

