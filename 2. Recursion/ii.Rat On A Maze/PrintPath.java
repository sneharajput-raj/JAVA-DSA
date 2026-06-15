public class PrintPath {
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        printPath(1, 1, row, col, "");
    }
    public static void printPath(int sr, int sc, int er, int ec, String ans){
        if(sr > er || sc > ec) return;
        if(sr == er && sc == ec){
            System.out.println(ans);
            return;
        } 
        printPath(sr, sc+1, er, ec, ans+"R");   //right
        printPath(sr+1, sc, er, ec, ans+"D");   //down
    }
}
