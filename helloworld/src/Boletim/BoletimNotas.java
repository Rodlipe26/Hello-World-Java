package Boletim;

public class BoletimNotas {

    public static void main (String [] args) {

        
        float nt1 = 6;
        float nt2 = 6;
        float nt3 = 5;
        float nt4 = 10;
        float mediaFinal = (nt1 + nt2 + nt3 + nt4) / 4;

        System.out.println("sua média é");

        System.out.println(mediaFinal);

        if ( nt1 < 4)
            System.out.println("\nReprovado, pois tirou menos que 5 na prova 1\n");
        else if (nt2< 4)
            System.out.println("\nReprovado, pois tirou menos que 5 na prov 2\n");
        else if (nt3< 4)
            System.out.println("\nReprovado, pois tirou menos que 5 na prova3\n");
        else if (nt4< 4)
            System.out.println("\nReprovado, pois tirou menos que 5 na prova 4\n");

        else

            if (mediaFinal > 7)
                System.out.println("aprovado, parabéns!");
            else if (mediaFinal == 7)
                System.out.println("Passou na régua!");
            else
                System.out.println("reprovado por estar abaixo da média!");


    }
}
