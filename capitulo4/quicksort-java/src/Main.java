import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List lista = Arrays.asList(33,15,10,25);
        List<Integer> ordenada = quickSort(lista);
        System.out.println("Lista ordenada" + ordenada);
    }

    public static List<Integer> quickSort(List<Integer> lista){
        if(lista.size() < 2){
            return lista;
        } else {
            Integer pivo = lista.get(0);

            List<Integer> menores = lista
                    .stream()
                    .skip(1)
                    .filter(numero -> numero <= pivo)
                    .collect(Collectors.toList());

            List<Integer> maiores = lista
                    .stream()
                    .skip(1)
                    .filter(numero -> numero > pivo)
                    .collect(Collectors.toList());

            return Stream.of(
                            quickSort(menores).stream(),
                            Stream.of(pivo),
                            quickSort(maiores).stream())
                            .flatMap(Function.identity())
                            .collect(Collectors.toList());
        }
    }
}