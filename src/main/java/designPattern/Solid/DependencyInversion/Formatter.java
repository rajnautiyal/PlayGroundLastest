package designPattern.Solid.DependencyInversion;

import designPattern.Solid.DependencyInversion.Message;

public interface Formatter {
	
	public String format(Message message) throws Exception;
	
}
