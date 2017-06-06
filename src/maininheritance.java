/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;
import java.util.*;
public class Inheritance{
    private String name;
    private double gajipokok = 25000000;
    private double bonus;
    private int masakerja;
    
    public Inheritance (String name,double gajipokok,double bonus,int masakerja){
    this.name = name;
    this.gajipokok = gajipokok;
}
public String getname(){
    return name;
}    
public double gajipokok(){
    return gajipokok;
}
public double bonus(){
    return bonus;
}
public double totalgaji(){
    return gajipokok + bonus;
}
}

