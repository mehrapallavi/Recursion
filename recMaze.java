public class recMaze {


     public static int mazepath(int i,int j,int m,int n){
if(i==n || j==m){
    return 0;
}

        if(i==n-1 && j==m-1){
            return 1;
        }
        
        // path towards right
        
        int pathright= mazepath(i,j+1,m,n);

        // path downwards

        int pathdown=mazepath(i+1,j,m,n);

        return pathright+pathdown;


    }

    public static void main(String args[]){
        int m=3; int n=3;
        System.out.println(mazepath(0,0,m,n));


    }
    
}
