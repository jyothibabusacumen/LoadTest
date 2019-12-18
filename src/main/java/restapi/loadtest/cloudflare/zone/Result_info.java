package restapi.loadtest.cloudflare.zone;

public class Result_info {

	public Result_info(int page, int per_page, int total_pages, int count, int total_count) {
		super();
		this.page = page;
		this.per_page = per_page;
		this.total_pages = total_pages;
		this.count = count;
		this.total_count = total_count;
	}

	private int page;

	private int per_page;

	private int total_pages;

	private int count;

	private int total_count;

	public void setPage(int page) {
		this.page = page;
	}

	public int getPage() {
		return this.page;
	}

	public void setPer_page(int per_page) {
		this.per_page = per_page;
	}

	public int getPer_page() {
		return this.per_page;
	}

	public void setTotal_pages(int total_pages) {
		this.total_pages = total_pages;
	}

	public int getTotal_pages() {
		return this.total_pages;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getCount() {
		return this.count;
	}

	public void setTotal_count(int total_count) {
		this.total_count = total_count;
	}

	public int getTotal_count() {
		return this.total_count;
	}
}
