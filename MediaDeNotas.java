public class MediaDeNotas {
    public static void main(String[] args) {
        double soma = 0;
        double[] notas = {7.5, -8.0, 6.5, 12.0, 5.5};
        for(double nota : notas){
            if(nota >= 0 && nota <= 10){
                soma += nota;
            } else {
                continue;
            }
        }
        System.out.println("A média das notas válidas é: " + (soma / notas.length));
    }
}
