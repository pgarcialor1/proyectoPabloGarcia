package Ej3;

public class PabloGarciaMusica {

	public String grupo;
	public int numCanciones;
	public String nombreHobby;
	public int integrantes;
	
	public PabloGarciaMusica(String grupo, int numCanciones, String nombreHobby, int integrantes) {
		this.grupo = grupo;
		this.numCanciones = numCanciones;
		this.nombreHobby = nombreHobby;
		this.integrantes = integrantes;
	}
	
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public String getGrupo() {
		return this.grupo;
	}
	
	public void setNumCanciones(int numCanciones) {
		this.numCanciones = numCanciones;
	}
	public int getNumCanciones() {
		return this.numCanciones;
	}
	
	public void setNombreHobby(String nombreHobby) {
		this.nombreHobby = nombreHobby;
	}
	public String getNombreHobby() {
		return this.nombreHobby;
	}
	
	public void setIntegrantes(int integrantes) {
		this.integrantes = integrantes;
	}
}
