package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalesAnalysisTest {
    @Test
    public void minSales() {
        SalesAnalysis service = new SalesAnalysis();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSales() {
        SalesAnalysis service = new SalesAnalysis();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void summaSales() {
        SalesAnalysis service = new SalesAnalysis();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.summaSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSalesAmount() {
        SalesAnalysis service = new SalesAnalysis();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageSalesAmount(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minS() {
        SalesAnalysis service = new SalesAnalysis();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.belowAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxS() {
        SalesAnalysis service = new SalesAnalysis();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.aboveAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void summaMassiva() {
        SalesAnalysis service = new SalesAnalysis();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.findSumWithoutUsingStream(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void averageValueMassiva() {
        SalesAnalysis service = new SalesAnalysis();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
       int actual = service.findAverageWithoutUsingStream(sales);
        Assertions.assertEquals(expected, actual);
    }
}
