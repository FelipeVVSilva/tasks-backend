package br.ce.wcaquino.taskbackend.utils;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;



public class DateUtilsTest {
	
	@Test
	public void deveRetornarTrueParaDatasFuturas() {
		
		LocalDate data = LocalDate.of(2023, 5, 19);
		Assert.assertTrue(DateUtils.isEqualOrFutureDate(data));
		System.out.println(DateUtils.isEqualOrFutureDate(data));
		
	}
	
	@Test
	public void deveRetornarTrueParaDataPresente() {
		
		LocalDate data = LocalDate.now();
		Assert.assertTrue(DateUtils.isEqualOrFutureDate(data));
		System.out.println(DateUtils.isEqualOrFutureDate(data));
		
	}
	
	@Test
	public void deveRetornarFalseParaDatasPassadas() {
		
		LocalDate data = LocalDate.of(2022, 5, 19);
		Assert.assertFalse(DateUtils.isEqualOrFutureDate(data));
		System.out.println(DateUtils.isEqualOrFutureDate(data));
		
	}
}
