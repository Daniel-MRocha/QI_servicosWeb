package QIAtividadeintegradoraservicosweb.QI_IntegradoraWS.Controler;

import QIAtividadeintegradoraservicosweb.QI_IntegradoraWS.DTO.Aluno_dto;
import QIAtividadeintegradoraservicosweb.QI_IntegradoraWS.Service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class AlunoControler {

    @Autowired
    private AlunoService aluno_service;


    @GetMapping(value = "/alunos")
    public ArrayList<Aluno_dto> listagem(){
        return aluno_service.Todos_alunos();
    }

    @GetMapping(value = "/alunos/{numero}")
    public Aluno_dto aluno_unico(@PathVariable("numero") Integer numero){
        var aluno = aluno_service.aluno_especifico(numero);
        if(aluno.isPresent()){
            return aluno.get();
        }
        return null;
    }

}
