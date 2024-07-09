import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int firstNumber = sc.nextInt();  // 첫 번째 숫자를 입력받고 변수에 저장합니다.

        System.out.print("두 번째 숫자를 입력하세요: ");
        int secondNumber = sc.nextInt();  // 두 번째 숫자를 입력받고 변수에 저장합니다.

        System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /): ");
        char operator = sc.next().charAt(0);  // 사칙연산 기호를 입력받고 변수에 저장합니다.

        int result = 0;

        if (operator == '+') {
            result = firstNumber + secondNumber;
        } else if (operator == '-') {
            result = firstNumber - secondNumber;
        } else if (operator == '*') {
            result = firstNumber * secondNumber;
        } else if (operator == '/') {
            if (secondNumber != 0) {
                result = firstNumber / secondNumber;
            } else {
                System.out.println("0으로 나눌 수 없습니다.");
                sc.close();
                return;
            }
        } else {
            System.out.println("잘못된 연산자입니다.");
            sc.close();
            return;
        }

        // 결과를 출력합니다.
        System.out.println("결과: " + result);

        sc.close();  // Scanner를 닫아줍니다.
    }
}