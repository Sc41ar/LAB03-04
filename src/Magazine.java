import java.io.*;

public class Magazine {
private Genre genre;
private Publisher publisher;
private int publishingYear;
private int publishingMonth;
public String name;

Magazine(){
    genre = new Genre("Детектив");
    publisher = new Publisher("Заря");
    publishingYear = 0;
    publishingMonth = 1;
    name = "Р";
}

Magazine (String genreName)
{
    genre = new Genre(genreName);
}

Magazine(String name, String genreName, String publisherName, int year, int month)
{
    name = name;
    genre = new Genre(genreName);
    publisher = new Publisher(publisherName);
    publishingYear = year;
    publishingMonth = month;
}

void Output() throws UnsupportedEncodingException{
    PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out, "Cp866"), true);
    pw.println("Вывод информации о журнале\"" + name + "\" жанр: " + genre.genreName
        + " издатель: " + publisher.name +
        " год публикации: " + publishingYear + "месяц публикации: " + publishingMonth);
}

void Input ()
{
    try {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in, "Cp866"));
        System.out.println("Введите информацию и журнале в следующем порядке" +
                "\nназвание\nжанр\nиздатель\nгод издания\nмесяц издания");
        name = scan.readLine();
        genre.genreName = scan.readLine();
        publisher.name = scan.readLine();
        publishingYear = Integer.parseInt(scan.readLine());
        publishingMonth = Integer.parseInt(scan.readLine());
    }
    catch (Exception e)
    {
        System.out.println(e);
    }
}

}
