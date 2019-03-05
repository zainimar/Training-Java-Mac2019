package chapter5_array;

public class Array {
    public static void main(String[] args) {
        //3 adalah bilangan data dalam array fixed
        String [] people = new String[3];
        people[0] = "ima";
        people[1] = "faiz";
        people[2] = "mohd";
        
        System.out.println(people[2]);
        
        //int[] bil = new int[5]; tak boleh sbb int adalah data primitif
        Integer[] bil = new Integer[5];
        int[] jum = {1,2,6};
        
        //loop .length akan return panjang array
        for (int i=0; i<jum.length; i++) {
            System.out.println(jum[i]);
        }
        
        //while
        int j = 0;
        while (j < jum.length){
            System.out.println(jum[j]);
            j++;
        }
    }
}
