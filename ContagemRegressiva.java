public class ContagemRegressiva {
    public static void main(String[] args) {
        int inicio = 10;
        while (inicio >= 1) {
            System.out.println(inicio);
            esperarUmSegundo();
            inicio--;
        }
        

    
    }
    private static void esperarUmSegundo() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    
}
