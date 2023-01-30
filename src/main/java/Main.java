import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String [] array = {"first", "second", "third", "fourth", "fifth", "six", "2", "!"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        String [] newList = new String[array.length];
        System.out.println("Let's process the array");
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() <= 3) {
                newList[i] = array[i];
            }
        }
        for (int i = 0; i < newList.length; i++) {
            if (newList[i] == null){
                continue;
            }
            System.out.println(newList[i]);
        }
    }
}
