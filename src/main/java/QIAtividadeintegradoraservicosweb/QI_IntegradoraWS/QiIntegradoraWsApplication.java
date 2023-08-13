package QIAtividadeintegradoraservicosweb.QI_IntegradoraWS;

import QIAtividadeintegradoraservicosweb.QI_IntegradoraWS.Controler.AlunoControler;
import QIAtividadeintegradoraservicosweb.QI_IntegradoraWS.DTO.Aluno_dto;
import QIAtividadeintegradoraservicosweb.QI_IntegradoraWS.Service.AlunoService;
import QIAtividadeintegradoraservicosweb.QI_IntegradoraWS.SimulaDB.Base;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class QiIntegradoraWsApplication {

	public static void main(String[] args) {

		SpringApplication.run(QiIntegradoraWsApplication.class, args);

		ArrayList<Aluno_dto> Lista_de_alunos = new ArrayList<>();
		Lista_de_alunos.add(new Aluno_dto(1,"Popeye","Pop@hotmail.com",3,62));
		Lista_de_alunos.add(new Aluno_dto(2,"Papaleguas","PapL@warner.com",1,12));
		Lista_de_alunos.add(new Aluno_dto(3,"Ophenheiner","Bomba@hotmail.com",7,65));
		Lista_de_alunos.add(new Aluno_dto(4,"SuperMario","UP@pop.com",5,30));
		Lista_de_alunos.add(new Aluno_dto(5,"Rick","cavernadodragao@hotmail.com",4,19));
		Lista_de_alunos.add(new Aluno_dto(6,"Alice","paisdasmaravilhas@ig.com",5,17));
		Lista_de_alunos.add(new Aluno_dto(7,"Patrick","fendadobikini@hotmail.com",4,8));
		Lista_de_alunos.add(new Aluno_dto(8,"Aladin","Saara@hotmail.com",2,23));
		Lista_de_alunos.add(new Aluno_dto(9,"Vanesa da Mata","aiaiaiaiaiaiai@hotmail.com",1,37));
		Lista_de_alunos.add(new Aluno_dto(10,"Roberval","tvcolosso@gmail.com",3,62));



	}

}
