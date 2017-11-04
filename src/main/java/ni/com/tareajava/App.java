package ni.com.tareajava;

/**
 * Hello world!
 *
 */
public class App 
{
    private String[] iniciales = {"O","E","P","M"};
    public static void main( String[] args )
    {
        App cApp = new App();

        cApp.revertirAregglo();

        //System.out.println( "Hello World!" );
    }

    private void revertirAregglo(){
       String[] nuevoIniciales= new String[this.iniciales.length];
       Integer conteo = 0;

        for (int x=iniciales.length-1;x>=0;x--){
            nuevoIniciales[conteo]=iniciales[x];
            conteo++;
        }

        for(int x=0;x<=nuevoIniciales.length-1;x++){
            System.out.println(nuevoIniciales[x]);
        }

    }
}
