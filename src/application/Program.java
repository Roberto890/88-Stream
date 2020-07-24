package application;

import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;

public class Program {

    public static void main(final String[] args) {

        List<Integer> list = Arrays.asList(3,4,5,10,7);
        
        //passa a lista para stream
        //Stream<Integer> st1 = list.stream();

        //usando o map pra aplicar uma funcao a cada elemento da stream
        Stream<Integer> st1 = list.stream().map(x -> x *10);
        //imprimir a stream usa toArray
        System.out.println(Arrays.toString(st1.toArray()));

        //cria a stream e coloca os elementos manual usa Stream.of
        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(st2.toArray()));

        //cria uma stream a partir do primeiro elemento(usa uma funcao p/ repetir infinitamente) usa Stream.iterate
        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
        //ja que st3 é infinito usa o limit para pegar X elementos passados usa limit(X)
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

        //Cria uma stream (ta usando o fibonacci) mas no iterate
        Stream<Long> st4 = Stream.iterate(new Long[]{0L, 1L}, x -> new Long[]{x[1],x[0]+x[1]}).map(x -> x[0]);
        System.out.println(Arrays.toString(st4.limit(10000).toArray()));
    }
}