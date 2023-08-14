package QIAtividadeintegradoraservicosweb.QI_IntegradoraWS.Service;

import QIAtividadeintegradoraservicosweb.QI_IntegradoraWS.DTO.Aluno_dto;
import QIAtividadeintegradoraservicosweb.QI_IntegradoraWS.SimulaDB.Base;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;


@Service
public class AlunoService {

    @Autowired
    private Base simulador_DB;

    @PostConstruct
    public void seed(){
        ArrayList<Aluno_dto> seed_alunos = new ArrayList<>();
        seed_alunos.add(new Aluno_dto(1,"Popeye","Pop@hotmail.com",3,62));
        seed_alunos.add(new Aluno_dto(2,"Papaleguas","PapL@warner.com",1,12));
        seed_alunos.add(new Aluno_dto(3,"Ophenheiner","Bomba@hotmail.com",7,65));
        seed_alunos.add(new Aluno_dto(4,"SuperMario","UP@pop.com",5,30));
        seed_alunos.add(new Aluno_dto(5,"Rick","cavernadodragao@hotmail.com",4,19));
        seed_alunos.add(new Aluno_dto(6,"Alice","paisdasmaravilhas@ig.com",5,17));
        seed_alunos.add(new Aluno_dto(7,"Patrick","fendadobikini@hotmail.com",4,8));
        seed_alunos.add(new Aluno_dto(8,"Aladin","Saara@hotmail.com",2,23));
        seed_alunos.add(new Aluno_dto(9,"Vanesa da Mata","aiaiaiaiaiaiai@hotmail.com",1,37));
        seed_alunos.add(new Aluno_dto(10,"Roberval","tvcolosso@gmail.com",3,62));

        simulador_DB.setAluno(seed_alunos);
    }

    public ArrayList<Aluno_dto> Todos_alunos(){
        return simulador_DB.getAlunos();
    }

    public Optional<Aluno_dto> aluno_especifico(Integer indice){
        var aluno = simulador_DB.getAlunos().stream()
                .filter(s-> s.getId() == indice ).findAny();
        return aluno;
    }

public void atualiza_base(ArrayList<Aluno_dto> lst){
        simulador_DB.setAluno(lst);
}
}
