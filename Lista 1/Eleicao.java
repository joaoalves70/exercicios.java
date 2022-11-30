import java.util.Scanner;
public class Eleicao
{
	public static void main(String[] args) {
	    
	    
    Scanner ler = new Scanner(System.in);
    int votoTotal = 0;
    int voto1 = 0;
    int voto2 = 0;
    int votoNuloBranco = 0;

    System.out.println("Qual a quantidade total de eleitores?");
    votoTotal = ler.nextInt();

    System.out.println("Quantas pessoas votaram no primeiro candidato?");
    voto1 = ler.nextInt();

    System.out.println("Quantas pessoas votaram no segundo candidato?");
    voto2 = ler.nextInt();

    votoNuloBranco = votoTotal - voto1 - voto2;

    double voto1Pct = voto1 * 100 / votoTotal;
    double voto2Pct = voto2 * 100 / votoTotal;
    double votoNuloBrancoPct = votoNuloBranco * 100 / votoTotal;

    System.out.println("O total de votos foi de " + votoTotal);
    
    System.out.println("A quantidade total de votos no primeiro candidato foi de " + voto1 + " com " + voto1Pct  + "% dos votos");
    
    System.out.println("A quantidade total de votos no Cletinho foi de " + voto2 + " com " + voto2Pct   + "% dos votos");
    
    System.out.println(  "Quantidade de votos nulos ou brancos foi de " + votoNuloBranco + " com " + votoNuloBrancoPct + "% dos votos");
	    
	    
	}
}
