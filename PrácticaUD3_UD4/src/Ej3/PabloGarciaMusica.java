package Ej3;

public class PabloGarciaMusica {

	public String grupo;
	public int numCanciones;
	public String nombreHobby;
	public int integrantes;
	public String instrumentos;
	
	public PabloGarciaMusica(String grupo, int numCanciones, String nombreHobby, int integrantes, String instrumentos) {
		this.grupo = grupo;
		this.numCanciones = numCanciones;
		this.nombreHobby = nombreHobby;
		this.integrantes = integrantes;
		this.instrumentos = instrumentos;
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
	public int getIntegrantes() {
		return this.integrantes;
	}
	
	public void setInstrumentos(String instrumentos) {
		this.instrumentos = instrumentos;
	}
}
