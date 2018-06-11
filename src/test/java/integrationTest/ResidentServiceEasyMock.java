package integrationTest;
import de.hs_furtwangen.informatik.meldeauskunft.domain.Resident;
import de.hs_furtwangen.informatik.meldeauskunft.repository.ResidentRepository;
import de.hs_furtwangen.informatik.meldeauskunft.service.BaseResidentService;
import de.hs_furtwangen.informatik.meldeauskunft.service.ResidentService;
import de.hs_furtwangen.informatik.meldeauskunft.service.ResidentServiceException;
import org.easymock.EasyMock;
import org.junit.Test;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;

public class ResidentServiceEasyMock
{
	@Test
	public void test()
	{
		List<Resident> list1 = new ArrayList<Resident>();
		list1.add(0, new Resident("Harald","Muetze","Hauptstrasse","Muenster",new Date(111990)));
		list1.add(1, new Resident("Hans","Mutz","Gasse","Berlin",new Date(221990)));
		list1.add(2, new Resident("Harald","Muetze","Hauptstrasse","Konstanz",new Date(12345678)));
		list1.add(3, new Resident("Isolde","Lala","Am Peer","Hamburg",new Date(111990)));
		list1.add(4, new Resident("Gerhard","Furtwaengler","Allmendstrasse","Furtwangen",new Date(23456789)));

		ResidentRepository mock = EasyMock.createMock(ResidentRepository.class);
		EasyMock.expect(mock.getResidents()).andReturn(list1);
		replay(mock);

		BaseResidentService b1 = new BaseResidentService();
		b1.setResidentRepository(mock);
		List<Resident> tmp = b1.getFilteredResidentsList(new Resident("Harald",null,null,null,null));
		assertEquals(2, tmp.size());

		verify(mock);
	}
}
