
package relogio;

public class Horario {
    private int horas;
    private int minutos;
    
    
    
    public Horario(){
        horas = 0;
        minutos = 0;
        new mainPage(horas,minutos);    
    }
    
    public Horario(int horasP,int minutosP){
        horas = horasP;
        minutos = minutosP;
        new Segundos();
        incrementaTimer();   
    }
    
    public void incrementaTimer(){
        minutos = incremento(minutos);
        if(minutos == 60){
            if(horas == 24){
                horas = 0;
                minutos = 0;
            }else{
                horas = incremento(horas);
                minutos = 0;
            }
        }
        new mainPage(horas,minutos);
    }
    
    public String getValorVisor(int valor){    
        if(valor < 10){
            return "0" + valor;
        }
        else{
            return "" + valor;
        }
    }
    
    public int incremento(int valor){
        return valor + 1;
    }
}
