class Person implements Comparable<Object> {
	public static void main(String[] args){
		System.out.println("Hello World!");
	}
	private int Id;
	private String Firstname;
	private String Lastname;
	
	public Person(int id, String firstname, String lastname) {
		super();
		Id = id;
		Firstname = firstname;
		Lastname = lastname;
	}
	
	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		this.Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		this.Lastname = lastname;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Firstname == null) ? 0 : Firstname.hashCode());
		result = prime * result + Id;
		result = prime * result + ((Lastname == null) ? 0 : Lastname.hashCode());
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
		Person other = (Person) obj;
		if (Firstname == null) {
			if (other.Firstname != null)
				return false;
		} else if (!Firstname.equals(other.Firstname))
			return false;
		if (Id != other.Id)
			return false;
		if (Lastname == null) {
			if (other.Lastname != null)
				return false;
		} else if (!Lastname.equals(other.Lastname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [Id=" + Id + ", Firstname=" + Firstname + ", Lastname=" + Lastname + "]";
	}

	@Override
	public int compareTo(Object o) {
		if(this ==o){
            return 0;            
        }else{
        	if (o!=null && o instanceof Person){
        		Person p = (Person) o;
        		if(this.Id <= p.Id){
	                return -1;
	            }else{
	            	return 1;
	            }
        	}else{
        		return -1;
        	}
        }
	}
}

