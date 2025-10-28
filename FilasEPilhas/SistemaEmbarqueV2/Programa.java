package FilasEPilhas.SistemaEmbarqueV2;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
public class Programa {
    public static void main(String[] args) {
        Queue<Pessoa> filaDeEntrada = new ArrayDeque<>();
        Deque<Pessoa> areaDeEmbarque = new ArrayDeque<>();
        filaDeEntrada.add(new Pessoa("Ana"));
        filaDeEntrada.add(new Pessoa("Bruno"));
        filaDeEntrada.add(new Pessoa("Carla"));
        filaDeEntrada.add(new Pessoa("Daniel"));
        filaDeEntrada.add(new Pessoa("Eva"));
        filaDeEntrada.add(new Pessoa("Fabio"));
        filaDeEntrada.add(new Pessoa("Gisele"));
        filaDeEntrada.add(new Pessoa("Hugo"));
        filaDeEntrada.add(new Pessoa("Isabela"));
        filaDeEntrada.add(new Pessoa("João"));
        filaDeEntrada.add(new Pessoa("Karina"));
        filaDeEntrada.add(new Pessoa("Lucas"));
        filaDeEntrada.add(new Pessoa("Mariana"));



        while(!filaDeEntrada.isEmpty()){
            for (int i = 0; i < 4 && !filaDeEntrada.isEmpty(); i++) {
                
                Pessoa p = filaDeEntrada.poll();
                areaDeEmbarque.push(p);
                System.out.println();                               
            }
            
            System.out.println("Pessoas na pilha de embarque:");
            for (Pessoa p : areaDeEmbarque) {
                System.out.println(p.getNome());
            }
            if(filaDeEntrada.isEmpty()){
                System.out.println("Nenhuma pessoa restante na fila.");
            }
            else{
                System.out.println("\nPessoas restantes na fila de entrada:");
                for (Pessoa p : filaDeEntrada) {
                    System.out.println(p.getNome());
                }
            }
            
            for (int i = 0; i < 4 && !areaDeEmbarque.isEmpty(); i++){
                areaDeEmbarque.pop();
                
            }
            
        }
    }
}