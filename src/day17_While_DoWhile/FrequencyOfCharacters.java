package day17_While_DoWhile;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "AAABBBCAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAADJFHKGPOUUYTREASDGHJHJVCXAA";

        char ch = 'A';

        int frequecny = 0;
        for (int i = 0; i <= str.length()-1; i++) { // i: indexes of str
            char eachChar = str. charAt(i);

            if (ch == eachChar) {

                frequecny++;

            }


        }

        System.out.println("frequecny of A = " + frequecny);

    }


}
