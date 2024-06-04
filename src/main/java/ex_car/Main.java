package ex_car;

public class Main     // 자동차 클래스로 이해를 돕는 예시
{
    public static void main(String[] args) {
        자동차 a자동차 = new 자동차();
        a자동차.달리다();
        a자동차.서다();

        new 자동차().달리다();
        new 자동차().서다();

        자동차.달리다();
    }
}

class 자동차 {
    static void 달리다() {
        System.out.println("달리다");
    }

    void 서다() {
        System.out.println("서다");
    }

}
