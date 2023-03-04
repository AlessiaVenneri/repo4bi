package Triangolo;
public class triangolo {
	private float base;
	private float altezza;
	
	public triangolo() {
		
	}
	public float areatriangolo() {
		return base*altezza;
	}
	
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	public float getAltezza() {
		return altezza;
	}
	public void setAltezza(float altezza) {
		this.altezza = altezza;
	}

	public String toString() {
		return "triangolo dati: base=" + base + ", altezza=" + altezza;
	}

}
