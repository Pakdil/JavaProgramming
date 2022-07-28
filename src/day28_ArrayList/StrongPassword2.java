package day28_ArrayList;

public class StrongPassword2 {

    public static void main(String[] args) {

        String password = "cLdeo1990@";

        int countUpperCase = 0;
        int countLowerCase = 0;
        int countDigits = 0;
        int countSpecialCharacter = 0;

        for (int i = 0; i < password.length(); i++) {

            char each = password.charAt(i);

            if (Character.isUpperCase(each)) {
                countUpperCase++;
            } else if (Character.isLowerCase(each)) {
                countLowerCase++;
            } else if (Character.isDigit(each)) {
                countDigits++;
            } else {
                countSpecialCharacter++;
            }

        }

        /*

        System.out.println("countLowerCase = " + countLowerCase);
        System.out.println("countUpperCase = " + countUpperCase);
        System.out.println("countDigits = " + countDigits);
        System.out.println("countSpecialCharacter = " + countSpecialCharacter);

         */

        boolean hasUpperCase = countUpperCase > 0;
        boolean hasLowerCase = countLowerCase > 0;
        boolean hasDigit = countDigits > 0;
        boolean hasSpecialChar = countSpecialCharacter > 0;

        boolean strongPassword = password.length() >= 8 && !password.contains(" ") && hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;

        System.out.println("strongPassword = " + strongPassword);

    }
}
