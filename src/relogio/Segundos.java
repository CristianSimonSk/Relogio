package relogio;
import java.util.TimerTask;
import java.util.Timer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Segundos {

	int segundos = 0;

	public Segundos(){
            int intervalo = 1000;

            TimerTask task = new TimerTask(){
                public void run(){
                    segundos++;
                }
            };

            Timer timer = new Timer();
            timer.schedule(task, 0, intervalo);

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str = "";

            try{
                str = br.readLine();
            }catch (IOException e){
                e.printStackTrace();
            }
    
            timer.cancel();
	}
}
