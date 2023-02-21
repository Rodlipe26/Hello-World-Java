package Boletim;

public class BoletimNotas {

    public static void main (String [] args){

        double nt1 = 9.5;
        double nt2 = 2.5;
        double nt3 = 8;
        double nt4 = 10;
        double mediaFinal = (nt1 + nt2 + nt3 + nt4)/4;
        if (mediaFinal > 5)
            System.out.println("aprovado");
        else if (mediaFinal == 5)
            System.out.println("Passou raspando");
        else
            System.out.println("reprovado");

        System.out.println(mediaFinal);


    }
}
