//willie Fatimehin
//image proccesing 

private GImage flipHorizontal(GImage pic) {
	int[][] array = pic.getPixelArray();
	int height = array.length;
	int width = array[0].length;
	for(int point1 = 0; point1 < width / 2; point1++) {
		
		for(int point1 = 0; point1 < width / 2; point1++) {
			
			int point2 = width - point1 - 1;
			int temporary = array[row][point1];
			array[row][point1] = array[row][point2];
			array[row][point2] = temporary;
		}
	}
	return new GImage(array);
}	