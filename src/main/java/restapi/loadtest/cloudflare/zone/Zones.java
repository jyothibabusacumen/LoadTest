package restapi.loadtest.cloudflare.zone;

import java.util.List;

public class Zones {

	
	public Zones(List<Result> result, Result_info result_info, boolean success, List<String> errors,
			List<String> messages) {
		super();
		this.result = result;
		this.result_info = result_info;
		this.success = success;
		this.errors = errors;
		this.messages = messages;
	}

	private List<Result> result;

	private Result_info result_info;

	private boolean success;

	private List<String> errors;

	private List<String> messages;

	public void setResult(List<Result> result) {
		this.result = result;
	}

	public List<Result> getResult() {
		return this.result;
	}

	public void setResult_info(Result_info result_info) {
		this.result_info = result_info;
	}

	public Result_info getResult_info() {
		return this.result_info;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public boolean getSuccess() {
		return this.success;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}

	public List<String> getErrors() {
		return this.errors;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	public List<String> getMessages() {
		return this.messages;
	}
}
