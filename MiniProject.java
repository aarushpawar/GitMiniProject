public class MiniProject {

	public static int[][] ArraySquare(int size)
	{
		int[][] array = new int[size][size];

				for (int i = 0; i < size; i++) {
					for (int j = 0; j < size; j++) {
						array[i][j] = (int)(Math.random() * 10 + 1);
					}
				}

		return array;
	}

	public static void main(String[] args) {

	}
}