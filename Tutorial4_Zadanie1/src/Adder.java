import java.math.BigDecimal;
import java.util.List;


public class Adder {
    // Stwórz klasę Adder, która implementuje przeciążoną metodę add:

    // a) przyjmującą jako parametry dwie zmienne typu int
    public int add(int a, int b) {
        return a + b;
    }

    // b) przyjmującą jako parametry listę obiektów klasy BigDecimal
    public BigDecimal add(List<BigDecimal> numbers) {
        BigDecimal result = BigDecimal.ZERO;
        for (BigDecimal num : numbers) {
            result = result.add(num);
        }
        return result;
    }
}