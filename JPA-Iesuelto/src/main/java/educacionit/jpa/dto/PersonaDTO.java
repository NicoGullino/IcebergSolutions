package educacionit.jpa.dto;

public class PersonaDTO {
	private String nombre;
	private int numero;
	
	public PersonaDTO() {
		
	}
	
	public PersonaDTO(String nombre, int id) {
		this.nombre = nombre;
		this.numero = id;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

}
