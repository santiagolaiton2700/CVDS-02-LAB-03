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
    
    @Test
    public void deberiaSerValidoEdadMayorMenorEdad() {
        Assert.assertEquals(1000.0, (cal.calculoTarifa(1000,0,19)),0.0);
    }
    @Test
    public void deberiaSerValidoEdadMayorLimite() {
        Assert.assertEquals(920.0, (cal.calculoTarifa(1000,0,165)),0.0);
    }
    @Test
    public void deberiaSerValidoEdadMayor() {
        Assert.assertEquals(1000.0, (cal.calculoTarifa(1000,0,65)),0.0);
    }
    
    /**
     * No hay edad negativa. Deberia arrojar Execption
     **/
    @Test
    public void deberiaSerMenorValidoSingle() {
        Assert.assertNotEquals(1000.0, (cal.calculoTarifa(1000,0,-18)),0.0);
    }
    
    @Test
    public void deberiaSerMenorValido() {
        Assert.assertEquals(950.0, (cal.calculoTarifa(1000,0,17)),0.0);
    }
    @Test
    public void deberiaSerMayorValido() {
        Assert.assertEquals(1000.0, (cal.calculoTarifa(1000,0,19)),0.0);
    }
    @Test
    public void deberiaSerEdadValido() {
        Assert.assertEquals(1000.0, (cal.calculoTarifa(1000,0,18)),0.0);
    }
    @Test
    public void deberiaSerMenosDias() {
        Assert.assertEquals(950.0, (cal.calculoTarifa(1000,5,0)),0.0);
    }
    @Test
    public void deberiaSerMasDias() {
        Assert.assertEquals(800.0, (cal.calculoTarifa(1000,21,0)),0.0);
    }
    @Test
    public void deberiaSerEdadMayor65() {
        Assert.assertEquals(920.0, (cal.calculoTarifa(1000,12,66)),0.0);
    }
    @Test
    public void deberiaSerEdad65() {
        Assert.assertEquals(1000.0, (cal.calculoTarifa(1000,12,65)),0.0);
    }
    @Test
    public void deberiaSerDiferenteDias20() {
        Assert.assertNotEquals(920.0, (cal.calculoTarifa(1000,20,66)),0.0);
    }
    @Test
    public void deberiaServalidodiasantelacionyedadmenor() {
        Assert.assertEquals(770.0, (cal.calculoTarifa(1000,22,67)),0.0);
    }
    
    /**
    Nos damos cuenta que existe un error en la libreria, debido a que cuando los dias de Antelacion es 20
    no toma ningun caso referente a la edad
    **/
    @Test
    public void deberiaSerDiferenteDias20ymenor() {
        Assert.assertNotEquals(950.0, (cal.calculoTarifa(1000,20,16)),0.0);
    }
    
    @Test
    public void deberiaSerDiasMayor20() {
        Assert.assertEquals(850.0, (cal.calculoTarifa(1000,22,19)),0.0);
    }
    @Test
    public void deberiaSerinvalido() {
        Assert.assertNotEquals(0.0, (cal.calculoTarifa(1000,22,-1)),0.0);
    }
}