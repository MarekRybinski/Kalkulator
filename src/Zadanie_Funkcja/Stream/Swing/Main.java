package Zadanie_Funkcja.Stream.Swing;

import Controller.CalculatorController;
import Viewer.CalculatorView;

public class Main {

    public static void main(String[] args) {

        CalculatorView calculatorView = new CalculatorView();

        CalculatroModel calculatroModel = new CalculatroModel();

        CalculatorController calculatorcontroller = new CalculatorController(calculatorView, calculatroModel);

        calculatorView.setVisible(true);



    }
}
