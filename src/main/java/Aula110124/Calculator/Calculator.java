package Aula110124.Calculator;

public class Calculator {

    private Double a;
    private Double b;

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double sum(Double a, Double b){
        return a + b;
    }

    public Double subtract(Double a, Double b){
        return a - b;
    }

    public Double multiply(Double a, Double b){
        return a * b;
    }

    public Double divide(Double a, Double b){
        return a / b;
    }
}
