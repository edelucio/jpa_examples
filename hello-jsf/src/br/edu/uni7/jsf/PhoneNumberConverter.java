package br.edu.uni7.jsf;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

public class PhoneNumberConverter implements Converter {

	public Object getAsObject(
			FacesContext arg0, 
			UIComponent arg1,
			String value) {
		
		String[] values = value.split("-");
		if(values.length < 3){
			throw new ConverterException("Formato invalido para telefone");
		}
		
		String countryCode = values[0];
		String areaCode = values[1];
		String number = values[2];
		
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object obj) {
		
		PhoneNumber p = (PhoneNumber) obj;
		
		StringBuilder number = new StringBuilder();
		number.append(p.getCountryCode());
		number.append("-");
		number.append(p.getAreaCode());
		number.append("-");
		number.append(p.getNumber());
		
		return number.toString();
	}
	
}
