package com.consultorio.galassini.repository.projection;

import com.consultorio.galassini.domain.Especialidade;
import com.consultorio.galassini.domain.Medico;
import com.consultorio.galassini.domain.Paciente;

public interface HistoricoPaciente {

	Long getId();
	
	Paciente getPaciente();
	
	String getDataConsulta();
	
	Medico getMedico();
	
	Especialidade getEspecialidade();
}
