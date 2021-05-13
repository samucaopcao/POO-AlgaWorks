package com.algaworks.curso.fjoo.desafiodatas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalculadoraGravidez {

	private Date dataUltimoPeriodoMenstrual;

	public CalculadoraGravidez(Date dataUltimoPeriodoMenstrual) {
		this.dataUltimoPeriodoMenstrual = dataUltimoPeriodoMenstrual;
	}

	private Calendar converterDateParaCalendar(Date data) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(data);
		return calendar;
	}

	public Date calcularDataEstimadaConcepcao() {
		// implementar cálculo de data estimada da concepção
		// 2 semanas após a data do último período menstrual
		Calendar calend = new GregorianCalendar();
	    calend = converterDateParaCalendar(dataUltimoPeriodoMenstrual);
		calend.add(Calendar.WEEK_OF_YEAR, 2);
		
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		return calend.getTime();		
	}

	public Date calcularDataEstimadaParto() {
		// implementar cálculo de data estimada para parto
		// 40 semanas após a data do último período menstrual
		Calendar calend = new GregorianCalendar();
	    calend = converterDateParaCalendar(dataUltimoPeriodoMenstrual);
		calend.add(Calendar.WEEK_OF_YEAR, 40);
		
		return calend.getTime();
	}

}