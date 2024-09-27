import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            map.put(name, phone);
        }

        while (in.hasNext()) {
            String s = in.next();
            if (map.containsKey(s)) {
                System.out.println(s + "=" + map.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
/*
7
sam 10
tom 11
harry 12
eda 13
seda 14
edam 155
tom 167
sam
edward
harry
eda
seda
edam
tom

sam=10
Not found
harry=12
eda=13
seda=14
edam=155
tom=167
 */
