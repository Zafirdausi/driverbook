import java.util.Scanner;

public class driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Judul buku: ");
        String title = input.nextLine();
        System.out.println("Tahun buku:");
        int year = input.nextInt();
        System.out.println("Harga buku:");
        double price = input.nextDouble();
        System.out.println("_________________________");
        System.out.println("Pilih buku: \n1.TextBook \n2.Novel");
        System.out.println("_____________________");
        int pilih = input.nextInt();

        if (pilih == 1) {
            System.out.println("Subject buku:");
            String subject = input.next();
            TextBook buku = new TextBook(title, subject, year, price);
            System.out.println("=================================");
            buku.print();
            System.out.println("----------------------------------");
            System.out.println("Apakah buku biography?");
            System.out.println("___________________________");
            String bio = input.next();
            if (bio.equalsIgnoreCase("ya")) {
                System.out.println("Buku biography apa?");
                String about = input.next();
                System.out.println("===============================");
                biography biography = new biography();
            biography.print();
            }
        } else if (pilih == 2) {
            System.out.println("Genre buku:");
            String genre = input.next();
            Novel Novel = new Novel();
            System.out.println("====================");
            Novel.print();
        }
    }
}