import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Dwse ta lepta .. ");
        int lepta;
        Scanner input = new Scanner(System.in);
        lepta = input.nextInt();
        System.out.println("Dwse ta deyterolepta .. ");
        int dlepta = input.nextInt();
        String teliko;
        teliko = getDurationString(lepta, dlepta);
        System.out.println(teliko);
    }

    public static String getDurationString(int lepta, int dlepta) {
        if (lepta < 0 || (dlepta < 0 || dlepta > 59)) {
            return "Invalid input :-( ";
        }
        if (lepta >= 60)
            getDurationString(lepta);
        int wres = lepta / 60;
        lepta %= 60;
        if (lepta < 10 && dlepta < 10)
            return String.format("%d wres 0%d lepta 0%d deyterolepta", wres, lepta, dlepta);
        else if (lepta < 10)
            return String.format("%d wres 0%d lepta %d deyterolepta", wres, lepta, dlepta);
        else if (dlepta < 10)
            return String.format("%d wres %d lepta 0%d deyterolepta", wres, lepta, dlepta);
        else
            return String.format("%d wres %d lepta %d deyterolepta", wres, lepta, dlepta);
    }

    public static void getDurationString(int lepta) {
        int dlepta = lepta % 60;
        lepta = lepta / 60;
        System.out.println("Calling right method");
        getDurationString(lepta, dlepta);
        // return "egine epejergasia. calling right method";
/*        System.out.println();
        System.out.println();
        Scanner input3 = new Scanner(System.in);
        int midakos = input3.nextInt();
        input3.close();
        Date date = new Date();
        long kog = date.getTime();
        System.out.println(kog);
        System.out.println(midakos);*/
    }
}