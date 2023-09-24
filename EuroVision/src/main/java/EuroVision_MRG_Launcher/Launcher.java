package EuroVision_MRG_Launcher;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import EuroVision_MRG_Utils.Pais;

public class Launcher
{
	public static void main(String[] args)
	{
		List<String> paisesFinalistas = new ArrayList<>();
		paisesFinalistas.add("Serbia");
        paisesFinalistas.add("Moldavia");
        paisesFinalistas.add("Hungría");
        paisesFinalistas.add("Ucrania");
        paisesFinalistas.add("Suecia");
        paisesFinalistas.add("Australia");
        paisesFinalistas.add("Noruega");
        paisesFinalistas.add("Dinamarca");
        paisesFinalistas.add("Eslovenia");
        paisesFinalistas.add("Holanda");
        paisesFinalistas.add("Albania");
        paisesFinalistas.add("República Checa");
        paisesFinalistas.add("Lituania");
        paisesFinalistas.add("Israel");
        paisesFinalistas.add("Estonia");
        paisesFinalistas.add("Bulgaria");
        paisesFinalistas.add("Austria");
        paisesFinalistas.add("Finlandia");
        paisesFinalistas.add("Irlanda");
        paisesFinalistas.add("Chipre");
        paisesFinalistas.add("Alemania");
        paisesFinalistas.add("Italia");
        paisesFinalistas.add("Reino Unido");
        paisesFinalistas.add("Francia");
        paisesFinalistas.add("España");

		List<Pais> paises = new ArrayList<>();
		
		for (String paisNombre : paisesFinalistas)
		{
			paises.add(new Pais(paisNombre));
		}
		
		Random rand = new Random();
		for (Pais pais : paises)
		{
			List<String> paisesVotados = new ArrayList<>(paisesFinalistas);

			for (String paisVotado : paisesVotados)
			{
				if (!paisVotado.equals(pais.getNombre()))
				{
					int puntos = rand.nextInt(8) + 1;
					pais.votar(paisVotado, puntos);
				}
			}
		}
		System.out.println("_______PAISES________");
		for (Pais pais : paises)
		{
			System.out.println(pais.getNombre() + ": " + pais.getPuntosTotales() + " puntos");
		}

		int maxPuntos = -1;
		int minPuntos = Integer.MAX_VALUE;
		List<Pais> paisesMax = new ArrayList<>();
		List<Pais> paisesMin = new ArrayList<>();

		for (Pais pais : paises) {
		    int puntos = pais.getPuntosTotales();
		    
		    if (puntos > maxPuntos) {
		        maxPuntos = puntos;
		        paisesMax.clear();
		        paisesMax.add(pais);
		    } else if (puntos == maxPuntos) {
		        paisesMax.add(pais);
		    }

		    if (puntos < minPuntos) {
		        minPuntos = puntos;
		        paisesMin.clear();
		        paisesMin.add(pais);
		    } else if (puntos == minPuntos) {
		        paisesMin.add(pais);
		    }
		}

		System.out.print("\nPaís con la puntuación más alta: ");
		for (Pais pais : paisesMax)
		{
			System.out.println(pais.getNombre());
		}

		System.out.print("\nPaís con la puntuación más baja: ");
		for (Pais pais : paisesMin)
		{
			System.out.println(pais.getNombre());
		}
	}
}