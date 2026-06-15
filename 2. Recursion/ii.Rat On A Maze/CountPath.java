public class CountPath {
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        System.out.println(count(1,1,row,col));
    }
    public static int count(int sr, int sc, int er, int ec){
        if(sr > er || sc > ec) return 0;
        if(sr == er && sc == ec) return 1;
        // for right 
        int right = count(sr, sc+1, er, ec);
        //for down
        int down = count(sr+1, sc, er, ec);
        return right + down;
    }
}
