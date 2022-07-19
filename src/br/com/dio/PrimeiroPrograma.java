package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livros livro1 = new Livros("O problema dos 3 corpos", 300);
        System.out.println(livro1);

        /* int a = 5;
        int b = 3;
        System.out.println("Hello World! " + (a+b));*/
    }
}

class Livros{
    private String nome;
    private Integer npags;

    public Livros(String nome, Integer npags){
        this.nome = nome;
        this.npags =  npags;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNpags() {
        return npags;
    }

    public void setNpags(Integer npags) {
        this.npags = npags;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "nome: '" + nome + '\'' +
                ", npags =" + npags +
                '}';
    }
}