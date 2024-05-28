package controller;

import model.ModelCalculator;
import view.ViewCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ControllerCalculator implements ActionListener, KeyListener {
    ModelCalculator model = new ModelCalculator();
    ViewCalculator view = new ViewCalculator();

    public ControllerCalculator(ViewCalculator view, ModelCalculator model ){
        this.view = view;
        this.model = model;
        this.view.getBtnOne().addActionListener((ActionListener) this);
        this.view.getBtnTwo().addActionListener((ActionListener) this);
        this.view.getBtnThree().addActionListener((ActionListener) this);
        this.view.getBtnFour().addActionListener((ActionListener) this);
        this.view.getBtnFive().addActionListener((ActionListener) this);
        this.view.getBtnSix().addActionListener((ActionListener) this);
        this.view.getBtnSeven().addActionListener((ActionListener) this);
        this.view.getBtnEight().addActionListener((ActionListener) this);
        this.view.getBtnNine().addActionListener((ActionListener) this);
        this.view.getBtnCero().addActionListener((ActionListener) this);
        this.view.getBtnEqual().addActionListener((ActionListener) this);
        this.view.getBtnClear().addActionListener((ActionListener) this);
        this.view.getBtnSum().addActionListener((ActionListener) this);
        this.view.getBtnRes().addActionListener((ActionListener) this);
        this.view.getBtnMult().addActionListener((ActionListener) this);
        this.view.getBtnDiv().addActionListener((ActionListener) this);

        this.view.addKeyListener(this);
        this.view.setFocusable(true);


    }

    public void startScreen(){
        view.setTitle("Calculator MVC");
        view.setSize(240,333);
        view.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        view.setLocationRelativeTo(null);
        view.setResizable(false);
        view.setVisible(true);
    }

    public boolean validationZero(String number){
        if(number.equals("0")){
            return true;
        }else{
            return  false;
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == view.getBtnOne()){
            String numbersString = model.getNumbersString();
            String screen = view.getScreenText().getText();
            boolean validation = validationZero(screen);
            if(validation){
                numbersString = "";
                model.setNumbersString(numbersString);
                view.getScreenText().setText(numbersString);
            }
            numbersString += "1";
            model.setNumbersString(numbersString);
            view.getScreenText().setText(numbersString);
        }

        if(e.getSource() == view.getBtnTwo()){
            String numbersString = model.getNumbersString();
            String screen = view.getScreenText().getText();
            boolean validation = validationZero(screen);
            if(validation){
                numbersString = "";
                model.setNumbersString(numbersString);
                view.getScreenText().setText(numbersString);
            }
            numbersString += "2";
            model.setNumbersString(numbersString);
            view.getScreenText().setText(numbersString);
        }

        if(e.getSource() == view.getBtnThree()){
            String numbersString = model.getNumbersString();
            String screen = view.getScreenText().getText();
            boolean validation = validationZero(screen);
            if(validation){
                numbersString = "";
                model.setNumbersString(numbersString);
                view.getScreenText().setText(numbersString);
            }
            numbersString += "3";
            model.setNumbersString(numbersString);
            view.getScreenText().setText(numbersString);
        }

        if(e.getSource() == view.getBtnFour()){
            String numbersString = model.getNumbersString();
            String screen = view.getScreenText().getText();
            boolean validation = validationZero(screen);
            if(validation){
                numbersString = "";
                model.setNumbersString(numbersString);
                view.getScreenText().setText(numbersString);
            }
            numbersString += "4";
            model.setNumbersString(numbersString);
            view.getScreenText().setText(numbersString);
        }

        if(e.getSource() == view.getBtnFive()){
            String numbersString = model.getNumbersString();
            String screen = view.getScreenText().getText();
            boolean validation = validationZero(screen);
            if(validation){
                numbersString = "";
                model.setNumbersString(numbersString);
                view.getScreenText().setText(numbersString);
            }
            numbersString += "5";
            model.setNumbersString(numbersString);
            view.getScreenText().setText(numbersString);
        }

        if(e.getSource() == view.getBtnSix()){
            String numbersString = model.getNumbersString();
            String screen = view.getScreenText().getText();
            boolean validation = validationZero(screen);
            if(validation){
                numbersString = "";
                model.setNumbersString(numbersString);
                view.getScreenText().setText(numbersString);
            }
            numbersString += "6";
            model.setNumbersString(numbersString);
            view.getScreenText().setText(numbersString);
        }

        if(e.getSource() == view.getBtnSeven()){
            String numbersString = model.getNumbersString();
            String screen = view.getScreenText().getText();
            boolean validation = validationZero(screen);
            if(validation){
                numbersString = "";
                model.setNumbersString(numbersString);
                view.getScreenText().setText(numbersString);
            }
            numbersString += "7";
            model.setNumbersString(numbersString);
            view.getScreenText().setText(numbersString);
        }

        if(e.getSource() == view.getBtnEight()){
            String numbersString = model.getNumbersString();
            String screen = view.getScreenText().getText();
            boolean validation = validationZero(screen);
            if(validation){
                numbersString = "";
                model.setNumbersString(numbersString);
                view.getScreenText().setText(numbersString);
            }
            numbersString += "8";
            model.setNumbersString(numbersString);
            view.getScreenText().setText(numbersString);
        }

        if(e.getSource() == view.getBtnNine()){
            String numbersString = model.getNumbersString();
            String screen = view.getScreenText().getText();
            boolean validation = validationZero(screen);
            if(validation){
                numbersString = "";
                model.setNumbersString(numbersString);
                view.getScreenText().setText(numbersString);
            }
            numbersString += "9";
            model.setNumbersString(numbersString);
            view.getScreenText().setText(numbersString);
        }

        if(e.getSource() == view.getBtnCero()){
            String numbersString = model.getNumbersString();
            String screen = view.getScreenText().getText();
            boolean validation = validationZero(screen);
            if(validation){
                numbersString = "";
                model.setNumbersString(numbersString);
                view.getScreenText().setText(numbersString);
            }
            numbersString += "0";
            model.setNumbersString(numbersString);
            view.getScreenText().setText(numbersString);
        }

        if(e.getSource() == view.getBtnSum()){
            String numbersString = model.getNumbersString();
            numbersString += "+";
            String operation = model.getOperation();
            operation = "sum";
            model.setOperation(operation);
            model.setNumbersString(numbersString);
            view.getScreenText().setText(numbersString);
        }

        if(e.getSource() == view.getBtnRes()){
            String numbersString = model.getNumbersString();
            numbersString += "-";
            String operation = model.getOperation();
            operation = "res";
            model.setOperation(operation);
            model.setNumbersString(numbersString);
            view.getScreenText().setText(numbersString);
        }

        if(e.getSource() == view.getBtnMult()){
            String numbersString = model.getNumbersString();
            numbersString += "*";
            String operation = model.getOperation();
            operation = "mult";
            model.setOperation(operation);
            model.setNumbersString(numbersString);
            view.getScreenText().setText(numbersString);
        }

        if(e.getSource() == view.getBtnDiv()){
            String numbersString = model.getNumbersString();
            numbersString += "/";
            String operation = model.getOperation();
            operation = "div";
            model.setOperation(operation);
            model.setNumbersString(numbersString);
            view.getScreenText().setText(numbersString);
        }

        if(e.getSource() == view.getBtnClear()){
            String numberString = "0";
            model.setNumbersString(numberString);
            view.getScreenText().setText(numberString);
        }

        if(e.getSource() == view.getBtnEqual()){
            String numberString = view.getScreenText().getText();
            String[] arrayNumber = numberString.split("[\\+\\-\\*\\/]+");
            String numberOne = arrayNumber[0];
            String numberTwo = arrayNumber[1];

            if(arrayNumber.length > 2){
                view.errorMessage("Error","Two Max Number");
                model.setNumbersString("");
                view.getScreenText().setText("0");
            }

            if(numberTwo.equals("0")){
                view.errorMessage("Invalid Operation","Imposible divide with zero.");
                model.setNumbersString(" ");
                System.out.println(model.getNumbersString());
                view.getScreenText().setText("0");
            }

            if(model.getOperation().equals("sum")){
                int numberOneInt = Integer.parseInt(numberOne);
                int numberTwoInt = Integer.parseInt(numberTwo);
                int result = model.sum(numberOneInt,numberTwoInt);
                String resultString = String.valueOf(result);
                model.setNumbersString(resultString);
                view.getScreenText().setText(resultString);
            }
            else if(model.getOperation().equals("res")){
                int numberOneInt = Integer.parseInt(numberOne);
                int numberTwoInt = Integer.parseInt(numberTwo);
                int result = model.res(numberOneInt,numberTwoInt);
                String resultString = String.valueOf(result);
                model.setNumbersString(resultString);
                view.getScreenText().setText(resultString);
            }
            else if(model.getOperation().equals("mult")){
                int numberOneInt = Integer.parseInt(numberOne);
                int numberTwoInt = Integer.parseInt(numberTwo);
                int result = model.multi(numberOneInt,numberTwoInt);
                String resultString = String.valueOf(result);
                model.setNumbersString(resultString);
                view.getScreenText().setText(resultString);
            }

            else if(model.getOperation().equals("div")){
                int numberOneInt = Integer.parseInt(numberOne);
                int numberTwoInt = Integer.parseInt(numberTwo);
                int result = model.div(numberOneInt,numberTwoInt);
                String resultString = String.valueOf(result);
                model.setNumbersString(resultString);
                view.getScreenText().setText(resultString);
            }
        }
        view.requestFocus();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if(e.getKeyCode() == KeyEvent.VK_1){
            String numbersString = model.getNumbersString();
            String screen = view.getScreenText().getText();
            boolean validation = validationZero(screen);
            if(validation){
                numbersString = "";
                model.setNumbersString(numbersString);
                view.getScreenText().setText(numbersString);
            }
            numbersString += "1";
            model.setNumbersString(numbersString);
            view.getScreenText().setText(numbersString);
        }

        if(e.getKeyCode() == KeyEvent.VK_2){
            String numbersString = model.getNumbersString();
            String screen = view.getScreenText().getText();
            boolean validation = validationZero(screen);
            if(validation){
                numbersString = "";
                model.setNumbersString(numbersString);
                view.getScreenText().setText(numbersString);
            }
            numbersString += "2";
            model.setNumbersString(numbersString);
            view.getScreenText().setText(numbersString);
        }

        if(e.getKeyCode() == KeyEvent.VK_3){
            String numbersString = model.getNumbersString();
            String screen = view.getScreenText().getText();
            boolean validation = validationZero(screen);
            if(validation){
                numbersString = "";
                model.setNumbersString(numbersString);
                view.getScreenText().setText(numbersString);
            }
            numbersString += "3";
            model.setNumbersString(numbersString);
            view.getScreenText().setText(numbersString);
        }

        if(e.getKeyCode() == KeyEvent.VK_4){
            String numbersString = model.getNumbersString();
            String screen = view.getScreenText().getText();
            boolean validation = validationZero(screen);
            if(validation){
                numbersString = "";
                model.setNumbersString(numbersString);
                view.getScreenText().setText(numbersString);
            }
            numbersString += "4";
            model.setNumbersString(numbersString);
            view.getScreenText().setText(numbersString);
        }

        if(e.getKeyCode() == KeyEvent.VK_5){
            String numbersString = model.getNumbersString();
            String screen = view.getScreenText().getText();
            boolean validation = validationZero(screen);
            if(validation){
                numbersString = "";
                model.setNumbersString(numbersString);
                view.getScreenText().setText(numbersString);
            }
            numbersString += "5";
            model.setNumbersString(numbersString);
            view.getScreenText().setText(numbersString);
        }

        if(e.getKeyCode() == KeyEvent.VK_6){
            String numbersString = model.getNumbersString();
            String screen = view.getScreenText().getText();
            boolean validation = validationZero(screen);
            if(validation){
                numbersString = "";
                model.setNumbersString(numbersString);
                view.getScreenText().setText(numbersString);
            }
            numbersString += "6";
            model.setNumbersString(numbersString);
            view.getScreenText().setText(numbersString);
        }
        if(e.getKeyCode() == KeyEvent.VK_7){
            String numbersString = model.getNumbersString();
            String screen = view.getScreenText().getText();
            boolean validation = validationZero(screen);
            if(validation){
                numbersString = "";
                model.setNumbersString(numbersString);
                view.getScreenText().setText(numbersString);
            }
            numbersString += "7";
            model.setNumbersString(numbersString);
            view.getScreenText().setText(numbersString);
        }
        if(e.getKeyCode() == KeyEvent.VK_8){
            String numbersString = model.getNumbersString();
            String screen = view.getScreenText().getText();
            boolean validation = validationZero(screen);
            if(validation){
                numbersString = "";
                model.setNumbersString(numbersString);
                view.getScreenText().setText(numbersString);
            }
            numbersString += "8";
            model.setNumbersString(numbersString);
            view.getScreenText().setText(numbersString);
        }
        if(e.getKeyCode() == KeyEvent.VK_9){
            String numbersString = model.getNumbersString();
            String screen = view.getScreenText().getText();
            boolean validation = validationZero(screen);
            if(validation){
                numbersString = "";
                model.setNumbersString(numbersString);
                view.getScreenText().setText(numbersString);
            }
            numbersString += "9";
            model.setNumbersString(numbersString);
            view.getScreenText().setText(numbersString);
        }
        if(e.getKeyCode() == KeyEvent.VK_0){
            String numbersString = model.getNumbersString();
            String screen = view.getScreenText().getText();
            boolean validation = validationZero(screen);
            if(validation){
                numbersString = "";
                model.setNumbersString(numbersString);
                view.getScreenText().setText(numbersString);
            }
            numbersString += "0";
            model.setNumbersString(numbersString);
            view.getScreenText().setText(numbersString);
        }

        if(e.getKeyCode() == KeyEvent.VK_ADD){
            String numbersString = model.getNumbersString();
            numbersString += "+";
            String operation = "sum";
            model.setOperation(operation);
            model.setNumbersString(numbersString);
            view.getScreenText().setText(numbersString);
        }

        if(e.getKeyCode() == KeyEvent.VK_SUBTRACT){
            String numbersString = model.getNumbersString();
            numbersString += "-";
            String operation = "res";
            model.setOperation(operation);
            model.setNumbersString(numbersString);
            view.getScreenText().setText(numbersString);
        }

        if(e.getKeyCode() == KeyEvent.VK_MULTIPLY){
            String numbersString = model.getNumbersString();
            numbersString += "*";
            String operation = "multi";
            model.setOperation(operation);
            model.setNumbersString(numbersString);
            view.getScreenText().setText(numbersString);
        }


        if(e.getKeyCode() == KeyEvent.VK_DIVIDE){
            String numbersString = model.getNumbersString();
            numbersString += "/";
            String operation = "div";
            model.setOperation(operation);
            model.setNumbersString(numbersString);
            view.getScreenText().setText(numbersString);
        }

        if(e.getKeyCode() == KeyEvent.VK_DELETE){
            String numberString = " ";
            model.setNumbersString(numberString);
            view.getScreenText().setText("0");
        }



        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            String numberString = view.getScreenText().getText();
            String[] arrayNumber = numberString.split("[\\+\\-\\*\\/]+");
            String numberOne = arrayNumber[0];
            String numberTwo = arrayNumber[1];

            if(numberTwo.equals("0")){
                view.errorMessage("Invalid Operation","Imposible divide with zero.");
                model.setNumbersString(" ");
                System.out.println(model.getNumbersString());
                view.getScreenText().setText("0");
            }

            if(model.getOperation().equals("sum")){
                int numberOneInt = Integer.parseInt(numberOne);
                int numberTwoInt = Integer.parseInt(numberTwo);
                int result = model.sum(numberOneInt,numberTwoInt);
                String resultString = String.valueOf(result);
                model.setNumbersString(resultString);
                view.getScreenText().setText(resultString);
            }
            else if(model.getOperation().equals("res")){
                int numberOneInt = Integer.parseInt(numberOne);
                int numberTwoInt = Integer.parseInt(numberTwo);
                int result = model.res(numberOneInt,numberTwoInt);
                String resultString = String.valueOf(result);
                model.setNumbersString(resultString);
                view.getScreenText().setText(resultString);
            }
            else if(model.getOperation().equals("multi")){
                int numberOneInt = Integer.parseInt(numberOne);
                int numberTwoInt = Integer.parseInt(numberTwo);
                int result = model.multi(numberOneInt,numberTwoInt);
                String resultString = String.valueOf(result);
                model.setNumbersString(resultString);
                view.getScreenText().setText(resultString);
            }

            else if(model.getOperation().equals("div")){
                int numberOneInt = Integer.parseInt(numberOne);
                int numberTwoInt = Integer.parseInt(numberTwo);
                int result = model.div(numberOneInt,numberTwoInt);
                String resultString = String.valueOf(result);
                model.setNumbersString(resultString);
                view.getScreenText().setText(resultString);
            }

            }
        view.requestFocus();
        }


    @Override
    public void keyReleased(KeyEvent e) {

    }
}
