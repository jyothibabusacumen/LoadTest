package restapi.loadtest.err;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandlerControllerAdvice {
	
	@ExceptionHandler(RecordCreationError.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public @ResponseBody ExceptionResponse handleRecordCreationErr(final RecordCreationError exception,
	final HttpServletRequest request) {
		
		ExceptionResponse error = new ExceptionResponse();
		error.setErrorMessage("IOError" +exception.getMessage());
		error.setRequestedURL(request.getRequestURI());
				
		return error;
		
	}

}
