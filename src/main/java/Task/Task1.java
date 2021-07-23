package Task;

import java.util.List;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


/**
 Write a program that will read a string containing numbers from the keyboard, each number is separated by comma ","

 Display to screen the whole list of number in decreasing sorting order.

 If string contains alphabetical character instead of a number, then the method should catch an exception and display to screen the message "String contains character which cannot be converted into number".

 Requirements:
 •The program must read a string of numbers from the keyboard.
 •The readData method is to read numbers from the keyboard
 •The readData method must contain a try-catch block.
 •The sortNumber method is to sorting list of numbers into decreasing order.
 •The readData method calls sortNumber method.
 •If the user enters alphabetical character rather than a number, the program should display message "String contains character which cannot be converted into number".
 */

public class Task1 {
    public List<Integer> readData() {
        //write your code here
        try {
            Scanner reader = new Scanner(new InputStreamReader(System.in));
            System.out.println("Nhập vào chuỗi chữ số: ");
            String line = reader.nextLine();
            List<Integer> numbers = new ArrayList<>();
            String[] words = line.replaceAll("\\s+", "").split(",")
            for (String word : words) {
                numbers.add(Integer.parseInt(word));
            }
            return numbers;
        } catch (Exception e) {
            System.out.println("Có lỗi khi đọc data: " + e.getMessage());
            return new ArrayList<>();
        }
    }
    public List<Integer> sortNumberList(List<Integer> list) {
        //write your code here
        list.sort(Collections.reverseOrder());
        return list;
    }
    public static void main(String[] args) {
        //write your code here
        Task1 task = new Task1();
        List<Integer> numbers = task.readData();
        if (!numbers.isEmpty()) {
            List<Integer> sortedList = task.sortNumberList(numbers);
            System.out.println("Sắp xếp: " + sortedList);
        }
    }
}



