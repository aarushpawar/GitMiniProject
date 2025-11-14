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

	public int firstevennum(int arr[][])
	{
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(((arr[i][j])%2)==0)
					return arr[i][j];
			}
		}
		return -1;
	}

	public int firstevennum17(int arr[][])
	{
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(((arr[i][j])%2)==0 && (arr[i][j-1] + arr[i][j+1]) > 17)
					return arr[i][j];
			}
		}
		return -1;
	}

	public static void main(String[] args) {

	}
}