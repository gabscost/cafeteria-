/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dotcom.cafeteria;

/**
 *
 * @author Gabriel
 */
public class Cafeteria {

    public static void main(String[] args) {
        Cafe pedido1 =  new Decaf();
        Cafe descafe1 = new Canela(new Leite(pedido1));
        
        System.out.println("Pedido 1: " + descafe1.getDescricao());
        System.out.println("Preco: "+ descafe1.calCusto());
        
        
        Cafe pedido2 =  new Expresso();
        Cafe express1 = new Canela(new Leite(new Chocolate(pedido2)));
        
        System.out.println("Pedido 2: " + express1.getDescricao());
        System.out.println("Preco: "+ express1.calCusto());
    }
}
