/**
 * Created by barabepierre on 10/01/2017.
 */
public class Ping implements Runnable{

    String message = " Ping ";
    public void run(){
        while (true){

            try{
                int tempo = (int)(Math.random()*100);
                System.out.println(message + " " +tempo);
                Thread.sleep(tempo);
            }
            catch(Exception e){
                System.out.println(" ERREUR !");
            }

        }

    }

}
