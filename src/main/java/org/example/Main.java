package org.example;

public class Main   // 안녕하세요 10번 출력(println 한번사용)
{
    public static void main(String[] args) {
        System.out.println("안녕하세요" + "안녕하세요" + "안녕하세요" + "안녕하세요" + "안녕하세요" + "안녕하세요" + "안녕하세요" + "안녕하세요" + "안녕하세요" + "안녕하세요");

    }
}


class Main2 // 안녕하세요 10번 출력(역슬래쉬 활용)
{
    public static void main(String[] args) {
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
        a = 10;
        b = 5;
        // 여기까지 수정 가능

        System.out.println("a : " + a);
        // 출력 : a : 10
        System.out.println("b : " + b);
        // 출력 :  b : 5
    }
}


class Main4  // a와 b의 값을 교체(사칙연산 사용 금지)
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
        int c = a;
        a = b;
        b = c;

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
        if (true) {
            System.out.println("참");
        }

        if (false) {
            System.out.println("거짓");
        }

        int a = 10;

        // `==` => 같다.
        if (a == 10) {
            System.out.println("참1");
        }

        // `!=` => 같지 않다.
        if (a != 10) {
            System.out.println("거짓");
        }

        if (a > 10) {
            System.out.println("거짓");
        }

        if (a >= 10) {
            System.out.println("참2");
        }

        int b = 10;

        if (a == b) {
            System.out.println("참3");
        }

        // boolean c => c 에는 오직 true/false 만 담을 수 있다.
        boolean c = a != b;

        if (c) {
            System.out.println("거짓");
        }

        if (c == false) {
            System.out.println("참4");
        }

        // `!` => 반전
        if (!c) {
            System.out.println("참5");
        }

        // `!` => 반전
        if (!(!c)) {
            System.out.println("거짓");
        }

        boolean d = true;

        if (c != d) {
            System.out.println("참6");
        }

        if (20 > 2 && 10 > 3 && true != false && 10 != 10) {
            System.out.println("거짓");
        }

        if (10 != 10 || 10 < 2) {
            System.out.println("거짓");
        }
    }
}


class Main6     // 05.31~ 배열 안의 값의 총 합, 평균 출력
{
    public static void main(String[] args) {
        int a = 10;

        int[] arr = new int[4]; // new 설계도();
        // 정수를 (int[])모양으로 만들어진 객체의 리모컨만 들어갈 수 있는 arr라는 변수를 만들자 마자
        // arr라는 변수에 int[4] 모양으로 객체를 만든 뒤 리모컨을 넣겠다.
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 70;

        System.out.println(arr.length);

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int avg = sum / arr.length;

        System.out.println("배열의 총 합: " + sum);
        System.out.printf("배열의 총 합: %d\n", sum);
        System.out.println("배열의 평균 값: " + avg);
        System.out.printf("배열의 평균 값: %d", avg);

    }

}


class Main7 {
    public static void main(String[] args) {
        boolean[] arr1 = new boolean[3];
        float[] arr2 = new float[3];
        int[] arr3 = new int[10];

        arr1[0] = true;
        arr1[1] = false;
        arr1[2] = true;

        arr2[0] = 3.14f;
        arr2[1] = 7.77f;
        arr2[2] = 11.11f;


        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);

        for (int i = 0; i <= arr3.length; i++) {
            arr3[i] = i + 1;
            System.out.println(arr3[i]);
        }


    }
}

class Main8 {
    public static void main(String[] args) {
        myObject a = new myObject();
        a.이름 = "영희";
        a.나이 = 22;
        a.키 = 175.2f;
        a.학번 = 201549285;
        a.손크기 = 17.21;
        System.out.println(a.이름 + " " + a.나이 + " " + a.키 + " "
                + a.학번 + " " + a.손크기);
    }
}

class myObject {

    String 이름;
    int 나이;
    float 키;
    long 학번;
    double 손크기;
}

// 문제 : 아래 코드가 실행되도록 자동차 클래스를 만들어주세요.
class Main10 {
    public static void main(String[] args) {
        자동차.달리다();

    }
}

class 자동차 {
    static void 달리다() {
        System.out.println("달리다");
    }
}

class Main11        // 계산기 함수 예시
{
    public static void main(String[] args) {
        계산기.합(10, 20); // 출력 30
        계산기.합(30, 40); // 출력 70
        // 계산기.합(9); // 출력 70
    }
}

/*class 계산기
{
    static void 합(int c) {
        System.out.println("c: "+c);
    }

    static void 합(int a, int b) {
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}*/


class Main12        // 계산기 함수 예시
{
    public static void main(String[] args) {
        int rs = 계산기.합(10, 20);
        System.out.println(rs);

        boolean rs2 = 계산기.is_a_bigger_than_b(10, 20);
        System.out.println(rs2);
        rs2 = 계산기.is_a_bigger_than_b(240, 20);
        System.out.println(rs2);
        rs2 = 계산기.is_a_bigger_than_b(20, 20);
        System.out.println(rs2);
    }
}

class 계산기 {
    static int 합(int a, int b) {
        return a+b;
    }

    static boolean is_a_bigger_than_b(int a, int b) {
        if (a>b){
            return true;
        }
        return false;
    }

}









