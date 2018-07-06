	package io.altar.jseproject.beans;
	
	import javax.ejb.EJB;
	import javax.faces.component.UIComponent;
	import javax.faces.context.FacesContext;
	import javax.faces.convert.Converter;
	import javax.faces.convert.FacesConverter;
	import javax.inject.Inject;
	
	
	
	public class SomeConverter implements Converter{
		
	
		public Object getAsObject(FacesContext context, UIComponent component, String value) {
			
			return value;
		}
	
	
		public String getAsString(FacesContext context, UIComponent component, Object value) {
			return value != null ? value.toString() : "";
	
	
	
	
	
		}
	}
