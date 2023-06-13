public class Perm {

    
    public static void main(String ar[]){
permutation( "abc","");
}



public static void permutation(String str, String res) {
int n = str.length();
if (n == 0)
System.out.println(res);
for (int i = 0; i < n; i++)
permutation(str.substring(0, i) + str.substring(i+1, n),res + str.charAt(i));
}
    
}
