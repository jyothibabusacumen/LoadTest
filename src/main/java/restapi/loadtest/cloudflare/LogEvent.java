package restapi.loadtest.cloudflare;

public class LogEvent {

	String clientIP;
	String clientRequestHost;
	String clientRequestMethod;
	String clientRequestURI;
	String edgeEndTimestamp;
	String edgeResponseBytes;
	String edgeResponseStatus;
	String edgeStartTimestamp;
	String rayID;

	
	
	public LogEvent(String clientIP, String clientRequestHost, String clientRequestMethod, String clientRequestURI,
			String edgeEndTimestamp, String edgeResponseBytes, String edgeResponseStatus, String edgeStartTimestamp,
			String rayID) {
		super();
		this.clientIP = clientIP;
		this.clientRequestHost = clientRequestHost;
		this.clientRequestMethod = clientRequestMethod;
		this.clientRequestURI = clientRequestURI;
		this.edgeEndTimestamp = edgeEndTimestamp;
		this.edgeResponseBytes = edgeResponseBytes;
		this.edgeResponseStatus = edgeResponseStatus;
		this.edgeStartTimestamp = edgeStartTimestamp;
		this.rayID = rayID;
	}

	public String getClientIP() {
		return clientIP;
	}

	public void setClientIP(String clientIP) {
		this.clientIP = clientIP;
	}

	public String getClientRequestHost() {
		return clientRequestHost;
	}

	public void setClientRequestHost(String clientRequestHost) {
		this.clientRequestHost = clientRequestHost;
	}

	public String getClientRequestMethod() {
		return clientRequestMethod;
	}

	public void setClientRequestMethod(String clientRequestMethod) {
		this.clientRequestMethod = clientRequestMethod;
	}

	public String getClientRequestURI() {
		return clientRequestURI;
	}

	public void setClientRequestURI(String clientRequestURI) {
		this.clientRequestURI = clientRequestURI;
	}

	public String getEdgeEndTimestamp() {
		return edgeEndTimestamp;
	}

	public void setEdgeEndTimestamp(String edgeEndTimestamp) {
		this.edgeEndTimestamp = edgeEndTimestamp;
	}

	public String getEdgeResponseBytes() {
		return edgeResponseBytes;
	}

	public void setEdgeResponseBytes(String edgeResponseBytes) {
		this.edgeResponseBytes = edgeResponseBytes;
	}

	public String getEdgeResponseStatus() {
		return edgeResponseStatus;
	}

	public void setEdgeResponseStatus(String edgeResponseStatus) {
		this.edgeResponseStatus = edgeResponseStatus;
	}

	public String getEdgeStartTimestamp() {
		return edgeStartTimestamp;
	}

	public void setEdgeStartTimestamp(String edgeStartTimestamp) {
		this.edgeStartTimestamp = edgeStartTimestamp;
	}

	public String getRayID() {
		return rayID;
	}

	public void setRayID(String rayID) {
		this.rayID = rayID;
	}
	
	

}
