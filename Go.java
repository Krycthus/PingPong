/**
 * Created by barabepierre on 10/01/2017.
 */
public class Go{

    public static void main(String[] args){

        Ping p1 = new Ping();
        Pong p2 = new Pong();

        Thread t = new Thread(p1);
        Thread t2 = new Thread(p2);

        t.start();
        t2.start();

    }
}
