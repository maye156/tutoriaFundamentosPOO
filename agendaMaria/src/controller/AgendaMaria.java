package controller;

public class AgendaMaria {

	public static void main(String[] args) {
		//1. Crear amigos
		Amigo mejorAmiga = new Amigo();
		Amigo amiguita2 = new Amigo("Julieth", (short)18, "9-marzo" );
		Amigo amiguito3 = new Amigo ("Andrew", (short) 20, "23-11");
		
		//2. Actualizar un amigo
		amiguito3.setNombre("Andrew Castle");
		
		//3. Mostrar Lista amigos
	     String n = mejorAmiga.getNombre();
         System.out.println(n);
	}

}
