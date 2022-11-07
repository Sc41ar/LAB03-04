import java.io.*;

public class Magazine {
    private Genre genre;
    private Publisher publisher;
    private int publishingYear;
    private int publishingMonth;
    private String name;

    private static int createdCount;

    Magazine() {
        genre = new Genre("Детектив");
        publisher = new Publisher("Заря");
        publishingYear = 0;
        publishingMonth = 1;
        name = "Р";
    }

    Magazine(String genreName) {
        genre = new Genre(genreName);
    }

    Magazine(String name, String genreName, String publisherName, int year, int month) {
        this.name = name;
        genre = new Genre(genreName);
        publisher = new Publisher(publisherName);
        publishingYear = year;
        publishingMonth = month;
    }

    private static boolean IsNumber(String s) {
        try {
            int a = Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void SetName(String name) {
        this.name = name;
    }

    public String GetName() {
        return name;
    }

    public static void AddCount(int count) {
        Magazine.createdCount += count;
    }

    public static Integer GetCount() {
        return Magazine.createdCount;
    }

    void Output() throws UnsupportedEncodingException {
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out, "Cp866"), true);
        pw.println("Вывод информации о журнале\"" + name + "\" жанр: " + genre.GetName()
                + " издатель: " + publisher.GetName() +
                " год публикации: " + publishingYear + "месяц публикации: " + publishingMonth);
    }

    void Input() {
        try {
            BufferedReader scan = new BufferedReader(new InputStreamReader(System.in, "Cp866"));
            System.out.println("Введите информацию и журнале в следующем порядке" +
                    "\nназвание\nжанр\nиздатель\nгод издания\nмесяц издания");
            String month, year;
            name = scan.readLine();
            genre.SetName(scan.readLine());
            publisher.SetName(scan.readLine());
            year = scan.readLine();
            month = scan.readLine();
            while (!IsNumber(year)) {
                System.out.println("введите год числом)))))))))");
                year = scan.readLine();
            }
            while (!IsNumber(month)) {
                System.out.println("введите месяц числом)))");
                month = scan.readLine();
            }
            publishingYear = Integer.parseInt(year);
            publishingMonth = Integer.parseInt(month);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
