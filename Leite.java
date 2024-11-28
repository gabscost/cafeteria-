/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dotcom.cafeteria;

/**
 *
 * @author Gabriel
 */
public class Leite extends CafeDecorator{
    public Leite(Cafe cafe){
        super(cafe);
    }
      @Override
    public String getDescricao() {
      return  cafe.getDescricao() + ", Leite";
    }

    @Override
    public double calCusto() {
       return  cafe.calCusto() + 2.5;
    }
}
