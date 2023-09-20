package Ticket_Peajes;

public class TicketGeneral extends Ticket
{

	public TicketGeneral(int kilometrosEntrada, double precioPorKilometro)
		{
			super(kilometrosEntrada, precioPorKilometro);
		}

	@Override
	public boolean equals(Object obj)
		{
			if (this == obj)
				{
					return true;
				}
			if (!(obj instanceof TicketGeneral))
				{
					return false;
				}
			TicketGeneral other = (TicketGeneral) obj;
			return Double.doubleToLongBits(getPrecioPorKilometro()) == Double.doubleToLongBits(other.getPrecioPorKilometro());
		}

	@Override
	public String toString()
		{
			StringBuilder builder = new StringBuilder();
			builder.append("TicketGeneral [precioKm=");
			builder.append(getPrecioPorKilometro());
			builder.append("]");
			return builder.toString();
		}

	private double kilometrosTotales = getKilometrosEntrada() - getKilometrosSalida();
	
	public double calculoTarifa()
		{
			double precioTotal = getPrecioPorKilometro() * kilometrosTotales;
			if (kilometrosTotales >= 500)
				{
					return precioTotal = (kilometrosTotales / 500) * 0.9;
				}
			else
				{
					return precioTotal;
				}
		}
}