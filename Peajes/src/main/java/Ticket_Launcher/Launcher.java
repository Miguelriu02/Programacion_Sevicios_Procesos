package Ticket_Launcher;

import Ticket_Peajes.*;

public class Launcher
{

	public static void main(String[] args)
		{
			TicketGeneral ticketGeneral = new TicketGeneral(100, 0.10);
			ticketGeneral.registrarSalida(600);

			double tarifaGeneral = ticketGeneral.calcularTarifa();
			System.out.println("Tarifa del Ticket General: " + tarifaGeneral + " €");

			TicketEspecial ticketEspecial = new TicketEspecial(100, 0.10, 50);
			ticketEspecial.registrarSalida(300);

			double tarifaEspecial = ticketEspecial.calcularTarifa();
			System.out.println("Tarifa del Ticket Especial: " + tarifaEspecial + " €");

		}
}