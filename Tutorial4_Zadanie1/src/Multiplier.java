import java.math.BigDecimal;
import java.util.List;

public class Multiplier {

    // Stwórz klasę Multiplier, która implementuje przeciążone metody multiply na
    // różne sposoby:

    // a) przyjmującą jako parametry dwie zmienne typu int
    public int multiply(int a, int b) {
        return a * b;
    }

    // b) przyjmującą jako parametry 4 zmienne typu int (ta metoda powinna w
    // swoim ciele wywoływać powyższą metodę przyjmującą dwa parametry typu int)
    public int multiply(int a, int b, int c, int d) {
        return multiply(a, b) * multiply(c, d);
    }

    // c) przyjmującą jako parametry 2 zmienne typu double
    public double multiply(double a, double b) {
        return a * b;
    }

    // d)  przyjmującą jako parametry dwa obiekty typu BigDecimal
    public BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }

    // e) przyjmującą jako parametr listę obiektów klasy Integer
    public int multiply(List<Integer> numbers) {
        int result = 1;
        for (int num : numbers) {
            result *= num;
        }
        return result;
    }
}