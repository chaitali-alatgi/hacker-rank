import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class AnagramsJava {
    public static void main(String[] agrs) {

 //       try {
            //BufferedReader
            BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
            String input = "1";                // Reading input from STDIN

            //BufferedReader
            BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
            String nameA = "rfgtujhiko";                // Reading input from STDIN

            //Scanner
            Scanner s = new Scanner(System.in);
            String nameB = "cde";                 // Reading input from STDIN
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < nameA.length(); i++) {
            if(!set.contains(nameA.charAt(i))) {
                set.add(nameA.charAt(i)+"");
            } else {
                set.remove(nameA.charAt(i)+"");
            }
        }
        for(int i = 0; i < nameB.length(); i++) {
            if(!set.contains(nameB.charAt(i))) {
                set.add(nameB.charAt(i)+"");
            } else {
                set.remove(nameB.charAt(i));
            }
        }
        System.out.println(set.size());
//        }  catch (IOException ex) {
//            ex.printStackTrace();
//        }


    }
}
