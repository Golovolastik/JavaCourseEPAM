package string_as_array;

import java.util.ArrayList;

import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class Task1 {
    static void camelCase_to_snake_case(char[] name){
        ArrayList<Character> result = new ArrayList<Character>();
        for (int i=0; i<name.length; i++){
            if (isUpperCase(name[i])){
                name[i] = toLowerCase(name[i]);
            }
        }

        //return result;
    }
    public static void main(String[] args) {
        char[] test = {'H', 'e', 'L', 'l', 'O'};
        camelCase_to_snake_case(test);
        for (char i:
             test) {
            System.out.print(i + " ");
        }
    }
}
