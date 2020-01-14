package com.xiangxun.test20200110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class KeyboardEntry {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String s  = input.nextLine();
        input.close();
//        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//        String s = input.readLine();
        System.out.println(s);
    }
}
