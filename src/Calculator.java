import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean poweroff = false;

        while (!poweroff) {
            double answer = 0;
 //           System.out.println("Введите 1 число: ");
            double operand1 = console.nextDouble();
            boolean reset = false;

            while (!reset && !poweroff) {
 //               System.out.println("Введите действие: ");
                char operation = console.next().charAt(0);

                if (operation == 'C' || operation == 'c' || operation == 'С' || operation == 'с') {
                    reset = true;
                    break;
                }
                if (operation == 'S' || operation == 's') {
                    poweroff = true;
                    break;
                }

//                System.out.println("Введите 2 число: ");
                double operand2 = console.nextDouble();

                switch (operation) {
                    case '+':
                        answer = operand1 + operand2;
                        break;
                    case '-':
                        answer = operand1 - operand2;
                        break;
                    case '*':
                        answer = operand1 * operand2;
                        break;
                    case '/':
                        if (operand2 != 0) {
                            answer = operand1 / operand2;
                        } else {
                            System.out.println("Ошибка. Нельзя делить на 0");
                            continue;
                        }
                        break;
                    default:
                        System.out.println("Неподдерживаемая операция");
                        continue;
                }
                System.out.println(answer);
                operand1 = answer;
            }

        }

    }

}

