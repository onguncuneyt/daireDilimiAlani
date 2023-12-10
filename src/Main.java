import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int r,aci;
        double pi = 3.14,alan,dilimAlani;

        System.out.print("Yarı çapı giriniz : ");
        r = inp.nextInt();

        System.out.print("Merkez açısını giriniz : ");
        aci = inp.nextInt();

        alan = pi*(r*r);

        dilimAlani = (alan*aci)/360;

        System.out.println("Dilim alanı : " + dilimAlani);



    }
}