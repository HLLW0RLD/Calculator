package com.example.myfirstapp.calculator;

public class Counter {

    MainActivity main = new MainActivity();

    private Integer result = 0;

    private Integer firstNum = 0;
    private Integer secondNum = 0;
    private Boolean isFirst = true;
    public void number(int key){
        if (isFirst){
            result = firstNum * 10 + key;
            main.showResult(result);
        }else {
            result = secondNum * 10 + key;
            main.showResult(result);
        }
    }

    public void operators(int operation){
        switch (operation){
            case 1:
                isFirst = false;
                result = firstNum - secondNum;
                main.showResult(result);
                break;
            case 2:
                isFirst = false;
                result = firstNum + secondNum;
                main.showResult(result);
                break;
            case 3:
                isFirst = false;
                result = firstNum / secondNum;
                main.showResult(result);
                break;
            case 4:
                isFirst = false;
                result = firstNum * secondNum;
                main.showResult(result);
                break;
        }
    }
}
