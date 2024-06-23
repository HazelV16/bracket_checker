import java.util.Stack;

public class BracketChecker {
    private Stack<Character> stack;
    private char[] opening;
    private char[] closing;
    private int position;

    public BracketChecker(char[] opening, char[] closing) {
        stack = new Stack<>();
        this.opening = opening;
        this.closing = closing;
        this.position = 0;
    }

    private int isOpening(char in) {
        for (int ci = 0; ci < opening.length; ci++) {
            if (in == opening[ci]) {
                return ci;
            }
        }
        return -1;
    }

    private int isClosing(char in) {
        for (int ci = 0; ci < closing.length; ci++) {
            if (in == closing[ci]) {
                return ci;
            }
        }
        return -1;
    }

    public boolean check(String text) {
        for (int i = 0; i < text.length(); i++) {
            char a = text.charAt(i);
            int openBracket = isOpening(a);
            int closeBracket = isClosing(a);
//            position++;

            if (openBracket > -1) {
                stack.push(a);
            } else if (closeBracket > -1) {
                if (stack.isEmpty()) {
                    position = i;
                    stack = new Stack<>();
                    return false;
                }
                char top = stack.peek();
                if (top != opening[closeBracket]) {
                    position = i;
                    stack = new Stack<>();
                    return false;
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()) {
            position = text.length();
            stack = new Stack<>();
            return false;
        }
        stack = new Stack<>();
        return true;
    }

//        }
//        return stack.isEmpty();
//    }


//    task 2
//    public boolean check(String text) {
//        for(int i = 0; i < text.length(); i++) {
//            char a = text.charAt(i);
//            int b = isOpening(a);
//            int c = isClosing(a);
//            position++;
//
//            if(a==opening[0]) {
//                stack.push(a);
//            } else if (a==closing[0]) {
//                if(stack.isEmpty()){
//                    position = i;
//                    return false;
//                }
//                else {
//                    stack.pop();
//                }
//            }
//        }
//        return stack.isEmpty();
//    }

    public int getPosition() {
        return position;
    }
}
