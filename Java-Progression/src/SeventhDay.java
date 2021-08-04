
public class SeventhDay {
	public static void main(String[] args) {
		// 2nd arrays
		
		int[][] matrix = {{1,2,3},{2,3,4},{3,4,5}};
		
		for (int i=0; i<matrix.length; i++) {
			System.out.println();
			for (int j=0; j<matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}
		
		// String methods
		
		System.out.println();
		
		String name = "Daniel    ";
		boolean verifyName = name.equals("Daniel"); // verify if the name value is equal with the stored value
		int nameLength = name.length(); // calculate variable length
		char randomNameChar = name.charAt(2); // searches for the second char
		int indexOf = name.indexOf("l"); // searches for the index of a char
		boolean isEmpty = name.isEmpty();
		String nameUpperCase = name.toUpperCase();
		String nameLowerCase = name.toLowerCase();
		String trimName = name.trim();
		String replaceChar = name.replace("i", "e");
		System.out.println(replaceChar);
	}
}
