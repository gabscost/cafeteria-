/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dotcom.cafeteria;

/**
 *
 * @author Gabriel
 */
public class Chocolate extends CafeDecorator {
    public Chocolate(Cafe cafe){
        super(cafe);
    }
      @Override
    public String getDescricao() {
      return  cafe.getDescricao() + ", chocolate";
    }

    @Override
    public double calCusto() {
       return  cafe.calCusto() + 3.95;
    }
}
