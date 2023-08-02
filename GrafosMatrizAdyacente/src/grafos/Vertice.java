package grafos;
public class Vertice 
{ 
	String nombre;
	int numVertice;
	public Vertice(String x)
	{
		nombre = x;
		numVertice = -1;
	}
	public String nomVertice() //Devuelve identificador del vértice
	{
		return nombre;
	}
	public boolean equals(Vertice n) //True, si dos vértices son iguales
	{
		return nombre.equals(n.nombre);
	}
	public void asigVert(int n) //Establece el número de vértices
	{
		numVertice = n;
	}
	public String toString() //Características del vértice
	{
		return nombre + " (" + numVertice + ")";
	}
} 