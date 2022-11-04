package pack;
import java.util.Random;
import java.util.Scanner;

public class Tableau {
	int tab[];
	
	public Tableau (int n) {
		tab=new int[n];
	}
	void remplir() {
		Random rand=new Random();
		for(int i=0;i<tab.length;i++) {
			tab[i]=rand.nextInt(100);
			
		}
		}
	void affiche() {
		for(int i=0;i<tab.length;i++) {
		System.out.println(tab[i]);

	}}
	void somme() {
		int s1=0;
		for(int i=0;i<tab.length;i++) {
			s1+=tab[i];
			
		}
		System.out.println(s1);
	}
	void moyenne() {
		int s=0;
		int m=0;
		int j=0;
		for(int i=0;i<tab.length;i++) {
		s+=tab[i];
		j+=1;
		}
		m=s/j;
		System.out.println(m);
	}
	void max() {
		int max=0;
		for(int i=0;i<tab.length;i++) {
			if(tab[i]>max) {
				max=tab[i];
				
			}
		}
		System.out.println(max);
		
		
	}
	void min() {
		int min=tab[0];
		for(int i=0;i<tab.length;i++) {
			if(tab[i]<min) {
				min=tab[i];
			}
		}
		System.out.println(min);
		
	}
	void existe() {
		int j=0;
		try(Scanner saisie=new Scanner(System.in)){
		int x=saisie.nextInt();
		for(int i=0;i<tab.length;i++) {
			if(x==tab[i]) {
				j=i;}
			}
		
		System.out.println("l'indice de "+x+" est:");
		System.out.println(j);
	}
		}
	
		
	}
	
	



