
public class UpperCase {
    public static void main(String[] args) {
       System.out.println("Hello, World!");
       
        String  str ="the quick Brown fox jumps over The lazy dog.";
        System.out.println(str);
    int space =0;
    char ch []= str.toCharArray();
    while (space !=-1){
       if(space ==0){
           ch[space] = Character.toUpperCase(ch[space]);
       }
        else {
        ch[space+1] = Character.toUpperCase(ch[space+1]);
        }
        space = str.indexOf(' ', space+1);
    }
    str = String.valueOf(ch);
    System.out.println(str);
    }
}
