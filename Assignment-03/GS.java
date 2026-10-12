
import java.util.*;

class ASS3Q2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double GS, Basic, HRA, DA;
        System.out.print("Enter basic salary :");
        Basic = sc.nextDouble();
        HRA = Basic * 0.1;
        DA = Basic * 0.6;
        GS = Basic + HRA + DA;
        System.out.println("gross salary calculated :RS " + GS);
    }
}
