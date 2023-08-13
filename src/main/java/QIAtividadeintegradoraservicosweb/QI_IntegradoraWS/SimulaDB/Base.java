package QIAtividadeintegradoraservicosweb.QI_IntegradoraWS.SimulaDB;

import QIAtividadeintegradoraservicosweb.QI_IntegradoraWS.DTO.Aluno_dto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Base {

    private ArrayList<Aluno_dto> alunos;

    public void setAluno(ArrayList<Aluno_dto> aln){
        alunos = aln;
    }

    public ArrayList<Aluno_dto> getAlunos(){
        return alunos;
    }
}
