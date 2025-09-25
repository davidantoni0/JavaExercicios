public class MediaDeNotas {
    public static void main(String[] args) {
        double soma = 0;
        final int TOTALNOTAS = 5;
        double[] notas = {5.0, -8.0, 5.0, 12.0, 5.0};
        for(int i = 0; i < TOTALNOTAS; i++){
            if(notas[i] >= 0 && notas[i] <= 10){
                soma += notas[i];
            } else {
                continue;
            }
        }
        System.out.println("A média das notas válidas é: " + (soma / TOTALNOTAS));
    }
}
