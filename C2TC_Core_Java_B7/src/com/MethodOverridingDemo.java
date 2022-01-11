package com;
public class MethodOverridingDemo {

  public static void main(String[] args) {
     SBI obj=new SBI();
      System.out.println(obj.getRateOfInterest());
      
      Bank obj1=new SBI();
      System.out.println(obj1.getRateOfInterest());
     }


  }