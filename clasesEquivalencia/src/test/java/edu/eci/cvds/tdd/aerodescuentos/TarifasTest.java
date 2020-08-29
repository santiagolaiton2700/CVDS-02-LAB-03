package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Test;

import org.junit.Assert;
import org.junit.Test;

public class TarifasTest {
    private CalculadorDescuentos cal = new CalculadorDescuentos();

    /**
    @param tarifaBase valor base del vuelo
    @param diasAntelacion dias de antelación del vuelo
    @param edad - edad del pasajero
    @throws ExcepcionParametrosInvalidos [XXXXXXXXXXXXXXXXXXXXXXXXXXX]
    **/
    /**
     * Aplica descuento 
     **/
    @Test
    public void deberiaSerValidoEdadMenorEdad() {
        Assert.assertEquals(475000.0, (cal.calculoTarifa(500000,10,6)),0.0);
    }
    @Test
    public void deberiaSerValidoEdadMayor() {
        Assert.assertEquals(460000.0, (cal.calculoTarifa(500000,10,70)),0.0);
    }
    @Test
    public void deberiaSerValidoEdadValidaSinDescuento() {
        Assert.assertEquals(500000.0, (cal.calculoTarifa(500000,10,25)),0.0);
    }
    
    /**
     * Edad negativa deberia arrojar Execption
     **/
    @Test
    public void deberiaSerEdadPositiva() {
        Assert.assertNotEquals(1000.0, (cal.calculoTarifa(1000,10,-18)),0.0);
    }
    
	
    /**
     * Los días de antelacion no deben ser negativos deberia arrojar Execption
     **/
    @Test
    public void deberiaSerDiasValidos() {
        Assert.assertEquals(1000.0, (cal.calculoTarifa(1000,-4,25)),0.0);
    }
	/**
     * Los días de antelacion no alcanzan para descuento
     **/
    @Test
    public void deberiaTenerMasDias() {
        Assert.assertEquals(1000.0, (cal.calculoTarifa(1000,10,25)),0.0);
    }
	/**
     * Los días de antelacion aplican para descuento
     **/
    @Test
    public void deberiaTenerDescuentoDias() {
        Assert.assertEquals(425000.0, (cal.calculoTarifa(500000,30,25)),0.0);
    }

	
	/**
     * La tarifa no tiene descuento
     **/
    @Test
    public void deberiaNoTenerDescuento() {
        Assert.assertEquals(1000.0, (cal.calculoTarifa(1000,10,25)),0.0);
    }
}    
    