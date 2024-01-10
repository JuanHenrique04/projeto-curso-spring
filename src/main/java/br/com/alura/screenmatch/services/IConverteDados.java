package br.com.alura.screenmatch.services;

public interface IConverteDados {

//    <T>Generic é uma sintaxe para definir o que será um tipo genérico, ou seja, pode ser qualquer tipo.
    <T> T obterDados(String json, Class<T> tClass);
}
