package hal;

// 문제 : 할인 대상인지 아닌지 출력해주세요.
// 조건 : 나이가 19세 이하이거나 60세 이상이면 할인 대상입니다.
// 조건 : 출력예시 처럼 출력되어야 합니다.
// 조건 : `구현시작` 부분만 수정 할 수 있습니다.
// 조건 : 4가지 이상의 방법으로 풀어야 합니다.
// 조건 : 그 중 2가지 방법은 `&&, ||`없이 풀어야 합니다.

class Main1     // || 사용
{
    public static void main(String[] args) {
        int age = 20; // 이 값을 바꿔가면서 실행해보세요.

        System.out.println("당신의 나이는 " + age + "살 입니다.");

        if (age <= 19 || age >= 60)
            System.out.println("할인 대상입니다.");
        else
            System.out.println("할인 대상이 아닙니다.");
    }
}

class Main2     // && 사용
{
    public static void main(String[] args) {
        int age = 60; // 이 값을 바꿔가면서 실행해보세요.

        System.out.println("당신의 나이는 " + age + "살 입니다.");

        if (age <= 19 && age >= 0)
            System.out.println("할인 대상입니다.");
        else if (age <= 200 && age >= 60)
            System.out.println("할인 대상입니다.");
        else if (age > 19 && age < 60)
            System.out.println("할인 대상이 아닙니다.");
    }
}

class Main3     // 비교(>, <)만 사용해서 풀기
{
    public static void main(String[] args) {
        int age = 60; // 이 값을 바꿔가면서 실행해보세요.

        System.out.println("당신의 나이는 " + age + "살 입니다.");

        if (age >= 0)
            if (age <= 19)
                System.out.println("할인 대상입니다.");
            else if (age < 60)
                System.out.println("할인 대상이 아닙니다.");
            else if (age >= 60)
                System.out.println("할인 대상입니다.");
    }
}

class Main4     // 비교(>, <)와 더하기 섞기
{
    public static void main(String[] args) {
        int age = 60; // 이 값을 바꿔가면서 실행해보세요.

        System.out.println("당신의 나이는 " + age + "살 입니다.");

        if (age >= 0)
            if (age <= 19)
                System.out.println("할인 대상입니다.");
            else if (age >= 60)
                System.out.println("할인 대상입니다.");
            else if (age + 41 > 60)
                System.out.println("할인 대상이 아닙니다");
    }
}

class Main5     // 비교(>, <)와 빼기 섞기
{
    public static void main(String[] args) {
        int age = 60; // 이 값을 바꿔가면서 실행해보세요.

        System.out.println("당신의 나이는 " + age + "살 입니다.");

        if (age >= 0)
            if (age <= 19)
                System.out.println("할인 대상입니다.");
            else if (age >= 60)
                System.out.println("할인 대상입니다.");
            else if (age - 40 <= 19)
                System.out.println("할인 대상이 아닙니다");
    }
}

class Main6     // 비교(>, <)와 나누기 섞기
{
    public static void main(String[] args) {
        int age = 60; // 이 값을 바꿔가면서 실행해보세요.

        System.out.println("당신의 나이는 " + age + "살 입니다.");

        if (age/2 < 10)
            System.out.println("할인 대상입니다.");
            else if (age/2 >= 30)
                System.out.println("할인 대상입니다.");
            else if (age/2 >= 10)
                System.out.println("할인 대상이 아닙니다.");
    }
}

class Main7     // 비교(>, <)와 곱하기 섞기
{
    public static void main(String[] args) {
        int age = 10; // 이 값을 바꿔가면서 실행해보세요.

        System.out.println("당신의 나이는 " + age + "살 입니다.");

        if (age*2 < 40)
            System.out.println("할인 대상입니다.");
        else if (age*2 >= 120)
            System.out.println("할인 대상입니다.");
        else if (age*2 >= 40)
            System.out.println("할인 대상이 아닙니다.");
    }
}

class Main8     // 05.30~ 구구단 8*1000까지 출력
{
    public static void main(String[] args) {
        int dan = 8;

        for (int i = 1; i<1001; i++) {
            System.out.println(dan + " * " + i + " = " + dan * i);
        }
    }
}

class Main9     // 1부터 5까지 출력
{
    public static void main(String[] args) {
       for (int i=1; i<=5; i++) {
           System.out.println(i);
       }
    }
}

class Main10    // -100부터 25까지 출력(while 썼음)
{
    public static void main(String[] args) {
        for (int i = -100; i<=25; i++) {
            System.out.println(i);
        }
    }
}

class Main11     // 구구단 8*1000부터 *1 출력(while 사용)
{
    public static void main(String[] args) {
        int dan = 8;

        for (int i = 1000; i>=1; i--) {
            System.out.println(dan + " * " + i + " = " + dan * i);
        }
    }
}

class Main12     // 구구단 8*1000부터 *-500 출력(while 사용)
{
    public static void main(String[] args) {
        int dan = 8;


        for (int i = 1000; i>=-500; i--) {
            System.out.println(dan + " * " + i + " = " + dan * i);
        }
    }
}

class Main13    // 1부터 5까지 더한 값
{
    public static void main(String[] args) {
        int hap = 0;
        for (int i = 1; i<=5; i++) {
            hap+=i;
        }
        System.out.println(hap);
    }
}

class Main14    // -100부터 25까지 더한 값
{
    public static void main(String[] args) {
        int hap = 0;
        for (int i = -100; i<=25; i++) {
            hap+=i;
        }
        System.out.println(hap);
    }
}

class Main15    // 문제 : 1부터 3까지 출력하는 작업을 10번 해주세요.
// 조건 : 2중 while문 사용
{
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int x = 1;
        while (x<=10)
        {
            int i = 1;
            while (i<=3)
            {
                System.out.println(i);
                i++;
            }
            x++;
        }

    }
}

class Main16    // 문제 : 1부터 3까지 출력하는 작업을 10번 해주세요.
// 조건 : for문 사용
{
    public static void main(String[] args) {
        for (int x = 1; x<=10; x++)
        {
            for (int i = 1; i<=3; i++)
            {
                System.out.println(i);
            }
        }
    }
}

class Main17    // 별 찍기 코드 결과 분석
        /*변수 rows에 5라는 값이 담김.
         * 이 후 두 번째 for에서 k<=i만큼 내용이 반복됨.
         * i가 3일 때 두 번째 for은 총 3번 반복, i가 1일 때 두 번째 for은 총 한 번 반복
         * 하는 등의 과정을 거치며 별의 갯수가 최종적으로 i와 같게 나옴
         * 크게 봤을 때 첫 번째 for은 별의 줄 갯수(세로), 두 번째 for은 별의 가로 갯수(가로)를
         * 나타낸다고도 볼 수 있음*/
{


        public static void main(String[] args) {
            int rows = 5;

            for (int i = 1; i<= rows; i++) // 첫 번째 for
            {
                for (int k = 1; k<=i; k++) // 두 번째 for
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
}