package Home_Work;

import java.util.Arrays;
import java.util.Random;

public class Task_1 {

    public static void main(String[] args) {
        
        int i ,n ;
        int [] m1 = new int[0]; 
        int [] m2 = new int[0];

        Random ranNum = new Random();
        //Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        i = ranNum.nextInt(2001);
        System.out.println(i);

        //Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        n = Integer.toBinaryString(i).length();
        System.out.println(n);

        //Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        for (int k = i; k < Short.MAX_VALUE; k++){

            if (i % n == 0){

                int[] tmp = new int[m1.length + 1];
                tmp[0] = k;
                for (int j =1; j < tmp.length; j++){

                    tmp[j] = m1[j - 1];
                }
                m1 = tmp;
            
            }

        }
        //System.out.println(Arrays.toString(m1));

        //Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        for (int g = i;  g > Short.MIN_VALUE; g--){

            if (g % n != 0){

                int[] tmp1 = new int[m2.length + 1];
                tmp1[0] = g;
                for (int j =1; j < tmp1.length; j++){

                    tmp1[j] = m2[j - 1];
                }
                m2 = tmp1;

            }
        }
        System.out.println(Arrays.toString(m2));


        

        
        
        
    }
    
}
