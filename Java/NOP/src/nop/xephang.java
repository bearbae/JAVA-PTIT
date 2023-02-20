/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class xephang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a[] = new int[10000];
        int b[] = new int[10000];
        for (int i = 0; i < x; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < x - 1; i++) {
            for (int j = i + 1; j < x; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                    int res = b[i];
                    b[i] = b[j];
                    b[j] = res;
                }
            }
        }
        int td = a[0] + b[0];
        for (int i = 1; i < x; i++) {
            if (td < a[i]) {
                td = a[i] + b[i];
            } else {
                td = td + b[i];
            }
        }
        System.out.println(td);
    }
}
