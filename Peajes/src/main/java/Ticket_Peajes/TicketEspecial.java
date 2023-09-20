package Ticket_Peajes;

public class TicketEspecial extends Ticket
{

	private int numPasajeros;
	private double kilometrosTotales = getKilometrosEntrada() - getKilometrosSalida();

	public TicketEspecial(int kilometrosEntrada, double precioPorKilometro, int numPasajeros)
		{
			super(kilometrosEntrada, precioPorKilometro);
			this.numPasajeros = numPasajeros;
		}

	public int getNumPasajeros()
		{
			return numPasajeros;
		}

	public void setNumPasajeros(int numPasajeros)
		{
			this.numPasajeros = numPasajeros;
		}

	@Override
	public boolean equals(Object obj)
		{
			if (this == obj)
				{
					return true;
				}
			if (!super.equals(obj))
				{
					return false;
				}
			if (!(obj instanceof TicketEspecial))
				{
					return false;
				}
			TicketEspecial other = (TicketEspecial) obj;
			return Double.doubleToLongBits(this.kilometrosTotales) == Double.doubleToLongBits(other.kilometrosTotales)
					&& this.numPasajeros == other.numPasajeros;
		}

	@Override
	public String toString()
		{
			StringBuilder builder = new StringBuilder();
			builder.append("TicketEspecial [numPasajeros=");
			builder.append(this.numPasajeros);
			builder.append(", kilometrosTotales=");
			builder.append(this.kilometrosTotales);
			builder.append("]");
			return builder.toString();
		}

	public double calcularTarifa()
		{
			double precioTotal = (getPrecioPorKilometro() * kilometrosTotales) * numPasajeros;
			if (kilometrosTotales >= 100)
				{
					return precioTotal * 0.95;
				}
			else
				{
					return precioTotal;
				}
		}
}