/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Personagem {
    private String nome;
    int vida;
    int energia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public void apresentar(){
        System.out.println("Ola, sou " +nome+"!");
        
    }
    
    public void atacar(){
        System.out.println("Atacar!");
    }
}
