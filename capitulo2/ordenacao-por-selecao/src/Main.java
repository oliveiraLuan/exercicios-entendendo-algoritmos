import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(Arrays.asList(5,3,6,2,10));
        System.out.println(ordenarPorSelecao(numeros));
    }

    public static List<Integer> ordenarPorSelecao(List<Integer> lista){
        List<Integer> listaOrdenada = new ArrayList<>();

        int tamanhoDaLista = lista.size();

        for(int i = 0; i < tamanhoDaLista; i++){
            Integer menorIndice = buscarMenor(lista);
            listaOrdenada.add(lista.get(menorIndice));
            lista.remove(menorIndice.intValue());
        }

        return listaOrdenada;
    }

    private static Integer buscarMenor(List<Integer> lista) {
        int menor = lista.get(0);
        int menorIndice = 0;

        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i) < menor){
                menor = lista.get(i);
                menorIndice = i;
            }
        }
        return menorIndice;
    }
}