/**
 *
 */

import java.lang.Math.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Generator {
    private int maxValue;
    private String[] letters;
    private String[] uniek;
    private int[] uniekNumber;
    private int uniekeAantalChars;

    /**
     * Constructors
     * @param maxValue the maximum amount of letters in the array
     */
    public Generator(int maxValue){
        this.maxValue = maxValue;
        letters = new String[maxValue];
        uniekeAantalChars = 0;
        this.generate();
    }

    public Generator(){
        new Generator((int) Math.floor((Math.random()*30+1)));
    }

    /**
     * generation of all the letters and the calculation of the amount of unique value's in the array
     */
    private void generate() {
        for (int i = 0; i <= maxValue; i++) {
            letters[i] = String.valueOf(Math.floor(Math.random() * 24) + 97);
        }
        Arrays.sort(letters);
        for (int i = 1; i <= maxValue; i++) if (letters[i - 1] != letters[i]) uniekeAantalChars++;
        uniek = new String[uniekeAantalChars];
        uniekNumber = new int[uniekeAantalChars];
        int a = 0;
        int b = 0;
        for (int i = 1; i <= maxValue; i++) {
            if (letters[i - 1] != letters[i]) {
                uniek[a] = letters[i];
                uniekNumber[a] = b;
                a++;
                b=0;
            }else{
                b++;
            }
        }
    }


    /**
     * Getters
     */
    public String[] getLetters(){
        return letters;
    }

    public String[] getUniek(){
        return uniek;
    }

    public int[] getUniekNumber(){
        return uniekNumber;
    }
}