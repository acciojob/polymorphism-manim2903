package com.driver;

import java.sql.SQLOutput;

public class Main {

    public static class Product{
        public int product(int x,int y){
            return x*y;
        }
        public int product(int x,int y,int z){
            return x*y*z;
        }
        public double product(double x,double y){
            return x*y;
        }
    }
    public static void main(String[] args){
        Product p=new Product();
        int x=p.product(2,3);

       int y= p.product(2,3,4);
        double z=p.product(2.0,3.0);
        System.out.println(x+" "+y+" "+z);

    }

}