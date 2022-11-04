package pack;


public class TestTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tableau tableau=new Tableau(10);
		tableau.remplir();
		System.out.println("Tableau:");tableau.affiche();
		System.out.println("la somme=");tableau.somme();
		System.out.println("la moyenne=");tableau.moyenne();
		System.out.println("le max =");tableau.max();
		System.out.println("le min =");tableau.min();
		System.out.println("veuillez saisir un entier:");
		tableau.existe();
		
		

	}

}
