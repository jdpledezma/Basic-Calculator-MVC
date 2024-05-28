package model;

public class ModelCalculator {
    private String numbersString = "";
    private String operation = "";

    public String getNumbersString() {
        return numbersString;
    }

    public String setNumbersString(String numbersString) {
        this.numbersString = numbersString;
        return numbersString;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int sum(int num1, int num2){
        return num1 + num2;
    }

    public int res(int num1, int num2){
        return num1 - num2;
    }

    public int multi(int num1, int num2){
        return num1 * num2;
    }

    public int div(int num1, int num2){
        int result = 0;
        try {
            result = num1 / num2;
        }catch (Exception e){
            System.out.println("error : " + e);;
        }finally {

        }
     return result;
    }


}
