public class ContadorParImpar {
    public static void main(String[] args) {
        for(int i = 1; i <= 20; i++) {
            if(i % 2 == 0) {
                System.out.println("O número " + i + " é par");
            } else {
                System.out.println("O número " + i + " é ímpar");
            }
        }
    }
}
