/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dotcom.cafeteria;

/**
 *
 * @author Gabriel
 */
public class Expresso implements Cafe{

    @Override
    public String getDescricao() {
     return " expresso" ;
    }

    @Override
    public double calCusto() {
       return 15.00;
    }
    
}