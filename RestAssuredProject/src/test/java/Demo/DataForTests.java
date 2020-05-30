package Demo;
import org.testng.annotations.DataProvider;

public class DataForTests {

	@DataProvider(name = "DataForPost")
	public Object[][] dataForPost() {

		//		Object[][] data =  new Object[2][3];
		//
		//		data[0][0] = "Ginna";
		//		data[0][1] = "pada";
		//		data[0][2] =  2;
		//
		//		data[1][0] = "Deby";
		//		data[1][1] = "Jonsan";
		//		data[1][2] =  1;
		//		return data;

		return new Object[][] {
			{"Graham", "Bell", 1},
			{"Henry", "Ford", 2}
		};


	}

	@DataProvider(name = "DeleteData")
	public Object[] dataForDelete() {

		return new Object[] {
				38,39,40,41,42,43
		};
	}

}
