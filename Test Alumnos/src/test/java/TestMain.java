import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMain {

	@Test
	public void test() 
	{
		String[] args = {"4","2"};
		assertThrows(IndexOutOfBoundsException.class, ()-> {Main.main(args);});

		
	}
	@Test
	public void testSuma1(){
		int resultado = Main.suma(5,2);
		assertEquals(resultado,7);
	}

	@Test
	public void testSuma2() throws Exception {
		String [] args ={"5","3","+"};
		Main.main(args);
	}

	@Test
	public void testSuma3() throws Exception {
		String [] args ={"7","9","x"};
		Main.main(args);

	}

	@Test
	public void testDivision() throws Exception {
		String [] args ={"7","9","/"};
		Main.main(args);
	}

	@Test
	public void testResta() throws Exception {
		String [] args ={"7","9","-"};
		Main.main(args);

	}



	//run test coverage

}
