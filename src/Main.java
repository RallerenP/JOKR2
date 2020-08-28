import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static java.util.Collections.shuffle;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextLine())
        {
            System.out.print(randomJoke().get(1));
            scan.nextLine();
        }
    }

    public static List randomJoke(){
        List<String> aList = new ArrayList<>();
        aList.add("joke1");
        aList.add("joke2");
        aList.add("joke3");
        aList.add("joke4");
        aList.add("joke5");
        shuffle(aList);
        return aList;

    }


}
