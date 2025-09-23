package string;

public class IncreasingDecreasingString {
    public static void main(String[] args) {
        System.out.println(sortString("aaaabbbbcccc"));

    }


    public static String sortString(String s) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";

        int[] charactersCount = new int[26];

        for(int i=0;i<s.length();i++) {
            charactersCount['z' - s.charAt(i)]++;
        }

        int counter = s.length();
        StringBuilder builder = new StringBuilder();
        while (counter > 0) {

            for(int j=25; j >=0;j--) {
                if( counter > 0 && charactersCount[j] > 0) {
                    counter--;
                    builder.append(alphabets.charAt(25 - j));
                    charactersCount[j]--;
                }
            }
            for(int i=0;i<26;i++) {
                if(counter > 0 && charactersCount[i] > 0) {
                    counter--;
                    builder.append(alphabets.charAt(25 - i));
                    charactersCount[i]--;
                }

            }
        }
        return builder.toString();
    }
}
