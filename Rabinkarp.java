import java.util.*;
public class rabin {
    public static void main(String[] args) {
        //RABIN KARP ALGORITHM
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String ptrn=s.nextLine();
        int sump=0;
        for(int i=0;i<ptrn.length();i++)
        {
            sump+=ptrn.charAt(i)*(Math.pow(5,ptrn.length()-1-i));

        }
        for(int j=0;j<str.length();j++) {
            int sums = 0;
            String temp = str.substring(j, j + ptrn.length());
            for(int k=0;k<temp.length();k++)
            sums += temp.charAt(k) * (Math.pow(5, temp.length()- 1 - k));

            if (sump == sums)
            {
                System.out.println("Found pattern at index "+j);
                break;
            }
        }
    }
}
