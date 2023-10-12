package br.com.alura.escola.academico.dominio.aluno;

import br.com.alura.escola.academico.dominio.aluno.exceptions.MaxNumberOfPhonesReachedException;
import br.com.alura.escola.shared.dominio.CPF;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void adicionarTelefoneVerificandoInvariantes() {
        Aluno aluno = new Aluno(
                new CPF("123.456.789-00"),
                "Fulano da Silva",
                new Email("rodrigo@rodrigo.com"));
        aluno.adicionarTelefone("11", "99999999");
        aluno.adicionarTelefone("12", "99999998");

        assertEquals(2, aluno.getTelefones().size());

        //Invariantes nada mais são do que regras de negócio que precisam ser verificadas para garantir sua consistência.
        try {
            aluno.adicionarTelefone("13", "99999997");
        } catch (MaxNumberOfPhonesReachedException e) {
            assertEquals("Número máximo de telefones já atingido!", e.getMessage());
        }
    }
}