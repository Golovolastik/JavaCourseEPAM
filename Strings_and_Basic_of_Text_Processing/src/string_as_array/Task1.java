package string_as_array;

import java.util.ArrayList;

public class Task1 {
    static void camelCase_to_snake_case(char[] name){
        ArrayList<char> result = new ArrayList<char>();
        for (int i=0; i<name.length; i++){
            if (isUpperCase(name[i])){
                toLowerCase(name[i]);
            }
        }

        //return result;
    }
    public static void main(String[] args) {
        char[] test = {'h', 'e', 'l', 'l', 'o'};
        for (char i:
             test) {
            System.out.print(i + " ");
        }
    }
}
