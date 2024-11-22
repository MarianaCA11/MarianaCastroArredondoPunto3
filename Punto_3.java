import java.util.Scanner;
import java.util.Stack;

public class Punto_3 {
Scanner sc = new Scanner(System.in);

 public Stack<Integer> llenarpila(){
    Stack<Integer> pila = new Stack<>();
    int condicion= 0;
    int num=0;
    do {
        System.out.println("Valor a ingresar");
        num=sc.nextInt();
        pila.push(num);
        System.out.println("desea ingresar mas registros 1: no; 2:si");
        condicion=sc.nextInt();
    } while (condicion !=1);

    return pila;
 }

 public void Mostrarpila(Stack<Integer> pila) {
    System.out.println(pila);
    System.out.println(" ");
}

    public Stack<Integer> verificarpila(Stack<Integer> pila) {
        Stack<Integer> pilaverificada = new Stack<>();
        Stack<Integer>pila2 = new Stack<>();
        Punto_3 p = new Punto_3();
        if (pila.isEmpty()) {
            p.llenarpila();
        }

        while (!pila.isEmpty()) {
            int elemento = pila.pop();
            if (elemento < 0) {
                elemento = 0;
            } else if (elemento >= 8 && elemento <= 20) {
                elemento = 50;
            } else if (elemento > 60 && elemento < 62) {
                elemento = 100;
            }        
            pila2.push((int) Math.sqrt(elemento));
        }

        while (!pila2.isEmpty()) {
            pilaverificada.push(pila2.pop());
        }

        return pilaverificada;
    }
 
}


