

package prueba;

public class Main {

    public static void main(String[] args) {
            char[] vocales = {'a', 'e', 'i', 'o', 'u'};
            StringBuilder creaPalabra = new StringBuilder(8);
            for (int i = 0; i < 5; i++) {
            char letra = vocales[(int)(Math.random()*5)];
            creaPalabra.append(letra);
        }
            System.out.println(creaPalabra);
            
                String[] clientes = new String[(int)(Math.random()*100)];
                for (int i = 0; i < clientes.length; i++) {
                    clientes[i] = creaPalabra.toString();
                    System.out.println(clientes[i]);
         }
    }
    

}
