import java.util.ArrayList;

public class mazeprobdiagona {
    
     public static ArrayList<String> mazepath(int i,int j,int m,int n){
if(i==n || j==m){
    ArrayList<String> result=new ArrayList<>();
    return result;
}

        if(i==n-1 && j==m-1){
           ArrayList<String> result=new ArrayList<>();  
           result.add("");
            return result;
        }

        ArrayList<String> finalres=new ArrayList<>();
        // path towards right
        
        ArrayList<String> pathright= mazepath(i,j+1,m,n);

        for(String t: pathright){
            finalres.add("r"+t);
        }
        // path downwards

        ArrayList<String> pathdown=mazepath(i+1,j,m,n);

        for(String t: pathdown){
            finalres.add("d"+t);
        }
        
        //  diagonal path
 ArrayList<String> pathdiagonal=mazepath(i+1,j+1,m,n);

        for(String t: pathdiagonal){
            finalres.add("i"+t);
        }
          return finalres;
    }

    public static void main(String args[]){
        int m=3; int n=3;
        System.out.println(mazepath(0,0,m,n));


    }
    
}
