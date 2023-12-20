package encapsulation;

public class Catagories {
	//menggunakan access modifier private pada field atau attribute
	private int id;
	private String name;
	private boolean expensive;
	
	public Catagories(int id, String name, boolean expensive) {
		super();
		this.id = id;
		this.name = name;
		this.expensive = expensive;
	}

	public Catagories() {
		super();
	}

	//Contoh Getter dan Setter tipe data boolean
		//getter
		public boolean isExpensive() {
		return expensive;
		}
		//setter
		public void setExpensive(boolean expensive) {
		this.expensive = expensive;
		}
			
	//Contoh Getter dan Setter tipe data primitif (integer)
		//getter
		public int getId() {
			return id;
		}
		//setter
		public void setId(int id) {
			this.id = id;
		}

		
		
	//Contoh Getter dan Setter objek
		//getter
		public String getName() {
			return name;
		}
		//setter
		public void setName(String name) {
			this.name = name;
		}
}
