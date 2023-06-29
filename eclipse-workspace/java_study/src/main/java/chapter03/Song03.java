package chapter03;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public Song() {
		//some code01
		//02
		//03
	}
	
	public Song(String title, String artist) {
		
		this();
		//this.title=title;
		//this.artist=artist;
		//우선 title, artist 두개만 만들기
		this(title, artist, "","",0,0);//a()=> a(title),a(artist),..
		
	}
	
	public Song(String title,String artist,...) {
		this();
		
		this.title=title;
		this.album=album;
		this.artist=artist;
		this.composer=composer;
		this.year=year;
		this.track=track;
		
		song.show();
		
		Song song2= new Song("Love Dive","Jasmin Parker외 3인","IVE",2022))
		song2.show();
		
		Song song3= new Song("사건의 지평선","","윤하",""))
	    song3.show();
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getTrack() {
		return track;
	}
	public void setTrack(String track) {
		this.track = track;
	}
}
