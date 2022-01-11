package com;

class BoxDemo
{
  float width;
  float height;
  float depth;
  float calcVol() {
    return width*height*depth;
  }
  }


public class Box{

  public static void main(String[] args) {
    
  
    BoxDemo b1=new BoxDemo();
    b1.width=3.4f;
    b1.height=2.2f;
    b1.depth=1.4f;
    float vol=b1.calcVol();
    System.out.println("Volume of b1 is "+vol);
    
    BoxDemo b2=new BoxDemo();
    b1.width=4.4f;
    b1.height=3.3f;
    b1.depth=2.4f;
    vol=b2.calcVol();
    System.out.println("Volume of b2 is "+vol);
  }
    

  }