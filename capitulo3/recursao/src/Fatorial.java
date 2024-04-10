public class Fatorial {
    public static void main(String[] args) {
        int numero = 5;
        int fatorial = calculaFatorial(numero);
        System.out.printf("O fatorial de %d é %d", numero, fatorial);
    }
    public static int calculaFatorial(int numero){
        return numero == 1 ? 1 : numero * calculaFatorial(numero - 1);
    }
}
