package by.minsk.itakademy.arturzimin;

import java.util.Locale;
import java.util.Scanner;

public class Main {
private static final String DELIMETER=" ";
    public static void main(String[] args) {

        String str="Hello Hello have have are are are you";
        String toLowerKeys=str.toLowerCase(Locale.ROOT);
        Scanner scanner=new Scanner(toLowerKeys);
        String[] arrayWord=null;
        while (scanner.hasNext()){
            arrayWord=  scanner.nextLine().split(DELIMETER);
        }
        for (int i=0;i< arrayWord.length;i++){
           int count=1;
            for (int a=i+1;a<arrayWord.length;a++){
                if (arrayWord[i].equals(arrayWord[a])){
                    count=count+1;
                    arrayWord[a]="0";
                }
            }if (arrayWord[i]!="0"){
                System.out.println(arrayWord[i]+"---"+count);
            }


        }


    }
}
