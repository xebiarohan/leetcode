package stackandqueue;

import java.util.ArrayDeque;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("azxxzy"));
    }

    public static String removeDuplicates(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        stack.push(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if(!stack.isEmpty() && s.charAt(i) == stack.peek()) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        StringBuilder builder = new StringBuilder();
        while (!stack.isEmpty()) {
            builder.append(stack.removeLast());
        }
        return builder.toString();
    }
}
