package designPattern.Solid.DependencyInversion;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class JSONFormatter implements Formatter{

	public String format(Message message) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		mapper.registerModule(new JavaTimeModule());
		try {
			return mapper.writeValueAsString(message);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			throw new Exception(e);
		}
	}
}
