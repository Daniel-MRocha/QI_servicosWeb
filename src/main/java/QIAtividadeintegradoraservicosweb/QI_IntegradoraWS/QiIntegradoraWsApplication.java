package QIAtividadeintegradoraservicosweb.QI_IntegradoraWS;

import QIAtividadeintegradoraservicosweb.QI_IntegradoraWS.DTO.Aluno_dto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class QiIntegradoraWsApplication {

	public static void main(String[] args) {

		SpringApplication.run(QiIntegradoraWsApplication.class, args);
		Aluno_dto aluno = new Aluno_dto(1,"daniel","Dani@hotmail.com",3,44);
		System.out.println(aluno.toString());
	}

}
