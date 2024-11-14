
import java.util.Arrays;



public class Question1 {
    public static void main(String[] args){
        
       fun();

}
    
    static void fun(){
        int[] a = {1,2,3,4};

        int len = a.length-1;
        for (int i = len; i >= 0; i--) {
            System.out.println(a[i]);
        }
       
    }

    
}