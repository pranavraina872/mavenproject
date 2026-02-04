package com.DataTypes;

public class Sum {
  public  float num1;
  public  float num2;
  public  float sum;

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }
    public void sum(float num1,float num2){
        this.num1=num1;
        this.num2=num2;
        this.sum=num1+num2;
        System.out.println(sum);
    }
}
