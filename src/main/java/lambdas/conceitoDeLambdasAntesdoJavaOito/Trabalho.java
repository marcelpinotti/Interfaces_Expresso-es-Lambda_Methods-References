package lambdas.conceitoDeLambdasAntesdoJavaOito;

public class Trabalho implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println("Trabalho 1");
            try {
                Thread.sleep(100);
            }catch (Exception e){
            }
        }
    }
}
