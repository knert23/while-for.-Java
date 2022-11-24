import java.util.Scanner;

public class Task64 {
    public static void main(String[] args) {
        Scan();
    }
    public static int Scan() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите целое десятичное число");
            int input = scanner.nextInt();
            System.out.println("Введите основание системы счисления");
            int base = scanner.nextInt();
            if (base < 2 | base > 10) {
                System.out.println("Ошибка");
                return Scan();
            } else {
                Tranfer(input, base);
            }
        }
        catch (Exception e) {
            System.out.println("Ошибка");
            return Scan();
        }
        return 0;
    }
    public static int Tranfer(int input, int base) {
        String resultStr = "";
        while (input > 0) {
            resultStr = (input % base) + resultStr;
            input /= base;
            //System.out.println(input);
        }
        int result = Integer.valueOf(resultStr);
        System.out.println("Результат перевода = " + result);
        return NewScan(result, base);
    }
    public static int NewScan(int result, int oldBase) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Перевести в следующую систему счисления?" +
                "\nВведите 1, если да, иначе введите любой другой символ");
        try {
            int answer = scanner.nextInt();
            if (answer == 1) {
                System.out.println("Введите новую систему счисления");
                int newBase = scanner.nextInt();
                if (newBase < 2 | newBase > 10) {
                    System.out.println("Ошибка");
                    return NewScan(result, oldBase);
                } else {
                    TransferToNewBase(result, oldBase, newBase);
                }
            }
        }
        catch(Exception e){
                System.out.println("Ошибка");
                return NewScan(result, oldBase);
            }
            return 0;
    }
    public static int TransferToNewBase ( int number, int oldBase, int newBase){
        int result = Integer.parseInt(String.valueOf(number), oldBase);
        String resultStr = "";
        while (result > 0) {
            resultStr = (result % newBase) + resultStr;
            result /= newBase;
            //System.out.println(input);
        }
        int resultEnd = Integer.valueOf(resultStr);
        System.out.println("Результат перевода = " + resultEnd);
        return NewScan(resultEnd, newBase);
    }
}