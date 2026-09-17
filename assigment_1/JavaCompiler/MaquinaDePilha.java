import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;



public class MaquinaDePilha {
    public static void main(String[] args) throws Exception {
        BufferedReader arquivo = new BufferedReader(new FileReader(args[0]));
        Deque<Integer> stack = new ArrayDeque<>();
        String line;
        String[] words;
        while ((line = arquivo.readLine()) != null) {
            words = line.trim().split(" "); 
            switch ( words[0] ) {
                case "PUSH":
                    stack.push(Integer.parseInt(words[1]));
                    break;
                case "SUM":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "SUB":
                    int subtrahend = stack.pop();
                    int minuend = stack.pop();
                    stack.push(minuend - subtrahend);
                    break;
                case "MULT":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "DIV":
                    int divisor = stack.pop();
                    int dividend = stack.pop();
                    stack.push(dividend / divisor);
                    break;
                case "PRINT":
                    System.out.println(stack.pop());
                    return;
                default:
                    break;
            } 
            
        }
        
    }
}
