import java.io.*;

class CheckPermutation {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter first string");
        String s1 = br.readLine();
        s1 = s1.trim();

        System.out.println("Enter second string");
        String s2 = br.readLine();
        s2 = s2.trim();

        boolean flag = false;
        int pos = 0;

        if (s1.length() == s2.length()) {
            for (int x = 0; x < s1.length(); x++) {
                flag = false;
                char ch = s1.charAt(x);
                
                for (int y = 0; y < s2.length(); y++) {
                    if (ch == s2.charAt(y)) {
                        flag = true;
                        pos = y;
                    }
                }
                if (flag) {
                    s2 = s2.substring(0,pos)+s2.substring(pos+1);
                }
            }
            if (s2.length() == 0) {
                System.out.println("It is a permutation");
            } else {
                System.out.println("It is not a permutation");
            }    
        } else {
            System.out.println("It is not a permutation");
        }
    }
}