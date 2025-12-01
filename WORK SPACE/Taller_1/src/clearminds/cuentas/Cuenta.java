package clearminds.cuentas;

public class Cuenta {
	private String id;
	private String tipo = "A";
	private double saldo;
	
	//Atributos
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getId() {
		return id;
	}
	//Constructores
	
	public Cuenta(String id) {
		this.id = id;
		tipo = "A";
	}
	public Cuenta(String id, String tipo, double saldo) {
		this.id = id;
		this.tipo = tipo;
		this.saldo = saldo;
	}
	
	//Metodos
	public void imprimir() {
		System.out.println("********************\nCUENTA\n********************");
		System.out.println("Número de Cuenta: "+id);
		System.out.println("Tipo: "+tipo);
		System.out.println("Saldo: "+saldo);
		System.out.println("********************");
	}
	public void imprimirConMiEstilo() {
		System.out.println("********************\nRESUMEN CUENTA\n********************");
		System.out.println("ID: "+id);
		System.out.println("Tipo de Cuenta: "+tipo);
		System.out.println("Saldo disponible: "+saldo);
		System.out.println("*********FIN***********");
	}
}
