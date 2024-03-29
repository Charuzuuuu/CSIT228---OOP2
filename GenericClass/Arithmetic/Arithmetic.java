package Arithmetic;

import java.util.ArrayList;
import java.util.List;

public class Arithmetic{
    private int num1;
    private double num2;

    List<Number> genNum;



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

    public List<Number> getGenNum(){
        return genNum;
    }

    public double add(){
        double sum = genNum.get(0).intValue() + genNum.get(1).doubleValue();

        //just a format to be uniform
        String format = String.format("%.2f", sum);

        return Double.parseDouble(format);
    }

    public double subtract(){
        double subt = genNum.get(0).intValue() - genNum.get(1).doubleValue();

        //just a format to be uniform
        String format = String.format("%.2f", subt);

        return Double.parseDouble(format);
    }

    public double multiply(){
        double prod = genNum.get(0).intValue() * genNum.get(1).doubleValue();

        //just a format to be uniform
        String format = String.format("%.2f", prod);

        return Double.parseDouble(format);
    }

    public double divide(){
        double quot = genNum.get(0).intValue() / genNum.get(1).doubleValue();

        //just a format to be uniform
        String format = String.format("%.2f", quot);

        return Double.parseDouble(format);
    }

    public Number getMin(){
        String format;
        if( genNum.get(0).intValue() < genNum.get(1).doubleValue()){
            return getGenNum().get(0);
        }

        format = String.format("%.2f", genNum.get(1).doubleValue());
        return Double.parseDouble(format);
    }

    public Number getMax(){
        String format;
        if( genNum.get(0).intValue() <  genNum.get(1).doubleValue()){
            format = String.format("%.2f", genNum.get(1).doubleValue());
            return Double.parseDouble(format);
        }

        return getGenNum().get(0);
    }
    
}

