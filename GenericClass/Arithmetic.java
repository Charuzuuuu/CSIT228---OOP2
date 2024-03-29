package Arithmetic;

import java.util.ArrayList;
import java.util.List;
import java.lang.Object;

public class Arithmetic{
    private int num1;
    private double num2;

    List<Object> genNum;



    public Arithmetic(int num1, double num2){
        genNum = new ArrayList<>();
        genNum.add(num1);
        genNum.add(num2);
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1(){
        return num1;
    }

    public double getNum2(){
        return num2;
    }

    public List<Object> getGenNum(){
        return genNum;
    }

    public double add(){
        double sum = (int) genNum.get(0) + (double) genNum.get(1);

        //just a format to be uniform
        String format = String.format("%.2f", sum);

        return Double.parseDouble(format);
    }

    public double subtract(){
        double subt = (int) genNum.get(0) - (double) genNum.get(1);

        //just a format to be uniform
        String format = String.format("%.2f", subt);

        return Double.parseDouble(format);
    }

    public double multiply(){
        double prod = (int) genNum.get(0) * (double) genNum.get(1);

        //just a format to be uniform
        String format = String.format("%.2f", prod);

        return Double.parseDouble(format);
    }

    public double divide(){
        double quot = (int) genNum.get(0) / (double) genNum.get(1);

        //just a format to be uniform
        String format = String.format("%.2f", quot);

        return Double.parseDouble(format);
    }

    public Object getMin(){
        String format;
        if((int) genNum.get(0) < (double) genNum.get(1)){
            return getGenNum().get(0);
        }

        format = String.format("%.2f", genNum.get(1));
        return Double.parseDouble(format);
    }

    public Object getMax(){
        String format;
        if((int) genNum.get(0) < (double) genNum.get(1)){
            format = String.format("%.2f", (double) genNum.get(1));
            return Double.parseDouble(format);
        }

        return getGenNum().get(0);
    }

}

