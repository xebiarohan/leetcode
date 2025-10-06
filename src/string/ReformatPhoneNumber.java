package string;

public class ReformatPhoneNumber {
    public static void main(String[] args) {
        System.out.println(reformatNumber("123 4-567"));
    }
    public static String reformatNumber(String number) {
        StringBuilder result = new StringBuilder();
        number = number.replaceAll(" ","").replaceAll("-","");

        int count = number.length();
        int currentIndex = 0;
        while (count > 4) {

            result.append(number, currentIndex, currentIndex+3).append("-");
            count -=3;
            currentIndex +=3;
        }

        if(count == 4) {
            result.append(number,currentIndex,currentIndex + 2).append("-");
            currentIndex+=2;
            result.append(number,currentIndex,currentIndex + 2);
        } else {
            result.append(number,currentIndex,currentIndex + count);
        }

        return result.toString();
    }
}
