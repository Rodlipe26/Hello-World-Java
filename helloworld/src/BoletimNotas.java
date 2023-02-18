public class BoletimNotas {

    public static void main (String [] args){

        int nt1 = 0;
        int nt2 = 0;
        int nt3 = 1;
        int nt4 = 10;
        int mediaFinal = (nt1 + nt2 + nt3 + nt4)/4;
        if (mediaFinal > 5)
            System.out.println("aprovado");
        else if (mediaFinal == 5)
            System.out.println("Passou raspando");
        else
            System.out.println("reprovado");

        System.out.println(mediaFinal);


    }
}
