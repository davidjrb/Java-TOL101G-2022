import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Davíð James Róbertsson Berman
 *  T-póstur: djr1@hi.is
 *
 *  Lýsing  :   Skrifar út stærstu tölu af staðalinntaki sem er minni
 *              en allar tölur gefnar með skipanalínu
 *****************************************************************************/
public class MaxBelow {
    public static void main(String[] args) {
        int In1 = Integer.parseInt(args[0]);
        Scanner a = new Scanner(System.in, StandardCharsets.UTF_8);
        int max = 0;
        while (a.hasNextInt()) {
            int In2 = a.nextInt();
            if (In2 < In1) {
                if (In2 > max) {
                    max = In2;
                }
            }
        }
        if (max == 0) {
            System.out.println("Engin tala minni en " + In1);
        }
        else
            System.out.println("stærsta tala minna en " + In1 + " er " + max);

    }
}
