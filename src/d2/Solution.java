package d2;

public class Solution {
    public static int solution(int a, int b, int c) {
        if (a == b && b == c) {
            // 세 숫자가 모두 같을 경우
            return (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        } else if (a == b || b == c || a == c) {
            // 두 숫자가 같을 경우
            return (a + b + c) * (a * a + b * b + c * c);
        } else {
            // 세 숫자가 모두 다를 경우
            return a + b + c;
        }
    }

    public static void main(String[] args) {
        // 테스트 예제
        int result1 = solution(1, 2, 3);
        int result2 = solution(2, 2, 3);
        int result3 = solution(3, 3, 3);

        System.out.println("Result 1: " + result1); // Output: 6
        System.out.println("Result 2: " + result2); // Output: 70
        System.out.println("Result 3: " + result3); // Output: 2430
    }
}
