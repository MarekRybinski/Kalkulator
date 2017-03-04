package Zadanie_Funkcja.Stream.Swing;

public class CalculatroModel {

    private int calculatorResult;

    public void addTwoNumber(int a, int b){

        calculatorResult = a + b;
    }
    public int getCalculatorResult(){
        return calculatorResult;
    }

}
