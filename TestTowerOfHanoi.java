/**
 * 
 * @author Shivam
 * @date 19-09-2017
 * @description Class will check Tower of hanoi deals with a problem 'TOWER OF HANOI',
 * in this problem we have given the number of disks(number of pole is constant).
 * Initially, all the disks are placed in first pole (source pole), all these disks has to be move
 * in destination poll via auxillary pole.There are following rules :-
 * 1.Only one disk should be moved at a time.
 * 2.Disks in destination pole should be in same order as that of Source Pole.
 */
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

public class TestTowerOfHanoi {
	ArrayList<String> movementsOfDisks = new ArrayList<String>();
	@Before
	public void ClearClass() {
		movementsOfDisks.clear();
	}
	@Test
	//test case for 1 disk
	public void towerOfHanoiTest1() {
		movementsOfDisks = TowerOfHanoi.towerOfHanoi("A", "B", "C", 1);
		List<String> actualMovement = Arrays.asList("Move disk 1 from A to B");
		// Compares expected and actual movements of disks.
		assertThat(movementsOfDisks, is(actualMovement));
	}

	//test case for 2 disk
	@Test
	public void towerOfHanoiTest2() {
		movementsOfDisks = TowerOfHanoi.towerOfHanoi("A", "B", "C", 2);
		List<String> actualMovement = Arrays.asList("Move disk 1 from A to C",
				"Move disk 2 from A to B",
				"Move disk 1 from C to B");
		// Compares expected and actual movements of disks.
		assertThat(movementsOfDisks, is(actualMovement));
	}

	//test case for 3 disk
	@Test
	public void towerOfHanoiTest3() {
		movementsOfDisks = TowerOfHanoi.towerOfHanoi("A", "B", "C", 3);
		List<String> actualMovement = Arrays.asList("Move disk 1 from A to B",
				"Move disk 2 from A to C",
				"Move disk 1 from B to C",
				"Move disk 3 from A to B",
				"Move disk 1 from C to A",
				"Move disk 2 from C to B",
				"Move disk 1 from A to B");
		// Compares expected and actual movements of disks.
		assertThat(movementsOfDisks, is(actualMovement));
	}

}
