package heranca.inner;

import java.util.Calendar;

public class Principal {
    //Atributos
    private static Empregado empregado , diretor;

    //Método main
    public static void main (String[] args) {

        Calendar data = Calendar.getInstance();
        data.set(1980, Calendar.NOVEMBER, 23);
        empregado = new Empregado ("Clara Silva", data , 211456937 , null);
        empregado.gerarMatricula();
        diretor = new Diretor ("Marco Antônio", data , 901564098 , null);
        diretor.gerarMatricula();
        System.out.println ("A matrícula do Diretor é: " + diretor.recuperarMatricula());
        System.out.println ("A matrícula do Empregado é: " + empregado.recuperarMatricula());
    }
}
