package QIAtividadeintegradoraservicosweb.QI_IntegradoraWS.Controler;

import QIAtividadeintegradoraservicosweb.QI_IntegradoraWS.DTO.Aluno_dto;
import QIAtividadeintegradoraservicosweb.QI_IntegradoraWS.Service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "/alunos/{numero}")
    public void aluno_delete(@PathVariable Integer numero){
        ArrayList<Aluno_dto> lista_aux = aluno_service.Todos_alunos();
        var aluno = lista_aux.stream().filter(aln -> aln.getId()==numero).findAny().isPresent();
        if(aluno){
            var aluno_para_deletar = lista_aux.stream().filter(aln -> aln.getId()==numero).findAny().get();
            var indice_do_aluno = lista_aux.indexOf(aluno_para_deletar);
            lista_aux.remove(indice_do_aluno);
            System.out.println("apos remoção do indice:" + numero);
            lista_aux.stream().forEach(s-> System.out.println(s.toString()));
            aluno_service.atualiza_base(lista_aux);
            System.out.println("Removeu");
            aluno_service.Todos_alunos().stream().forEach(s-> System.out.println(s.toString()));
        }else {
            System.out.println("Aluno inexistente");
        }
            }
}
