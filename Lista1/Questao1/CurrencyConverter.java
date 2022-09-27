package questao1;
public class CurrencyConverter {
    public static final double IOF = 0.06;
    public static double converter(Double amount, Double dollarPrice) {
        return (dollarPrice*amount) + (dollarPrice*amount) * IOF;
    }
}
