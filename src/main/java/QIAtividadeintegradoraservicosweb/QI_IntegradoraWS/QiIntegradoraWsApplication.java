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

	}

}
