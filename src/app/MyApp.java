package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Paradigmas.Post;
import Paradigmas.Usuario;
import Paradigmas.Comentario;

public class MyApp {
	
	private static List<Usuario> users = new ArrayList<Usuario>();

	public static void main(String[] args) {
		
		int estado;
		Scanner scn = new Scanner(System.in);
		Scanner scn2 = new Scanner(System.in);
		
	
		//Menu
		System.out.println("BIENVENIDO");
		
		do{
		System.out.println("1) Agregar nuevo usuario.");
		System.out.println("2) Agregar nuevo post.");
		System.out.println("3) Comentar post.");
		System.out.print("Seleccione una opcion: ");
		estado = scn.nextInt();
		
		switch(estado){
			
			case 1: 
				users.add(new Usuario());
				break;
			
			case 2:
				for (int i=0; i< (users.size()); i++ ){
					System.out.println(i+ users.get(i).getNombre());
				}
				System.out.print("Ingrese numero usuario: ");
				users.get(scn.nextInt()).Postear();
				break;
				
			case 3: 
				for (int i=0; i< (users.size()); i++ ){
					System.out.println(i+ users.get(i).getNombre());
				}
				System.out.print("Ingrese numero usuario: ");
				users.get(scn.nextInt()).verPosts();
				break;
				
		}
		}while(estado != 0);
		System.out.print("Hasta pronto!");
	}

}
