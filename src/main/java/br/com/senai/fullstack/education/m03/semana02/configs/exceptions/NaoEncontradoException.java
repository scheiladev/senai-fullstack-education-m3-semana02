package br.com.senai.fullstack.education.m03.semana02.configs.exceptions;

public class NaoEncontradoException extends RuntimeException {
    public NaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}
