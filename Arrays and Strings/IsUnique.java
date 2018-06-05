import java.io.*;
class IsUnique
{
  public static void main(String args[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter a string");
    String s = br.readLine();
    s = s.trim();
    boolean flag = false;

    for (int x = 0; x < s.length() - 2; x++) {
      String c = String.valueOf(s.charAt(x));
      for (int y = x + 1; y < s.length(); y++)
        if (String.valueOf(s.charAt(y)).equals(c)){
          flag = true;
          break;
        }
    }
    if (flag) {
      System.out.println("String is not unique");
    } else {
      System.out.println("String is unique");
    }
  }
}