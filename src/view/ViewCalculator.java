package view;

import javax.swing.*;
import java.awt.*;

public class ViewCalculator extends JFrame {
    private JButton btnOne,btnTwo,btnThree,btnFour,btnFive,btnSix,btnSeven,btnEight,btnNine,btnCero,btnEqual,btnClear,btnSum,btnRes,btnMult,btnDiv;
    private JTextField screenText;
    private JPanel mainPanel;

    public ViewCalculator(){
        getContentPane().setLayout(new BorderLayout());
        screenText = new JTextField("0");
        Font font = new Font("Dialog",Font.BOLD,30);
        screenText.setFont(font);
        screenText.setPreferredSize(new Dimension(125,100));
        screenText.setHorizontalAlignment(JTextField.RIGHT);
        screenText.setEditable(false);
        mainPanel = new JPanel();
        mainPanel.setLayout(null);

        btnSeven= new JButton("7");
        btnSeven.setBounds(0,0,60,50);
        mainPanel.add(btnSeven);

        btnEight= new JButton("8");
        btnEight.setBounds(60,0,60,50);
        mainPanel.add(btnEight);

        btnNine= new JButton("9");
        btnNine.setBounds(120,0,60,50);
        mainPanel.add(btnNine);

        btnSum= new JButton("+");
        btnSum.setBounds(180,0,60,50);
        mainPanel.add(btnSum);

        btnFour= new JButton("4");
        btnFour.setBounds(0,50,60,50);
        mainPanel.add(btnFour);

        btnFive= new JButton("5");
        btnFive.setBounds(60,50,60,50);
        mainPanel.add(btnFive);

        btnSix= new JButton("6");
        btnSix.setBounds(120,50,60,50);
        mainPanel.add(btnSix);

        btnRes= new JButton("-");
        btnRes.setBounds(180,50,60,50);
        mainPanel.add(btnRes);

        btnOne= new JButton("1");
        btnOne.setBounds(0,100,60,50);
        mainPanel.add(btnOne);

        btnTwo= new JButton("2");
        btnTwo.setBounds(60,100,60,50);
        mainPanel.add(btnTwo);

        btnThree= new JButton("3");
        btnThree.setBounds(120,100,60,50);
        mainPanel.add(btnThree);

        btnMult= new JButton("*");
        btnMult.setBounds(180,100,60,50);
        mainPanel.add(btnMult);

        btnClear = new JButton("C");
        btnClear.setBounds(0,150,60,50);
        mainPanel.add(btnClear);

        btnCero = new JButton("0");
        btnCero.setBounds(60,150,60,50);
        mainPanel.add(btnCero);

        btnDiv = new JButton("/");
        btnDiv.setBounds(120,150,60,50);
        mainPanel.add(btnDiv);

        btnEqual = new JButton("=");
        btnEqual.setBounds(180,150,60,50);
        mainPanel.add(btnEqual);
        getContentPane().add("North",screenText);
        getContentPane().add("Center",mainPanel);
        getContentPane().requestFocus();
    }

    public void errorMessage(String title,String description){
        JDialog error = new JDialog(this,title);
        error.setLayout(new BorderLayout());
        JLabel info = new JLabel(description,SwingConstants.CENTER);
        error.add(info);
        error.setSize(300,150);
        error.setVisible(true);
        error.setLocationRelativeTo(null);
    }

    public JButton getBtnOne() {
        return btnOne;
    }

    public void setBtnOne(JButton btnOne) {
        this.btnOne = btnOne;
    }

    public JButton getBtnTwo() {
        return btnTwo;
    }

    public void setBtnTwo(JButton btnTwo) {
        this.btnTwo = btnTwo;
    }

    public JButton getBtnThree() {
        return btnThree;
    }

    public void setBtnThree(JButton btnThree) {
        this.btnThree = btnThree;
    }

    public JButton getBtnFour() {
        return btnFour;
    }

    public void setBtnFour(JButton btnFour) {
        this.btnFour = btnFour;
    }

    public JButton getBtnFive() {
        return btnFive;
    }

    public void setBtnFive(JButton btnFive) {
        this.btnFive = btnFive;
    }

    public JButton getBtnSix() {
        return btnSix;
    }

    public void setBtnSix(JButton btnSix) {
        this.btnSix = btnSix;
    }

    public JButton getBtnSeven() {
        return btnSeven;
    }

    public void setBtnSeven(JButton btnSeven) {
        this.btnSeven = btnSeven;
    }

    public JButton getBtnEight() {
        return btnEight;
    }

    public void setBtnEight(JButton btnEight) {
        this.btnEight = btnEight;
    }

    public JButton getBtnNine() {
        return btnNine;
    }

    public void setBtnNine(JButton btnNine) {
        this.btnNine = btnNine;
    }

    public JButton getBtnCero() {
        return btnCero;
    }

    public void setBtnCero(JButton btnCero) {
        this.btnCero = btnCero;
    }

    public JButton getBtnEqual() {
        return btnEqual;
    }

    public void setBtnEqual(JButton btnEqual) {
        this.btnEqual = btnEqual;
    }

    public JButton getBtnClear() {
        return btnClear;
    }

    public void setBtnClear(JButton btnClear) {
        this.btnClear = btnClear;
    }

    public JButton getBtnSum() {
        return btnSum;
    }

    public void setBtnSum(JButton btnSum) {
        this.btnSum = btnSum;
    }

    public JButton getBtnRes() {
        return btnRes;
    }

    public void setBtnRes(JButton btnRes) {
        this.btnRes = btnRes;
    }

    public JButton getBtnMult() {
        return btnMult;
    }

    public void setBtnMult(JButton btnMult) {
        this.btnMult = btnMult;
    }

    public JButton getBtnDiv() {
        return btnDiv;
    }

    public void setBtnDiv(JButton btnDiv) {
        this.btnDiv = btnDiv;
    }

    public JTextField getScreenText() {
        return screenText;
    }


    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }
}
