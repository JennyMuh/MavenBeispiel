package integrationTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import de.hs_furtwangen.informatik.meldeauskunft.domain.Resident;
import de.hs_furtwangen.informatik.meldeauskunft.repository.ResidentRepository;

public class ResidentRepositoryStub implements ResidentRepository {

	public List<Resident> getResidents() {
		
		List<Resident> list1 = new ArrayList<Resident>();
		list1.add(0, new Resident("Harald","Muetze","Hauptstrasse","Muenster",new Date(111990)));
		list1.add(0, new Resident("Hans","Mutz","Gasse","Berlin",new Date(221990)));
		list1.add(0, new Resident("Harald","Muetze","Hauptstrasse","Konstanz",new Date(12345678)));
		list1.add(0, new Resident("Isolde","Lala","Am Peer","Hamburg",new Date(111990)));
		list1.add(0, new Resident("Gerhard","Furtwaengler","Allmendstrasse","Furtwangen",new Date(23456789)));
		
		return list1;
	}

}
