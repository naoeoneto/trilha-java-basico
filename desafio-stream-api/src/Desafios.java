import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Desafios {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Desafio 1 - Mostre a lista na ordem numérica:
        // Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
        // numeros.stream().sorted().forEach(System.out::println);

        // Desafio 2 - Imprima a soma dos números pares da lista:
        // Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
        // List<Integer> numerosPares = numeros.stream().filter(n -> n % 2 == 0).toList();
        // int soma = numerosPares.stream().reduce(0, Integer::sum);
        // System.out.println("A soma dos números pares é " + soma);
        
        // Desafio 3 - Verifique se todos os números da lista são positivos:
        // Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.
        // boolean numerosPositivos = numeros.stream().allMatch(n -> n > 0);
        // System.out.println("Todos os números são positivos? " + numerosPositivos);

        // Desafio 4 - Remova todos os valores ímpares:
        // Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.
        // numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        // Desafio 5 - Calcule a média dos números maiores que 5:
        // Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
        // List<Integer> numerosMaiores = numeros.stream().filter(n -> n > 5).toList();
        // Integer media = numerosMaiores.stream().reduce(0, Integer::sum) / numerosMaiores.size();
        // System.out.println("A média dos números maiores que 5 é " + media);

        // Desafio 6 - Verificar se a lista contém algum número maior que 10:
        // Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
        // boolean verificacao = numeros.stream().anyMatch(n -> n > 10);
        // System.out.println("Existe algum número maior que 10? " + verificacao);

        // Desafio 7 - Encontrar o segundo número maior da lista:
        // Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
        // Object[] numerosOrdem = numeros.stream().sorted().skip(numeros.size() - 2).toArray();
        // Integer num = (Integer) numerosOrdem[0];
        // System.out.println("O segundo maior número da lista é " + num);

        // Desafio 8 - Somar os dígitos de todos os números da lista:
        // Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
        // Integer soma = numeros.stream().reduce(0, Integer::sum);
        // System.out.println("A soma de todos os dígitos é " + soma);

        // Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
        // Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.
        // List<Integer> numerosUnicos = numeros.stream().distinct().toList();
        // if(numeros.size() == numerosUnicos.size()){
        //     System.out.println("Os números da lista são todos distintos");
        // } else {
        //     System.out.println("Há repetições nos números da lista");
        // }

        // Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
        // Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.       
        // numeros.stream().filter(n -> n % 2 != 0).filter(n -> n % 3 == 0 || n % 5 == 0).forEach(System.out::println);

        // Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
        // Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.
        // List<Integer> quadrados = numeros.stream().map(n -> n * n).toList();
        // Integer soma = quadrados.stream().reduce(0, (a, b) -> a + b);
        // System.out.println("Soma dos quadrados: " + soma);
        
        // Desafio 12 - Encontre o produto de todos os números da lista:
        // Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.
        // Integer produto = numeros.stream().reduce(1, (a, b) -> a * b);
        // System.out.println("O produtos de todos os números na lista é " + produto);
        
        // Desafio 13 - Filtrar os números que estão dentro de um intervalo:
        // Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.
        // numeros.stream().filter(n -> n > 5 && n < 10).forEach(System.out::println);

        // Desafio 14 - Encontre o maior número primo da lista:
        // Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
        numeros.stream().max(n -> n % 1 == 0 && n % n == 0);
    }
}
