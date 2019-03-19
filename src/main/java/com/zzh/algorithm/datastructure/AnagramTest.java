package src.main.java.com.zzh.algorithm.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 变位词
 * @author zzh
 * @date 2019/3/19
 */
public class AnagramTest {

    private static int size;
    private static int count;
    private static char[] arrChar = new char[100];

    public static void main(String[] args) throws IOException {

        System.out.println("Enter a word :");
        String input = getString();
        size = input.length();
        count = 0;
        for (int j =0; j<size; j++){
            arrChar[j] = input.charAt(j);
        }
        doAnaggram(size);
    }



    private static void doAnaggram(int newSize){
        if (newSize == 1){
            return;
        }
        for (int j=0; j<newSize; j++){
            doAnaggram(newSize-1);
            if (newSize == 2){
                displayWord();
            }
            rotate(newSize);
        }
    }

    private static void displayWord(){
        if (count < 99){
            System.out.print(" ");
        }
        if (count < 9){
            System.out.print(" ");
        }
        System.out.print(++count + " ");

        for (int j=0; j<size; j++){
            System.out.print(arrChar[j]);
        }
        System.out.print("  ");
        System.out.flush();
        if (count%6 == 0){
            System.out.println();
        }
    }

    private static void rotate(int newSize){
        int j;
        int position = size - newSize;
        char temp = arrChar[position];

        for (j = position+1; j<size; j++){
            arrChar[j-1] = arrChar[j];
        }
        arrChar[j-1] = temp;
    }

    private static String getString() throws IOException {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inputStreamReader);
        String s = br.readLine();
        return s;
    }

}
