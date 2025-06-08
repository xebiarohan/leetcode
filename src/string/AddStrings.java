package string;

public class AddStrings {
    public static void main(String[] args) {
        System.out.println(addStrings("237","284"));
    }

    public static String addStrings(String num1, String num2) {
        int carry = 0;
        int num1Length = num1.length();
        int num2Length = num2.length();
        int number = Math.min(num1Length, num2Length)-1;
        StringBuilder builder = new StringBuilder();
        int total = 0;


        for(int i = 0; i<=number;i++) {

            total = carry + Character.getNumericValue(num1.charAt(num1Length -i-1)) + Character.getNumericValue(num2.charAt(num2Length-i-1));
            if(total > 9) {
                carry = total/10;
                builder.append(total%10);
            } else {
                carry = 0;
                builder.append(total);
            }
        }

        if(num1Length > num2Length) {
            for(int j = number+1;j <num1Length;j++) {
                total = carry + Character.getNumericValue(num1.charAt(num1Length -j-1));
                carry = total/10;
                builder.append(total%10);
            }
        } else if(num2Length > num1Length) {

            for(int j = number+1;j <num2Length;j++) {
                total = carry + Character.getNumericValue(num2.charAt(num2Length -j-1));
                carry = total/10;
                builder.append(total%10);
            }
        }
        if(carry != 0) {
            builder.append(carry);
        }

        return builder.reverse().toString();
    }
}
