package integrationTest;
import java.util.List;
import de.hs_furtwangen.informatik.meldeauskunft.domain.Resident;
import de.hs_furtwangen.informatik.meldeauskunft.service.BaseResidentService;
import de.hs_furtwangen.informatik.meldeauskunft.service.ResidentServiceException;
import org.junit.Test;


import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;

public class ResidentServiceIntegrationTest 
{
	@Test
	public void getFilteredResidentsListSimple()
	{
		BaseResidentService b1 = new BaseResidentService();
		b1.setResidentRepository(new ResidentRepositoryStub());
		List<Resident> tmp = b1.getFilteredResidentsList(new Resident("Harald",null,null,null,null));
		assertEquals(2, tmp.size());
	}
	@Test
	public void getFilteredResidentsListWildcard()
	{
		BaseResidentService b1 = new BaseResidentService();
		b1.setResidentRepository(new ResidentRepositoryStub());
		List<Resident> tmp = b1.getFilteredResidentsList(new Resident("Ha*",null,null,null,null));
		assertEquals(3, tmp.size());
	}
	@Test
	public void getFilteredResidentsListSimpleEmptyName()
	{
		BaseResidentService b1 = new BaseResidentService();
		b1.setResidentRepository(new ResidentRepositoryStub());
		List<Resident> tmp = b1.getFilteredResidentsList(new Resident(null,null,"Hauptstrasse",null,null));
		assertEquals(2, tmp.size());
	}

	@Test
	public void getFilteredResidentsListSimpleEmpty()
	{
		BaseResidentService b1 = new BaseResidentService();
		b1.setResidentRepository(new ResidentRepositoryStub());
		List<Resident> tmp = b1.getFilteredResidentsList(new Resident(null,null,null,null,null));
		assertEquals(5, tmp.size());
	}

	@Test
	public void getUniqueResidentNotExist()
	{
		BaseResidentService b1 = new BaseResidentService();
		b1.setResidentRepository(new ResidentRepositoryStub());
		try {
			Resident tmp = b1.getUniqueResident(new Resident ("Peter",null,null,null,null));
			fail();
		} catch (ResidentServiceException e) 
		{
			
		}
	}
	@Test
	public void getUniqueResidentDoubleExist()
	{
		BaseResidentService b1 = new BaseResidentService();
		b1.setResidentRepository(new ResidentRepositoryStub());
		try {
			Resident tmp = b1.getUniqueResident(new Resident ("Harald",null,null,null,null));
			fail();
		} catch (ResidentServiceException e) 
		{
			
		}
	}
	@Test
	public void getUniqueResidentSuccess()
	{
		BaseResidentService b1 = new BaseResidentService();
		b1.setResidentRepository(new ResidentRepositoryStub());
		try
		{
			Resident tmp = b1.getUniqueResident(new Resident ("Isolde",null,null,null,null));

		} catch (ResidentServiceException e) 
		{
			fail();
		}
	}
}
