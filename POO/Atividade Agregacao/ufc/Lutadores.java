/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufc;

public class Lutadores {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private int peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Metodos Especiais
    public Lutadores(String nome, String nacionalidade, int id, double altura,
                                int peso, int vitoria, int derrota, int empate){
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(id);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitoria);
        this.setDerrotas(derrota);
        this.setEmpates(empate);
        
    }
    
    public void apresentar(){
        
        System.out.print("Apresentando " + getNome());
        System.out.println(", diretamente do " + getNacionalidade());
        System.out.print("Com " + getIdade() +" anos, " + this.getAltura() + "m de altura e ");
        System.out.println("pesando "+ getPeso()+ " kgs");
        System.out.println("com incrivel cartel de " + getVitorias() + "-" + getDerrotas() + "-" + getEmpates());
        System.out.println("----------------------------------");                        
    }
        
    
    public void status(){
        System.out.print(getNome());
        System.out.println(" e um " + getCategoria());
        System.out.println("com cartel de " + getVitorias() + "-" + getDerrotas() + "-" + getEmpates());
        
        
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    
    //Metodos Getters

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public int getPeso() {
        return peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }
    
    //Metodos Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(int peso) {
        this.peso = peso;
        this.setCategoria();
    }

    private void setCategoria() {
         if (this.getPeso() < 52){
            this.categoria = "Desqualificado!";
        } else if (getPeso() < 75) {
            this.categoria = "Peso Leve";
        } else if (getPeso() < 85) {
            this.categoria = "Peso Medio";
        } else if (this.getPeso() <= 120){
            this.categoria = "Peso Pesado";
        }else {
            this.categoria = "Desqualificado!";
        }
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
}
