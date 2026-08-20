/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        Goku goku = new Goku();
        Sonic sonic = new Sonic();
        Mario mario = new Mario();
        
        goku.setNome("Goku");
        goku.energia = 12000;
        goku.vida = 10000;
        
        sonic.setNome("Sonic");
        sonic.energia = 100;
        sonic.vida = 125;
        
        mario.setNome("Mario Bros");
        mario.energia = 200;
        mario.vida = 250;
        
        goku.apresentar();
        goku.atacar();
        
        sonic.apresentar();
        sonic.atacar();
        
        mario.apresentar();
        mario.atacar();
    }

}