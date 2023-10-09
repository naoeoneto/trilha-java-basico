public class Operadores {
    public static void main(String[] args) throws Exception {
        // ARITMÉTICOS
        // String nome = "LINGUAGEM" + " JAVA";
        
        // System.out.println(nome);

        // String concatenacao;

        // concatenacao = 1 + 1 + 1 + "1";
        // System.out.println(concatenacao); // 31
        
        // concatenacao = 1 + "1" + 1 + 1;
        // System.out.println(concatenacao); // 1111
        
        // concatenacao = 1 + 1 + "1" + 1;
        // System.out.println(concatenacao); // 211
        
        // UNÁRIOS
        // int numero = 5;
        // System.out.println(- numero);
        // System.out.println(numero);

        // numero = - numero;
        // System.out.println(numero);

        // numero = numero * -1;
        // System.out.println(numero);

        // numero++;
        // System.out.println(numero);
        
        // System.out.println(numero++);
        
        // TERNÁRIO
        // int a, b;
        
        // a = 2;
        // b = 2;
        // String resultado = a == b ? "VERDADEIRO" : "FALSO";

        // System.out.println(resultado);

        // RELACIONAL
        // int a, b;
        // a = 4;
        // b = 7;

        // if (a > b)
        //     System.out.println("a é maior que b");
        // else if (a < b)
        //     System.out.println("a é menor que b");
        // else
        //     System.out.println("a é igual a b");

        // boolean resultado = a <= b;
        // System.out.println(resultado);

        // String c, d;
        // c = "ANTONIO";
        // d = "ANTONIO";

        // boolean novoResultado = c == d;
        // System.out.println(novoResultado);
        
        // String e = new String(c);

        // novoResultado = c == e;
        // System.out.println(novoResultado); // compara objetos

        // System.out.println(c.equals(e)); // compara conteúdos

        // LÓGICOS
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2)
            System.out.println("Ambas as condições são verdadeiras");

        if (condicao1 && (7 > 4))
            System.out.println("Ambas as condições são verdadeiras");
        
        if (condicao1 || condicao2)
            System.out.println("Uma das condições são verdadeiras");
    }
}
