import java.util.Stack;
public class Principal {
    // Mariana Castro Arredondo 
    // Grupo de la mañana 
    // Punto 3
    public static void main(String[] args) {
        
        Punto_3 punto3 = new Punto_3();
        Stack<Integer>pila1= punto3.llenarpila();
        System.out.println("Pila original");
        punto3.Mostrarpila(pila1);
        Stack<Integer>pilaverificada=punto3.verificarpila(pila1);
        System.out.println("pila con los cambios");
        punto3.Mostrarpila(pilaverificada);
        
    
    }
}
