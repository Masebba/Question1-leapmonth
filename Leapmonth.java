/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.leapmonth;
/**
 *
 * @author maste
 */
public class Leapmonth {
    int year;
    int month;
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    public class LeapMonth {
    public static boolean isLeapMonth(int year, int month) {
        boolean isLeapMonth = (year % 4 == 0);
        isLeapMonth = isLeapMonth && (month % 100 != 0);
        isLeapMonth = isLeapMonth || (month % 400 == 0);
        return isLeapMonth;
    }
    public static void main(String[] args) {
        int year = 2024;
        int month = 2;
        if (isLeapMonth(year, month)) {
            System.out.println("The month " + month + " in year " + year + " is a leap month.");
        } else {
            System.out.println("The month " + month + " in year " + year + " is not a leap month.");
        }
    }
 }
}
