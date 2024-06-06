/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoa;

/**
 *
 * @author wande
 */
public class Exercicio {
    
    public static void main(String[] args) {
        //Instanciando as classes
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        //Criando os objetos
        p[0] = new Pessoa("Laios","Masculino", 25);
        p[1] = new Pessoa("Falin","Feminino",23);
        l[0] = new Livro("As cronicas do vento uivante", "George K.", 355, p[0]);
        l[1] = new Livro("As cronicas da meia noite", "George K.", 400, p[1]);
        l[2] = new Livro("As cronicas da tormenta", "George K.", 375, p[0]);
        
        
        //Chamando metodos
        for(int i = 0; i < 100  ; i++){
           p[0].fazerAniversario(); 
        }
        
        l[0].abrir();
        l[0].fechar();
        l[0].avancarPag();
        p[0].status();
                      
        //l[0].detalhes();
    }
}
