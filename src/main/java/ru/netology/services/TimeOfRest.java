package ru.netology.services;

public class TimeOfRest {
    public int calculate(int income, int expenses, int threshold) {
        int account = 0;
        int monthsOfRest = 0;
        for (int month = 0; month < 12; month++) {
            if (account <= threshold) {
                account = account + income - expenses;
            } else {
                account = (account - expenses) / 3;
                monthsOfRest++;
            }
        }
        return monthsOfRest;
    }
}
