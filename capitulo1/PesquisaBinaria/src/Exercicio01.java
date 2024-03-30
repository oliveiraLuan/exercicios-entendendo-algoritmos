public class Exercicio01 {
    public static void main(String[] args) {
        Integer[] numeros = {1,2,3,4,5,6,7,8,9,10};
        Integer posicao = pesquisaBinaria(numeros, 8);
        System.out.println("Posição pesquisa binária: " + posicao);
    }

    public static Integer pesquisaBinaria(Integer[] lista, Integer numeroBuscado){
        Integer baixo = 0;
        Integer alto = lista.length - 1;

        Integer meio = lista.length / 2;
        Integer chute = meio;

        while (chute <= numeroBuscado){
            if(chute == numeroBuscado){
                return lista[chute];
            }

            if(chute > numeroBuscado){
                chute = chute - 1;
            } else {
                chute = chute + 1;
            }
        }
        return null;
    }
}