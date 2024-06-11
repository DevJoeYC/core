package hello.core.singleton;

public class StateFulService {
//    private int price; //상태를 유지하는 필드

    //특정 클라이언트가 값을 변경 할 수 있는 필드가 있으면 안됨.
    public int order(String name, int price) {
        System.out.println("name = " + name + " price =" + price);
//        this.price = price; //여기가 문제
        return price;
    }

//    public int getPrice() {
//        return price;
//    }
}
