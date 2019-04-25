package array;

class Emp {

	
	private int id;
	private String name;
	private String[] languages;
	
	Emp() {
		
	}
	
	Emp( int id,String name) {
		
		this.id = id;
		this.name = name;
		
	}
	
	
	
	
	
	
	void printVal() {
		System.out.println("id is :" + id);
		System.out.println("name is :" + name);
		System.out.println("languages are :");
	
	for (int i = 0; i < languages.length; i++) {
		
		System.out.println(languages[i]);
		
	}
	
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getLanguages() {
		return languages;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}
	
	
	
	
}


