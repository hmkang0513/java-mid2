package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요 (종료0)");
//        numbers.add(scan.nextInt());
//        while(numbers.get(numbers.size()-1) != 0){
//            numbers.add(scan.nextInt());
//        }
        while(true) {
            int num = scan.nextInt();
            if( num == 0){
                break;
            }
            numbers.add(num);
        }
        System.out.println("출력");
        for (int i = 0; i < numbers.size()-1; i++) {
            if(i != numbers.size()-2){
                System.out.print(numbers.get(i)+", ");
            } else {
                System.out.print(numbers.get(i));
            }

        }
    }
}
