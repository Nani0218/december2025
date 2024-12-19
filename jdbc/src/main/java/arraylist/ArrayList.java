package arraylist;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


public class ArrayList {
    public static void main(String[] args) {
        long starttime ;
        long endTime;
        long total;
        starttime=System.currentTimeMillis();
        List<Integer> a = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> b = Arrays.asList(4,5,6,10,13,15,2,16);


        for (int i = 0; i < a.size();i++){
            for (int j=0;j<b.size();j++){
                int c=b.get(j);
                if(a.get(i).equals(c)){
                    System.out.println(c);

                }

            }
        }
        endTime =System.currentTimeMillis();
        total=endTime-starttime;

        System.out.println("Execution time: " + (total) + " milliseconds");

        long timeSet = System.currentTimeMillis();
        long end=0;
        HashSet<Integer> common=new HashSet<>(b);

        for (int list :a){
            if(common.contains(list)){
                System.out.println(list);
            }
        }



        System.out.println("Execution time: " + (end-timeSet ) + " milliseconds");


    }
}