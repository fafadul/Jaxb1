package model;

import java.util.List;
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

//Use unmarshalling and the JAXBContext for transform documents xml into objects java
public class DemoUnmarshalling {

	public static void main(String[] args) {

		try {
			JAXBContext jc = JAXBContext.newInstance("model");
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			Zoo zoo = (Zoo) unmarshaller.unmarshal(
					new File("C:/Fadul/workspace/Jaxb/src/model/ticket.xml"));
			List<Ticket> tickets = zoo.getTicket();
			for (int i = 0; i < tickets.size(); i++){
				Ticket ticket = tickets.get(i);
				System.out.println("Ticket");
				System.out.println("Nom : "+ticket.getName());
				System.out.println("Prix : "+ticket.getPrice());
				System.out.println("Categorie : "+ticket.getCategory());
				System.out.println();
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
