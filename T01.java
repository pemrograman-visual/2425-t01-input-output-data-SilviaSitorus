// 12S24004 - Silvia Eklesiana Br. Sitorus
// 12S24032 - Angga Brillyant Pratama Sianipar
import java.util.*;
import java.lang.Math;

public class T01{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penulis;

        iSBN = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        int tahun;

        tahun = Integer.parseInt(input.nextLine());
        String penerbit;

        penerbit = input.nextLine();
        String format;

        format = input.nextLine();
        double harga, margin;

        harga = Double.parseDouble(input.nextLine());
        margin = Double.parseDouble(input.nextLine());
        int stock;

        stock = Integer.parseInt(input.nextLine());
        double rating;

        rating = Double.parseDouble(input.nextLine());
        System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahun + "|" + penerbit + "|" + format + "|" + harga + "|" + margin + "|" + stock + "|" + rating);
    }
}
