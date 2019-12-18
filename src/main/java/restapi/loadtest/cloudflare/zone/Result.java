package restapi.loadtest.cloudflare.zone;

import java.util.List;

public class Result {

	
	public Result(String id, String name, String status, boolean paused, String type, int development_mode,
			List<String> name_servers, List<String> original_name_servers, String original_registrar,
			String original_dnshost, String modified_on, String created_on, String activated_on,
			List<String> vanity_name_servers, String vanity_name_servers_ips, Meta meta, Owner owner, Account account,
			List<String> permissions, Plan plan) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.paused = paused;
		this.type = type;
		this.development_mode = development_mode;
		this.name_servers = name_servers;
		this.original_name_servers = original_name_servers;
		this.original_registrar = original_registrar;
		this.original_dnshost = original_dnshost;
		this.modified_on = modified_on;
		this.created_on = created_on;
		this.activated_on = activated_on;
		this.vanity_name_servers = vanity_name_servers;
		this.vanity_name_servers_ips = vanity_name_servers_ips;
		this.meta = meta;
		this.owner = owner;
		this.account = account;
		this.permissions = permissions;
		this.plan = plan;
	}

	private String id;

	private String name;

	private String status;

	private boolean paused;

	private String type;

	private int development_mode;

	private List<String> name_servers;

	private List<String> original_name_servers;

	private String original_registrar;

	private String original_dnshost;

	private String modified_on;

	private String created_on;

	private String activated_on;

	private List<String> vanity_name_servers;

	private String vanity_name_servers_ips;

	private Meta meta;

	private Owner owner;

	private Account account;

	private List<String> permissions;

	private Plan plan;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}

	public void setPaused(boolean paused) {
		this.paused = paused;
	}

	public boolean getPaused() {
		return this.paused;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public void setDevelopment_mode(int development_mode) {
		this.development_mode = development_mode;
	}

	public int getDevelopment_mode() {
		return this.development_mode;
	}

	public void setName_servers(List<String> name_servers) {
		this.name_servers = name_servers;
	}

	public List<String> getName_servers() {
		return this.name_servers;
	}

	public void setOriginal_name_servers(List<String> original_name_servers) {
		this.original_name_servers = original_name_servers;
	}

	public List<String> getOriginal_name_servers() {
		return this.original_name_servers;
	}

	public void setOriginal_registrar(String original_registrar) {
		this.original_registrar = original_registrar;
	}

	public String getOriginal_registrar() {
		return this.original_registrar;
	}

	public void setOriginal_dnshost(String original_dnshost) {
		this.original_dnshost = original_dnshost;
	}

	public String getOriginal_dnshost() {
		return this.original_dnshost;
	}

	public void setModified_on(String modified_on) {
		this.modified_on = modified_on;
	}

	public String getModified_on() {
		return this.modified_on;
	}

	public void setCreated_on(String created_on) {
		this.created_on = created_on;
	}

	public String getCreated_on() {
		return this.created_on;
	}

	public void setActivated_on(String activated_on) {
		this.activated_on = activated_on;
	}

	public String getActivated_on() {
		return this.activated_on;
	}

	public void setVanity_name_servers(List<String> vanity_name_servers) {
		this.vanity_name_servers = vanity_name_servers;
	}

	public List<String> getVanity_name_servers() {
		return this.vanity_name_servers;
	}

	public void setVanity_name_servers_ips(String vanity_name_servers_ips) {
		this.vanity_name_servers_ips = vanity_name_servers_ips;
	}

	public String getVanity_name_servers_ips() {
		return this.vanity_name_servers_ips;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	public Meta getMeta() {
		return this.meta;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public Owner getOwner() {
		return this.owner;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setPermissions(List<String> permissions) {
		this.permissions = permissions;
	}

	public List<String> getPermissions() {
		return this.permissions;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public Plan getPlan() {
		return this.plan;
	}

}
