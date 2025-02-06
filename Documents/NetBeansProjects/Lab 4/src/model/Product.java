/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
/**
 *
 * @author 影子
 */
public class Product {
    
    private String name;
    private int price;
    private int id;
    
    private ArrayList<Feature>feature;
    
    private static int count = 0;
    
    public Product(){
        count++;
        id = count;
        
        feature = new ArrayList<Feature>();
    }
    
    public String getName(){
    
}
