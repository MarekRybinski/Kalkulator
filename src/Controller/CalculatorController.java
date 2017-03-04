package Controller;

import Viewer.CalculatorView;
import Zadanie_Funkcja.Stream.Swing.CalculatroModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {

    private CalculatorView calculatorView;

    private CalculatroModel calculatroModel;

    public CalculatorController(CalculatorView calculatorView, CalculatroModel calculatroModel) {
        this.calculatorView = calculatorView;
        this.calculatroModel = calculatroModel;
        this.calculatorView.addCalculateListener(new CalculatorListner());
    }

        class CalculatorListner implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {

                int firstNumber, secondNumber = 0;

                firstNumber = calculatorView.getFirstNumber();

                secondNumber = calculatorView.getSecondNumber();

                calculatroModel.addTwoNumber(firstNumber, secondNumber);

                calculatorView.setCalcResult(calculatroModel.getCalculatorResult());
            }
        }
}
