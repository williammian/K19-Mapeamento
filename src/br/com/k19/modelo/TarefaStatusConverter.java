package br.com.k19.modelo;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class TarefaStatusConverter implements AttributeConverter<TarefaStatus, String>{

	@Override
	public String convertToDatabaseColumn(TarefaStatus attribute) {
		switch(attribute){
			case ABERTA:
				return "A";
			case DESENVOLVIDA:
				return "D";
			case TESTADA:
				return "T";
			case HOMOLOGADA:
				return "H";
			default:
				throw new IllegalArgumentException("Valor desconhecido: " + attribute);
		}
	}

	@Override
	public TarefaStatus convertToEntityAttribute(String dbData) {
		switch (dbData) {
			case "A":
				return TarefaStatus.ABERTA;
			case "D":
				return TarefaStatus.DESENVOLVIDA;
			case "T":
				return TarefaStatus.TESTADA;
			case "H":
				return TarefaStatus.HOMOLOGADA;
			default:
				throw new IllegalArgumentException("Valor desconhecido: " + dbData);
		}
	}
	
	

}
