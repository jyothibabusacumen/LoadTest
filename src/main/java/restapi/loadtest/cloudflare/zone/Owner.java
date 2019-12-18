package restapi.loadtest.cloudflare.zone;

public class Owner {

	
	public Owner(String id, String type, String email) {
		super();
		this.id = id;
		this.type = type;
		this.email = email;
	}

	private String id;

	private String type;

	private String email;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return this.email;
	}
}
