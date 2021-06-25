package pm1;

public class CompactDisk extends Product{
	
	private String albumTitle;
	private String artist;
	
	public CompactDisk(int productID, String description, String maker, int price, String albumTitle, String artist) {
		super(productID, description, maker, price);
		this.albumTitle = albumTitle;
		this.artist = artist;
	}
	
	
	public String getAlbumTitle() {
		return albumTitle;
	}

	public String getArtist() {
		return artist;
	}

	public void setAlbumTitle(String albumTitle) {
		this.albumTitle = albumTitle;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}


	public void showInfo() {
		super.showInfo();
		System.out.println("¾Ù¹ü Á¦¸ñ>> "+albumTitle);
		System.out.println("°¡¼ö>> "+artist);
	}

}
