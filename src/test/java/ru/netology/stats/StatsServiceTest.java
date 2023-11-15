package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void test1() {
        StatsService service = new StatsService();
        int[] sale = {10, 12, 16, 18, 20};

        int expected = 76;
        int actual = service.calSumSale(sale);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void test2() {
        StatsService service = new StatsService();
        int[] sale = {10, 12, 16, 18, 20};
        double expected = 15.0;
        double actual = service.calAverSumSale(sale);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        StatsService service = new StatsService();
        int[] sale = {10, 12, 16, 18, 20};
        int expected = 1;
        int actual = service.minSales(sale);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        StatsService service = new StatsService();
        int[] sale = {10, 12, 16, 18, 20};
        int expected = 5;
        int actual = service.maxSales(sale);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        StatsService service = new StatsService();
        int[] sale = {10, 12, 16, 18, 20};
        int expected = 2;
        int actual = service.numMonthlessAver(sale);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        StatsService service = new StatsService();
        int[] sale = {10, 12, 16, 18, 20};
        int expected = 3;
        int actual = service.numMonthUpAver(sale);

        Assertions.assertEquals(expected, actual);
    }
}
