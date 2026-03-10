package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, String> dictionary = new HashMap<>();
        System.out.println("==단어 입력 단계==");
        while(true) {
            System.out.print("영어 단어를 입력하세요 (종료는 \'q\') : ");
            String englishWord = scan.nextLine();
            if(englishWord.equals("q")){
                break;
            }
            System.out.print("한글 뜻을 입력하세요 (종료는 \'q\') : ");
            String koreanMeaning = scan.nextLine();
            if(koreanMeaning.equals("q")){
                break;
            }
            dictionary.put(englishWord, koreanMeaning);
        }
        System.out.println("==단어 검색 단계==");
        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 \'q\') : ");
            String searchWord = scan.nextLine();
            if (dictionary.containsKey(searchWord)) {
                System.out.println(searchWord + "의 뜻: " + dictionary.get(searchWord));
            } else if(searchWord.equals("q")){
                System.out.println("종료하겠습니다.");
                break;

            } else {
                System.out.println(searchWord + "은(는) 사전에 없는 단어입니다.");
            }
        }
    }
}
