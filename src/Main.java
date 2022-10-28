import java.util.Scanner;
import java.io.UnsupportedEncodingException;
public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException
    {
        int bookCount = 0, magazineCount = 0;
        Scanner scanned = new Scanner(System.in);
        System.out.print("Введите количество книг в библиотеке: ");
        bookCount = scanned.nextInt();
        Book[] bookArray = new Book[bookCount];
        for (int i = 0; i < bookCount; i++)
        {
            bookArray[i] = new Book();
            bookArray[i].Input();
        }
        System.out.println("Введите количество журналов в библиотеке: ");
        magazineCount = scanned.nextInt();
        Magazine[] magazineArray = new Magazine[magazineCount];

        for (int i = 0; i < magazineCount; i++)
        {
            magazineArray[i] = new Magazine();
            magazineArray[i].Input();
        }

        for (int i = 0; i < bookCount; i++)
        {
            System.out.print("\n\n");
            bookArray[i].Output();
        }

        for (int i = 0; i < magazineCount; i++)
        {
            System.out.print("\n\n");
            magazineArray[i].Output();
        }
    }

}