public class ExemploFor {
    public static void main(String[] args) {
        String alunos [] = {"Antonio", "João", "Arthur", "Rafaela"};

        // for (int aluno = 0; aluno < alunos.length; aluno++){
        //     System.out.println("O aluno no indíce " + aluno + " é " + alunos[aluno]);
        // }

        for(String aluno: alunos){
            System.out.println("O nome do aluno é: " + aluno);
        }
    }
}
