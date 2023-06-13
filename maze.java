public class maze {

    static void getMazePos(int currentRow , int currentCol, int endRow, int endCol,String res){
if(currentCol == endCol && currentRow == endRow){
System.out.print(res+" ");
return;
}
if(currentCol>endCol || currentRow>endRow){
return ;
}
getMazePos(currentRow, currentCol+1, endRow, endCol,res+"R");
getMazePos(currentRow+1, currentCol, endRow, endCol,res+"D");
}


public static void main(String[] args) {
String result="";
getMazePos(0, 0, 2, 2,result);
}

    
}
