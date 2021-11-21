package thrillio.entities;

import java.util.Arrays;

import partner.Shareable;
import thrillio.constants.BookGenre;

public class Book extends Bookmark implements Shareable{
	private int publicationYear;
	private String publisher;
	private String[] authors;
	private String genre;
	private double amazonRating;

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String[] getAuthors() {
		return authors;
	}

	public void setAuthors(String[] authors) {
		this.authors = authors;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getAmazonRating() {
		return amazonRating;
	}

	public void setAmazonRating(double amazonRating) {
		this.amazonRating = amazonRating;
	}

	@Override
	public String toString() {
		return "Book [publicationYear=" + publicationYear + ", publisher=" + publisher + ", authors="
				+ Arrays.toString(authors) + ", genre=" + genre + ", amazonRating=" + amazonRating;
	}

	@Override
	public boolean isKidFriendlyEligable() {
		if(genre.equals(BookGenre.SELF_HELP) || genre.equals(BookGenre.PHILOSOPHY)) {
			return false;
		}
		return true;
	}

	@Override
	public String getItemData() { //returns data in XML format 
		StringBuilder builder = new StringBuilder();
		
		builder.append("<item>");
			builder.append("<type>Book</type>");
			builder.append("<title>").append(getTitle()).append("</title>");
			builder.append("<publicationYear>").append(publicationYear).append("</publicationYear>");
			builder.append("<publisher>").append(publisher).append("</publisher>");
			builder.append("<author>").append(Arrays.toString(authors)).append("</author>");
			builder.append("<genre>").append(genre).append("</genre>");
			builder.append("<amazonRating>").append(amazonRating).append("</amazonRating");
			//builder.append(isKidFriendlyEligable());
		builder.append("</item>");
		
		return builder.toString();
	}


}
