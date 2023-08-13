package QIAtividadeintegradoraservicosweb.QI_IntegradoraWS.DTO;

import QIAtividadeintegradoraservicosweb.QI_IntegradoraWS.Service.AlunoService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Aluno_dto {
    private int id;
    private String nome;
    private String email;
    private int ciclo;
    private int idade;

    @Deprecated
    public Aluno_dto(){}

    //construtor com parâmetros
    public Aluno_dto(int _id, String _nome, String _email, int _ciclo, int _idade){
        super();
        id = _id;
        nome = _nome;
        email = _email;
        ciclo = _ciclo;
        idade = _idade;
    }

    //Getters
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public int getCiclo() {
        return ciclo;
    }
    public int getIdade() {
        return idade;
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }


    @Override
    public String toString(){
        return "Identificação: " + id +
                "Nome: " + nome +
                "Email: " + email +
                "Ciclo: " + ciclo +
                "Idade: " + idade;
    }

}
