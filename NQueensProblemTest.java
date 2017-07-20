/**
 * @author Shivam
 * @date 19-09-2017
 * @description NQueensProblem class solves the N Queens problem i.e. the problem of placing
 * N chess queens on an N × N Chessboard so that no two queens attack each
 * other.
 */
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;

public class NQueensProblemTest {

	@Test
	public void positiveTestCase1() {
		NQueensProblem object = new NQueensProblem();

		int board[][] = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 },
				{ 0, 0, 0, 0 } };

		boolean actual = object.nQueen(board, 0, 4);
		assertTrue(actual);

		int expected[][] = { { 0, 1, 0, 0 }, { 0, 0, 0, 1 }, { 1, 0, 0, 0 },
				{ 0, 0, 1, 0 } };

		// Check if solution for N Queens Problem exists or not.
		assertArrayEquals(expected, board);

		// Print board where 1 denotes location of Queen.
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++)
				System.out.print(board[i][j] + " ");

			System.out.println();
		}

	}

}
