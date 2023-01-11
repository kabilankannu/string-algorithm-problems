import java.util.*;
public class menachers {
//    lonegest(substring)pallindrome in the string
    public static void main(String[] args) {
        String m = "";
        String temp = "";
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char[] aar = new char[100];
        int j = 0;
        for (int i = 0; i < (2 * str.length()) + 1; i++) {
            if (i % 2 == 0) {
                aar[i] = '!';
            } else {
                aar[i] = str.charAt(j);
                j++;
            }
        }
        int max = 0;
        for (int i = 0; i < (2 * str.length()) + 1; i++) {
            int count = 0;
            if (aar[i] == '!') {
                temp = "";
                int b = i - 1;
                int a = i + 1;
                while (b >= 0 && a <= (2 * str.length()) + 1) {
                    if (aar[b] == aar[a]) {
                        temp = aar[b] + temp + aar[a];
                        count++;
                        b = b - 2;
                        a = a + 2;
                    } else
                        break;
                }
            } else {
                max = count;
                temp = Character.toString(aar[i]);
                int b = i - 2;
                int a = i + 2;
                while (b >= 0 && a <= (2 * str.length()) + 1) {
                    if (aar[b] == aar[a]) {
                        temp = aar[b] + temp + aar[a];
                        count++;
                        b = b - 2;
                        a = a + 2;
                        if (max < count)
                            m = temp;
                    } else
                        break;
                }
            }
        }
        System.out.println(m);
    }
}
