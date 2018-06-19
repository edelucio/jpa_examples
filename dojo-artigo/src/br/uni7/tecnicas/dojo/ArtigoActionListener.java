package br.uni7.tecnicas.dojo;

import javax.faces.component.html.HtmlCommandButton;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

public class ArtigoActionListener implements ActionListener{
	@Override
	public void processAction(ActionEvent event) throws AbortProcessingException {
		Object source = event.getSource();
		System.out.println(source);
		HtmlCommandButton button = (HtmlCommandButton) source;
		button.setValue("Botão clicado");
	}
}
