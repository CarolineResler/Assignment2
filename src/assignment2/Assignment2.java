package assignment2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;


/**
 *
 * @author Caroline
 */
public class Assignment2 {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        
       for(int i=0; i<8000; i++){
           int number = 1 + (int)(Math.random() * ((1000 -1)+1));
           ArrayList<Integer> arraylist = new ArrayList<Integer>();
           arraylist.add(number);
           System.out.println(arraylist);
       }
        System.out.println("Time in ms" + (System.currentTimeMillis()- start ));
    }
    
}
