package org.example;

public class Main   // 안녕하세요 10번 출력(println 한번사용)
{
    public static void main(String[] args)
    {
        System.out.println("안녕하세요" + "안녕하세요"+ "안녕하세요"+ "안녕하세요"+ "안녕하세요"+ "안녕하세요"+ "안녕하세요"+ "안녕하세요"+ "안녕하세요"+ "안녕하세요");

    }
}


class Main2 // 안녕하세요 10번 출력(역슬래쉬 활용)
{
    public static void main(String[] args)
    {
        System.out.println("안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n");

    }
}


class Main3  // a와 b의 값을 교체
{
    public static void main(String[] args) {
        // `int a` => a라는 이름의 변수(즉 공간)을 만든다.
        // `int` => a라는 공간에는 정수만 담을 수 있다.
        // `;` => 문장이 끝남을 알린다.
        int a;
        a = 5;

        System.out.println(a);
        System.out.println(a + 10);

        int b = 10;

        // `+` => 문장과 문자을 합친다.
        System.out.println("a : " + a);
        System.out.println("b : " + b);

        // 여기서 부터
        a=10;
        b=5;
        // 여기까지 수정 가능

        System.out.println("a : " + a);
        // 출력 : a : 10
        System.out.println("b : " + b);
        // 출력 :  b : 5
    }
}


class Main4  // a와 b의 값을 교체(사칙연산 사용 금지)
{
    public static void main(String[] args)
    {
        // `int a` => a라는 이름의 변수(즉 공간)을 만든다.
        // `int` => a라는 공간에는 정수만 담을 수 있다.
        // `;` => 문장이 끝남을 알린다.
        int a;
        a = 5;

        System.out.println(a);
        System.out.println(a + 10);

        int b = 10;

        // `+` => 문장과 문자을 합친다.
        System.out.println("a : " + a);
        System.out.println("b : " + b);

        // 여기서 부터
        int c = a;
        a=b;
        b=c;

        // 여기까지 수정 가능

        System.out.println("a : " + a);
        // 출력 : a : 10
        System.out.println("b : " + b);
        // 출력 :  b : 5
    }
}

// 문제 : 실행 되는 출력문에는 참 그렇지 않으면 거짓 이라고 적어주세요.

class Main5    // 참 거짓 구분
{
    public static void main(String[] args) {
        if ( true ) {
            System.out.println("참");
        }

        if ( false ) {
            System.out.println("거짓");
        }

        int a = 10;

        // `==` => 같다.
        if ( a == 10 ) {
            System.out.println("참1");
        }

        // `!=` => 같지 않다.
        if ( a != 10 ) {
            System.out.println("거짓");
        }

        if ( a > 10 ) {
            System.out.println("거짓");
        }

        if ( a >= 10 ) {
            System.out.println("참2");
        }

        int b = 10;

        if ( a == b ) {
            System.out.println("참3");
        }

        // boolean c => c 에는 오직 true/false 만 담을 수 있다.
        boolean c = a != b;

        if ( c ) {
            System.out.println("거짓");
        }

        if ( c == false ) {
            System.out.println("참4");
        }

        // `!` => 반전
        if ( !c ) {
            System.out.println("참5");
        }

        // `!` => 반전
        if ( !(!c) ) {
            System.out.println("거짓");
        }

        boolean d = true;

        if ( c != d ) {
            System.out.println("참6");
        }

        if ( 20 > 2 && 10 > 3 && true != false && 10 != 10 ) {
            System.out.println("거짓");
        }

        if ( 10 != 10 || 10 < 2 ) {
            System.out.println("거짓");
        }
    }
}


class Main6     // 05.31~ 배열 안의 값의 총 합, 평균 출력
{
    public static void main(String[] args) {
        int a = 10;

        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println("배열의 총 합: " + (arr[0]+arr[1]+arr[2]));
        System.out.println("배열의 평균 값: " + (arr[0]+arr[1]+arr[2])/3);
    }

}



