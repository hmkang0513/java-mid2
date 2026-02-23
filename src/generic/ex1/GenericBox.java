package generic.ex1;

public class GenericBox<T>{ //  <> 다이아몬드
    private T value;    // T 가 타입이 되는 것임

    public void set(T value){
        this.value = value;
    }
    public T get(){
        return value;
    }
}
