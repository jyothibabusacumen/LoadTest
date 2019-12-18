package restapi.loadtest.cloudflare.zone;

public class Meta {

	public Meta(int step, boolean wildcard_proxiable, int custom_certificate_quota, int page_rule_quota,
			boolean phishing_detected, boolean multiple_railguns_allowed) {
		super();
		this.step = step;
		this.wildcard_proxiable = wildcard_proxiable;
		this.custom_certificate_quota = custom_certificate_quota;
		this.page_rule_quota = page_rule_quota;
		this.phishing_detected = phishing_detected;
		this.multiple_railguns_allowed = multiple_railguns_allowed;
	}

	private int step;

	private boolean wildcard_proxiable;

	private int custom_certificate_quota;

	private int page_rule_quota;

	private boolean phishing_detected;

	private boolean multiple_railguns_allowed;

	public void setStep(int step) {
		this.step = step;
	}

	public int getStep() {
		return this.step;
	}

	public void setWildcard_proxiable(boolean wildcard_proxiable) {
		this.wildcard_proxiable = wildcard_proxiable;
	}

	public boolean getWildcard_proxiable() {
		return this.wildcard_proxiable;
	}

	public void setCustom_certificate_quota(int custom_certificate_quota) {
		this.custom_certificate_quota = custom_certificate_quota;
	}

	public int getCustom_certificate_quota() {
		return this.custom_certificate_quota;
	}

	public void setPage_rule_quota(int page_rule_quota) {
		this.page_rule_quota = page_rule_quota;
	}

	public int getPage_rule_quota() {
		return this.page_rule_quota;
	}

	public void setPhishing_detected(boolean phishing_detected) {
		this.phishing_detected = phishing_detected;
	}

	public boolean getPhishing_detected() {
		return this.phishing_detected;
	}

	public void setMultiple_railguns_allowed(boolean multiple_railguns_allowed) {
		this.multiple_railguns_allowed = multiple_railguns_allowed;
	}

	public boolean getMultiple_railguns_allowed() {
		return this.multiple_railguns_allowed;
	}

}
