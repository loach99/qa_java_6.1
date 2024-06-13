package ru.netology;

public class SalesAnalysis {
    // номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму!!!
    public long minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public long belowAverage(int[] sales) {
        long sum = findAverageWithoutUsingStream(sales) ;
        int monthMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sum)
                monthMin = monthMin + 1;
        }
        return monthMin;
    }

    public long aboveAverage(int[] sales) {
        long sum = findAverageWithoutUsingStream(sales); // Среднее значение
        int monthMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sum)
                monthMax = monthMax + 1;
        }
        return monthMax;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int a = 0; a < sales.length; a++) {
            if (sales[a] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                maxMonth = a; // запомним его как минимальный
            }
        }
        return maxMonth + 1;
    }

    public long averageSalesAmount(int[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = (sum + sales[i]);
        }
        return sum / 12;
    }

    public long summaSales(int[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public long findSumWithoutUsingStream(int[] sales) {
        long sum = 0;
        for (int value : sales) {
            sum += value;
        }
        return sum;
    }

    public int findAverageWithoutUsingStream(int[] sales) {
        long sum = findSumWithoutUsingStream(sales);
        return (int) sum / sales.length;
    }
}
