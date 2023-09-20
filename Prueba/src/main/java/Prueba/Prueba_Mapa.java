package Prueba;

import java.util.Map;
import java.util.TreeMap;

public class Prueba_Mapa
{

	public static void main(String[] args)
		{
			Coche coche1 = new Coche("7711AAA","Volkswagen");
			Coche coche2 = new Coche("2211BBB","Volkswagen");
			
			Map<String,Coche> mapaDeCoches = new TreeMap<String,Coche>();
			
			mapaDeCoches.put(coche1.getMatricula(), coche1);
			mapaDeCoches.put(coche2.getMatricula(), coche2);

			System.out.println(mapaDeCoches.get("7711AAA"));
			
			System.out.println(mapaDeCoches);
		}
}