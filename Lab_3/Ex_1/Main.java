import java.io.*;

public class Main {
    public static void main(String argv[]){
        try {
            /* Scanner instantiation */
            scanner l = new scanner(new FileReader(argv[0]));
            /* Parser instantiation */
            parser p = new parser(l);
            /* Run the parser */
            Object result = p.parse().value;      
          } catch (NullPointerException e){
                  System.err.println("Syntax error");
          } catch (FileNotFoundException e){
                  System.err.println("Errore opening file " + argv[0]);
          } catch (Exception e){
                  e.printStackTrace();
          }
    }
}


