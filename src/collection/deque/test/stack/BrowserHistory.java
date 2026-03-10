package collection.deque.test.stack;

import java.util.ArrayDeque;

public class BrowserHistory {
    ArrayDeque<String> history = new ArrayDeque<>();
    private String currentPage = null;

    public void visitPage(String url) {
//        address.push(url);
//        System.out.println("방문: " + address.peek());
        if(currentPage != null){
            history.push(currentPage);
        }
        currentPage = url;
        System.out.println("방문: " + url);
    }

    public String goBack() {
//        String pop = history.pop();
//        System.out.println("뒤로 가기: "+pop);
//        return pop;
        if(!history.isEmpty()){
            String currentPage = history.pop();
            System.out.println("뒤로 가기: " + currentPage);
            return  currentPage;
        }
        return null;
    }
}
