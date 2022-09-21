import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] arg) {
        boolean flag = true;
        while (flag == true) {
            System.out.println("Номер задания: ");
            Scanner scan = new Scanner(System.in);
            int task = scan.nextInt();


            switch (task) {
                case (1): {
                    System.out.println("Введите число: ");
                    int a = scan.nextInt();
                    int c = a % 10;
                    System.out.println(c);
                    flag = false;
                    break;
                }

                case (2): {
                    System.out.println("Введите число: ");
                    int a = scan.nextInt();
                    int sum = 0;
                    if (a > 99 && a < 999) {
                        while (a > 0) {
                            sum = sum + a % 10;
                            a = a / 10;
                        }
                    } else {
                        System.out.println("Число не является трехзначным");
                    }
                    System.out.println(sum);
                    flag = false;
                    break;
                }

                case (3): {
                    System.out.println("Введите число: ");
                    int a = scan.nextInt();
                    if (a > 0) {
                        a++;
                        System.out.println(a);
                    } else {
                        System.out.println(a);
                    }
                    flag = false;
                    break;
                }

                case (4): {
                    System.out.println("Введите число: ");
                    int a = scan.nextInt();
                    if (a > 0) {
                        a++;
                        System.out.println(a);
                    } else if (a < 0) {
                        a = a - 2;
                        System.out.println(a);
                    } else {
                        a = a + 10;
                        System.out.println(a);
                    }
                    flag = false;
                    break;
                }

                case (5): {
                    System.out.println("Введите числа: ");
                    int a = scan.nextInt();
                    int b = scan.nextInt();
                    int c = scan.nextInt();
                    int d = Math.min(a, b);
                    int min = Math.min(d, c);
                    System.out.println(min);
                }

                case (6): {
                    System.out.println("Введите числа: ");
                    int a = scan.nextInt();
                    if (a > 0 && a % 2 == 0) {
                        System.out.println("Положительное, четное число");
                    } else if (a > 0 && a % 2 != 0) {
                        System.out.println("Положительно, нечетное число");
                    } else if (a < 0 && a % 2 == 0) {
                        System.out.println("Отрицательное, четное число");
                    } else if (a < 0 && a % 2 != 0) {
                        System.out.println("Отрицательное, нечетное число");
                    } else if (a == 0) {
                        System.out.println("Нулевое число");
                    }
                    flag = false;
                    break;
                }
                case (7): {
                    boolean flag2 = true;
                    while (flag2 == true) {
                        System.out.println("Введите код города: ");
                        int a = scan.nextInt();
                        float c = 0;
                        switch (a) {
                            case (905): {
                                System.out.println(c + (float) (10 * 4.15));
                                flag2 = false;
                                break;
                            }
                            case (194): {
                                System.out.println(c + (float) (10 * 1.98));
                                flag2 = false;
                                break;
                            }
                            case (419): {
                                System.out.println(c + (float) (10 * 2.69));
                                flag2 = false;
                                break;
                            }
                            case (800): {
                                System.out.println(c + (float) (10 * 5.00));
                                flag2 = false;
                                break;
                            }

                        }
                    }
                    flag = false;
                    break;
                }
                case (8): {
                    int[] A = {1, -10, 5, 6, 45, 23, 45, -34, 0, 32, 56, -1, 2, -2};
                    int maxNum = A[0];

                    for (int j : A) {
                        if (j > maxNum)
                            maxNum = j;
                    }
                    System.out.println("Максимальное число в массиве = " + maxNum);

                    int sum1 = 0;
                    for (int i = 0; i < A.length; i++) {
                        if (A[i] > 0) {
                            sum1 = sum1 + A[i];
                        }
                    }
                    System.out.println("Сумма положительных чисел массива: " + sum1);

                    int sum2 = 0;
                    for (int i = 0; i < A.length; i++) {
                        if (A[i] < 0 && A[i] % 2 == 0) {
                            sum2 = sum2 + A[i];
                        }
                    }
                    System.out.println("Сумма отрицательных, четных чисел массива: " + sum2);

                    int check = 0;
                    for (int i = 0; i < A.length; i++) {
                        if (A[i] > 0) {
                            check = check + 1;
                        }
                    }
                    System.out.println("Количество положительных элементов: " + check);

                    float avg = 0;
                    float check1 = 0;
                    float sum4 = 0;
                    for (int i = 0; i < A.length; i++) {
                        if (A[i] < 0) {
                            sum4 = sum4 + A[i];
                            check1 = check1 + 1;
                        }
                        avg = sum4 / check1;
                    }
                    System.out.println("Сумма отрицательных, четных чисел массива: " + avg);
                    flag = false;
                    break;
                }
                case (9): {
                    int[] A = {15, 10, 51, 6, 5, 3, 10, -34, 0, 32, 56, 12, 24, 52};
                    for (int i = A.length-1; i >= 0; i--) {
                        System.out.print(A[i] + " ");
                    }
                    flag = false;
                    break;
                }
                case (10): {
                    int[] A = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, 52};
                    int temp;
                    for (int i = 0; i < A.length; i++){
                        if (A[i] == 0){
                            for (int j = i + 1; j < A.length; j++){
                                if (A[j] != 0){
                                    temp = A[j];
                                    A[j] = A[i];
                                    A[i] = temp;
                                    break;
                                }
                            }
                        }
                    }
                    System.out.println("Конечный массив: " + Arrays.toString(A));
                    flag = false;
                    break;
                }
            }
        }
    }
}
