package by.minsk.itakademy.arturzimin;

import java.io.BufferedReader;
import java.io.Reader;
import java.util.Locale;

public class CountDublicateWord {
    public static void main(String[] args) {

        String str="Hello Hello are are are you have have";
        String lowerKeys=str.toLowerCase(Locale.ROOT);
        String[] arrayWord=lowerKeys.split(" ");
        for (int i=0;i<arrayWord.length;i++){
            int count=1;
            for (int a=i+1;a<arrayWord.length;a++){
                if (arrayWord[i].equals(arrayWord[a])){
                    count=count+1;
                    arrayWord[a]="0";
                }
            }
            if (arrayWord[i]!="0"){
                System.out.println(arrayWord[i]+"---"+count);
            }
        }

    }
}
