import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class Datas{
    private int dia;
    private int mes;
    private int ano;
    public Datas(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public void setDia(int dia){
        this.dia = dia;
    }
    public int getDia() {
        return this.dia;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public int getMes() {
        return this.mes;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public int getAno() {
        return this.ano;
    }
    public void avancar(){
        if(this.dia<31){
            this.dia++;
        }else{
            this.mes++;
            this.dia = 1;
            if(this.mes == 13){
                this.mes = 1;
                this.ano++;
            }
        }
    }
    public Datas(){
        DateFormat d1 = new SimpleDateFormat("dd");
        DateFormat d2 = new SimpleDateFormat("MM");
        DateFormat d3 = new SimpleDateFormat("yyyy");
        dia = Integer.parseInt(d1.format(new Date()));
        mes = Integer.parseInt(d2.format(new Date()));
        ano = Integer.parseInt(d3.format(new Date()));

    }
    public String toString(){
        String texto = dia +"/" + mes +"/" + ano;
        return texto;
    }
}
