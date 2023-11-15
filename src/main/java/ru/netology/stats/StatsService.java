package ru.netology.stats;

public class StatsService {
    /*метод, расчитывающий общую сумму продаж*/
    public int calSumSale(int[] sales) {
        int sumSale = 0; /* этой переменной будем считать  общую сумму продажа*/
        for (int i = 0; i < sales.length; i++) {
            sumSale = sumSale + sales[i];
        }
        return sumSale;
    }

    /*метод, расчитывающий среднюю сумму продаж*/
    public double calAverSumSale(int[] sales) {
        int sumSale = calSumSale(sales);
        double averSumSale = sumSale / sales.length;
        return averSumSale;
    }

    /*метод, расчитывающий номер месяца, в котором был пик продаж, то есть осуществлены продажи на минимальную сумму*;*/
    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    /*метод, расчитывающий номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*;*/
    public int maxSales(int[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }
        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    /*количество месяцев, в которых продажи были ниже среднего*/
    public int numMonthlessAver(int[] sales) {
        double averSumSale = calAverSumSale(sales);
        int sumMonthLessAver = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averSumSale) {
                sumMonthLessAver++;
            }
        }
        return sumMonthLessAver;
    }

    /* количество месяцев, в которых продажи были выше среднего */
    public int numMonthUpAver(int[] sales) {
        double averSumSale = calAverSumSale(sales);
        int sumMonthUpAver = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averSumSale) {
                sumMonthUpAver++;
            }
        }
        return sumMonthUpAver;
    }
}




