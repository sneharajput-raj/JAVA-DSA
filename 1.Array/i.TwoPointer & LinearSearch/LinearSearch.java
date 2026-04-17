import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();           //user se array size mila
        int[] arr = new int[size];         //phle array ko declare kiya h--> yaha memory mein space ban jayegi utne size ki
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();         //user se array elements milenge
        }
        int target = sc.nextInt();         //jo search krna h bo 
        boolean check = false;
        for(int i=0; i<size; i++){
            if(arr[i] == target){
                check = true;
                break;
            }
        }
        System.out.print(check);
      sc.close();
    }
}
