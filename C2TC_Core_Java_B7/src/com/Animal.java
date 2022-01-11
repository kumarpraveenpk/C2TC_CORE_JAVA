package com;

class Animal
{
  int legs;
  String name;
  String color;
  
  public Animal()
  {
    System.out.println("This is a default constructor");
  }
  
  public Animal(int legs, String name, String color) {
    
    this.legs = legs;
    this.name = name;
    this.color = color;
  }
  
  public Animal(String name, String color) {
    
    this.name = name;
    this.color = color;
  }

  public Animal(String name) {
    
    this.name = name;
  }
  
  void display()
  {
    System.out.println("Animal Description:");
    System.out.println(color+" "+ "color"+name+" "+"with"+" "+" "+legs+" "+"legs");
  
  }
  
  
  
}