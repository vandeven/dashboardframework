package nl.topicus.rest;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import nl.topicus.rest.services.HelloWorldServiceImpl;


public class DashBoardRestApplication extends Application{
	private Set<Object> singletons = new HashSet<Object>();
	 
	public DashBoardRestApplication() {
		singletons.add(new HelloWorldServiceImpl());
	}
 
	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
