package br.com.alura.escola.academico.dominio.aluno.exceptions;

public class MaxNumberOfPhonesReachedException extends IllegalArgumentException {
    public MaxNumberOfPhonesReachedException() {
        super("Número máximo de telefones já atingido!");
    }
}
