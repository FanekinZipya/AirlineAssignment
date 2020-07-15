package chapter7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KnightTourTest {
	KnightTour knight;
	@BeforeEach
	void setUp() throws Exception {
		knight = new KnightTour();
	}
	

	@AfterEach
	void tearDown() throws Exception {
	}

	
	@Test
    void testKnight(){
        int[] horizontal = {2,2,1,-2,1,1,2,-1};
        int[] vertical = {1,-1,2,1,2,-2,1,2};
        knight.moveKnight(horizontal, vertical);
        knight.displayBoard();

	}
	}
