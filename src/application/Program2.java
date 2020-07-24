package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program2 {

     public static void main(final String[] args) {

        List<Integer> list = Arrays.asList(3,4,5,10,7);
        
        //EXEMPLO PIPELINE

        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        //reduce - pega um elemento inicial(no caso zero mas se fosse multiplicar teria que ser 1) 
        //e depois uma funcao que tem 2 argumentos e gera um resultado(nesse caso a soma)
        //soma toda a stream
        int sum = list.stream().reduce(0, (x,y) -> x + y);
        System.out.println("Sum = " + sum);


        //o filter cria uma nova stream contendo apenas o que satisfazer o predicado adicionado
        //nesse caso pegando todos os elementos pares
        //depois multiplicando cada valor por 10 usando o map
        //e depois usando o collect(collectors.tolist) para transformar em uma lista 
        List<Integer> newList = list.stream()
                                .filter(x -> x % 2 == 0)
                                .map(x -> x * 10)
                                .collect(Collectors.toList());
        
        //DA PRA USAR toArray na list tambem
        System.out.println(Arrays.toString(newList.toArray()));
    }
}