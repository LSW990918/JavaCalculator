import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int firstNumber = sc.nextInt();

        int result = firstNumber;
        boolean continueCalculation = true;

        while (continueCalculation) {
            System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            System.out.print("다음 숫자를 입력하세요: ");
            int nextNumber = sc.nextInt();

            if (operator == '+') {
                result += nextNumber;
            } else if (operator == '-') {
                result -= nextNumber;
            } else if (operator == '*') {
                result *= nextNumber;
            } else if (operator == '/') {
                if (nextNumber != 0) {
                    result /= nextNumber;
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                    continue;
                }
            } else {
                System.out.println("잘못된 연산자입니다.");
                continue;
            }

            System.out.println("현재 결과: " + result);

            System.out.print("계산을 계속하시겠습니까? (yes/no): ");
            String userResponse = sc.next();

            if (userResponse.equalsIgnoreCase("no")) {
                continueCalculation = false;
            }
        }

        System.out.println("최종 결과: " + result);
        sc.close();
    }
}