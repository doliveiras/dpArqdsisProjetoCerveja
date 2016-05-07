package br.usjt.arqdsis.cerveja.to;

public class CervejasTO {
    private int id;
    private String nomeCerveja;
    private String tipo;
    private String fabricante;
    private double preço;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeCerveja() {
		return nomeCerveja;
	}
	public void setNomeCerveja(String nomeCerveja) {
		this.nomeCerveja = nomeCerveja;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fabricante == null) ? 0 : fabricante.hashCode());
		result = prime * result + id;
		result = prime * result + ((nomeCerveja == null) ? 0 : nomeCerveja.hashCode());
		long temp;
		temp = Double.doubleToLongBits(preço);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CervejasTO other = (CervejasTO) obj;
		if (fabricante == null) {
			if (other.fabricante != null)
				return false;
		} else if (!fabricante.equals(other.fabricante))
			return false;
		if (id != other.id)
			return false;
		if (nomeCerveja == null) {
			if (other.nomeCerveja != null)
				return false;
		} else if (!nomeCerveja.equals(other.nomeCerveja))
			return false;
		if (Double.doubleToLongBits(preço) != Double.doubleToLongBits(other.preço))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}
	
	
}