
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASES;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

/**
 *
 * @author Propietario
 */
public class Concepto {
    
    private String concepto;
    private String mes;
    private float monto;
    private String nivelConcepto;
    private String gradoConcepto;
    private int IdDeuda;
    protected static int correlativo=1;
    private float importe;

    public Concepto(){  }

    public Concepto(String concepto, String mes, float monto, String nivelConcepto, String gradoConcepto,int IdDeuda) {
        this.concepto = concepto;
        this.mes = mes;
        this.monto = monto;
        this.nivelConcepto = nivelConcepto;
        this.gradoConcepto = gradoConcepto;
        this.IdDeuda = IdDeuda;
        correlativo++;
    }
    
    public static int getContador(){
        return correlativo;
    }
    
    public String CorrelativoPagoBoleta(){
        Formatter obja = new Formatter();
        String numeroCerosa = String.valueOf(obja.format("%04d", getContador()));
        return ("B001-"+numeroCerosa);
    }
    
    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getNivelConcepto() {
        return nivelConcepto;
    }

    public void setNivelConcepto(String nivelConcepto) {
        this.nivelConcepto = nivelConcepto;
    }

    public String getGradoConcepto() {
        return gradoConcepto;
    }

    public void setGradoConcepto(String gradoConcepto) {
        this.gradoConcepto = gradoConcepto;
    }

    public int getIdDeuda() {
        return IdDeuda;
    }

    public void setIdDeuda(int IdDeuda) {
        this.IdDeuda = IdDeuda;
    }
    
    public static String AñoActual(){
    Date fecha=new Date();
    SimpleDateFormat formatoFecha=new SimpleDateFormat("YYYY");
    return formatoFecha.format(fecha); 
}

    @Override
    public String toString() {
        return "\n\n "+concepto +" - "+ mes + " - "+AñoActual()+"          "
                + "                                                                    "
                + "                                         "
                + "                                                   "+
                "Importe: S/ "+monto+"\n";
    }
    
    public String MostrarInfo(){
        return "\n\n "+concepto +" - "+ mes + " - "+AñoActual()+
                "Importe: S/" + monto+"\n";
    }

}