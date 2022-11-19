import java.util.Scanner;
import java.io.UnsupportedEncodingException;
public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException
    {
        int collectionCount = 0, magazineCount = 0, bookCount = 0;
        Scanner scanned = new Scanner(System.in);
        System.out.print("Введите количество сборников в библиотеке: ");
        collectionCount = scanned.nextInt();
        Book[][] bookArray = new Book[collectionCount][];
        for (int i = 0; i < collectionCount; i++) {
            System.out.println("Ввеите количество книг в сборнике");
            bookCount = scanned.nextInt();
            bookArray[i] = new Book[bookCount + 1];
            System.out.println("Введите информацию о самом сборнике");
            bookArray[i][0] = new Book();
            bookArray[i][0].Input();
            for (int j = 1; j < bookCount + 1; j++) {
                bookArray[i][j] = new Book();
                bookArray[i][j].Input();
            }
        }
        System.out.println("Введите количество журналов в библиотеке: ");
        magazineCount = scanned.nextInt();
        Magazine[] magazineArray = new Magazine[magazineCount];

        for (int i = 0; i < magazineCount; i++)
        {
            magazineArray[i] = new Magazine();
            magazineArray[i].Input();
        }

        for (int i = 0; i < collectionCount; i++) {
            System.out.print("\n\n");
            System.out.println("Информация о сборнике");
            bookArray[i][0].Output();
            for (int j = 1; j < bookCount + 1; j++) {
                bookArray[i][j].Output();
            }
        }

        for (int i = 0; i < magazineCount; i++)
        {
            System.out.print("\n\n");
            magazineArray[i].Output();
        }
    }

}