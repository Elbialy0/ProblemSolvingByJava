
import java.util.Scanner;
public class NightattheMuseum {
 public static  int [] ConvertStringToArray(String string)
{
    int []arr=new int[string.length()];
    for(int i=0;i<string.length();i++){
        arr[i]=string.charAt(i)-'0';
    }
    return arr;

}

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String Name= in.nextLine();
    in.close();
    char CurrentChar='a';
    int ans=0;
    for(int i=0;i<Name.length();i++){
        char a=Name.charAt(i);
        int v=CurrentChar-a;
        int p=a-CurrentChar;
        if(v<0)v+=26;
        if(p<0)p+=26;
        ans+=Math.min(v,p);
        CurrentChar=a;
    }
    System.out.println(ans);
  }
}