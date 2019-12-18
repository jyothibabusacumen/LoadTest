package restapi.loadtest.cloudflare.zone;

public class Plan {

	
	public Plan(String id, String name, int price, String currency, String frequency, boolean is_subscribed,
			boolean can_subscribe, String legacy_id, boolean legacy_discount, boolean externally_managed) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.currency = currency;
		this.frequency = frequency;
		this.is_subscribed = is_subscribed;
		this.can_subscribe = can_subscribe;
		this.legacy_id = legacy_id;
		this.legacy_discount = legacy_discount;
		this.externally_managed = externally_managed;
	}

	private String id;

	private String name;

	private int price;

	private String currency;

	private String frequency;

	private boolean is_subscribed;

	private boolean can_subscribe;

	private String legacy_id;

	private boolean legacy_discount;

	private boolean externally_managed;

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

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return this.price;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getFrequency() {
		return this.frequency;
	}

	public void setIs_subscribed(boolean is_subscribed) {
		this.is_subscribed = is_subscribed;
	}

	public boolean getIs_subscribed() {
		return this.is_subscribed;
	}

	public void setCan_subscribe(boolean can_subscribe) {
		this.can_subscribe = can_subscribe;
	}

	public boolean getCan_subscribe() {
		return this.can_subscribe;
	}

	public void setLegacy_id(String legacy_id) {
		this.legacy_id = legacy_id;
	}

	public String getLegacy_id() {
		return this.legacy_id;
	}

	public void setLegacy_discount(boolean legacy_discount) {
		this.legacy_discount = legacy_discount;
	}

	public boolean getLegacy_discount() {
		return this.legacy_discount;
	}

	public void setExternally_managed(boolean externally_managed) {
		this.externally_managed = externally_managed;
	}

	public boolean getExternally_managed() {
		return this.externally_managed;
	}

}
