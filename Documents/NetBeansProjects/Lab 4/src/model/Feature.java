/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 影子
 */
public class Feature {
    private Product owner;
    private String name;
    private object value;
    
    public Feature(Product owner){
        this.owner = owner;
    }
    
    public Feature(Product owner,String name,Object value){
        
        this name = name;
        this.value = value;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public object getValue(){
        return value;
    }
    
    public void setValue(object value){
        this.value = value;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    
}
