package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackerServiceTest {

    @Test
    public void shouldAdviceIfLessThanAThousand() {
        CashbackHackerService cashbackHackerService = new CashbackHackerService();
        int amount = 900;

        int actual = cashbackHackerService.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }
    @Test
    public void shouldNotAdviceIfThousand() {
        CashbackHackerService cashbackHackerService = new CashbackHackerService();
        int amount = 1000;

        int actual = cashbackHackerService.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
    @Test
    public void shouldAdviceIfMoreThanThousand() {
        CashbackHackerService cashbackHackerService = new CashbackHackerService();
        int amount = 1500;

        int actual = cashbackHackerService.remain(amount);
        int expected = 500;
        assertEquals(actual, expected);
    }
}