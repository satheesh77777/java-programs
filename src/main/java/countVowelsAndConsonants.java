import java.util.Scanner;

public class countVowelsAndConsonants {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("kindly enter your string :");
        String str = sc.nextLine();
        str = str. toLowerCase();
        int vowels =0, consonants=0;

        for(int i=0; i<str.length();i++){
            char ch =str.charAt(i);
           // using OR operator

            if('a'==ch||'e'==ch||'i'==ch||'o'==ch||'u'==ch){
                vowels++;
            }
            else {
               consonants++;
            }

        }
        System.out.println("No.of vowels in a string :"+vowels);
        System.out.println("No.of consonants in a string :"+consonants);

    }

}
