/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.ImageIcon;

/**
 *
 * @author 影子
 */
public class assignment2 {
    
private String supplyName;
    private ProductCatalog productCatalog;
    private ImageIcon logoImage;
    
    public ImageIcon getLogoImage(){
        this.logoImage=logoImage;
    }
    
    public Supplier(){
        productCatalog =  new ProductCatalog();
    }
    
    public String getSupplyName(){
        return supplyName;
}
