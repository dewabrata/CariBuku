
package com.juaracoding.caribuku.model.buku;

import java.io.Serializable;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Book implements Serializable, Parcelable
{

    @SerializedName("rank")
    @Expose
    private Integer rank;
    @SerializedName("rank_last_week")
    @Expose
    private Integer rankLastWeek;
    @SerializedName("weeks_on_list")
    @Expose
    private Integer weeksOnList;
    @SerializedName("asterisk")
    @Expose
    private Integer asterisk;
    @SerializedName("dagger")
    @Expose
    private Integer dagger;
    @SerializedName("primary_isbn10")
    @Expose
    private String primaryIsbn10;
    @SerializedName("primary_isbn13")
    @Expose
    private String primaryIsbn13;
    @SerializedName("publisher")
    @Expose
    private String publisher;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("contributor")
    @Expose
    private String contributor;
    @SerializedName("contributor_note")
    @Expose
    private String contributorNote;
    @SerializedName("book_image")
    @Expose
    private String bookImage;
    @SerializedName("book_image_width")
    @Expose
    private Integer bookImageWidth;
    @SerializedName("book_image_height")
    @Expose
    private Integer bookImageHeight;
    @SerializedName("amazon_product_url")
    @Expose
    private String amazonProductUrl;
    @SerializedName("age_group")
    @Expose
    private String ageGroup;
    @SerializedName("book_review_link")
    @Expose
    private String bookReviewLink;
    @SerializedName("first_chapter_link")
    @Expose
    private String firstChapterLink;
    @SerializedName("sunday_review_link")
    @Expose
    private String sundayReviewLink;
    @SerializedName("article_chapter_link")
    @Expose
    private String articleChapterLink;
    @SerializedName("isbns")
    @Expose
    private List<Isbn> isbns = null;
    @SerializedName("buy_links")
    @Expose
    private List<BuyLink> buyLinks = null;
    @SerializedName("book_uri")
    @Expose
    private String bookUri;
    public final static Creator<Book> CREATOR = new Creator<Book>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Book createFromParcel(Parcel in) {
            return new Book(in);
        }

        public Book[] newArray(int size) {
            return (new Book[size]);
        }

    }
    ;
    private final static long serialVersionUID = 3820040163601318797L;

    protected Book(Parcel in) {
        this.rank = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.rankLastWeek = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.weeksOnList = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.asterisk = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.dagger = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.primaryIsbn10 = ((String) in.readValue((String.class.getClassLoader())));
        this.primaryIsbn13 = ((String) in.readValue((String.class.getClassLoader())));
        this.publisher = ((String) in.readValue((String.class.getClassLoader())));
        this.description = ((String) in.readValue((String.class.getClassLoader())));
        this.price = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        this.author = ((String) in.readValue((String.class.getClassLoader())));
        this.contributor = ((String) in.readValue((String.class.getClassLoader())));
        this.contributorNote = ((String) in.readValue((String.class.getClassLoader())));
        this.bookImage = ((String) in.readValue((String.class.getClassLoader())));
        this.bookImageWidth = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.bookImageHeight = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.amazonProductUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.ageGroup = ((String) in.readValue((String.class.getClassLoader())));
        this.bookReviewLink = ((String) in.readValue((String.class.getClassLoader())));
        this.firstChapterLink = ((String) in.readValue((String.class.getClassLoader())));
        this.sundayReviewLink = ((String) in.readValue((String.class.getClassLoader())));
        this.articleChapterLink = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.isbns, (com.juaracoding.caribuku.model.buku.Isbn.class.getClassLoader()));
        in.readList(this.buyLinks, (com.juaracoding.caribuku.model.buku.BuyLink.class.getClassLoader()));
        this.bookUri = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Book() {
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getRankLastWeek() {
        return rankLastWeek;
    }

    public void setRankLastWeek(Integer rankLastWeek) {
        this.rankLastWeek = rankLastWeek;
    }

    public Integer getWeeksOnList() {
        return weeksOnList;
    }

    public void setWeeksOnList(Integer weeksOnList) {
        this.weeksOnList = weeksOnList;
    }

    public Integer getAsterisk() {
        return asterisk;
    }

    public void setAsterisk(Integer asterisk) {
        this.asterisk = asterisk;
    }

    public Integer getDagger() {
        return dagger;
    }

    public void setDagger(Integer dagger) {
        this.dagger = dagger;
    }

    public String getPrimaryIsbn10() {
        return primaryIsbn10;
    }

    public void setPrimaryIsbn10(String primaryIsbn10) {
        this.primaryIsbn10 = primaryIsbn10;
    }

    public String getPrimaryIsbn13() {
        return primaryIsbn13;
    }

    public void setPrimaryIsbn13(String primaryIsbn13) {
        this.primaryIsbn13 = primaryIsbn13;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContributor() {
        return contributor;
    }

    public void setContributor(String contributor) {
        this.contributor = contributor;
    }

    public String getContributorNote() {
        return contributorNote;
    }

    public void setContributorNote(String contributorNote) {
        this.contributorNote = contributorNote;
    }

    public String getBookImage() {
        return bookImage;
    }

    public void setBookImage(String bookImage) {
        this.bookImage = bookImage;
    }

    public Integer getBookImageWidth() {
        return bookImageWidth;
    }

    public void setBookImageWidth(Integer bookImageWidth) {
        this.bookImageWidth = bookImageWidth;
    }

    public Integer getBookImageHeight() {
        return bookImageHeight;
    }

    public void setBookImageHeight(Integer bookImageHeight) {
        this.bookImageHeight = bookImageHeight;
    }

    public String getAmazonProductUrl() {
        return amazonProductUrl;
    }

    public void setAmazonProductUrl(String amazonProductUrl) {
        this.amazonProductUrl = amazonProductUrl;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public String getBookReviewLink() {
        return bookReviewLink;
    }

    public void setBookReviewLink(String bookReviewLink) {
        this.bookReviewLink = bookReviewLink;
    }

    public String getFirstChapterLink() {
        return firstChapterLink;
    }

    public void setFirstChapterLink(String firstChapterLink) {
        this.firstChapterLink = firstChapterLink;
    }

    public String getSundayReviewLink() {
        return sundayReviewLink;
    }

    public void setSundayReviewLink(String sundayReviewLink) {
        this.sundayReviewLink = sundayReviewLink;
    }

    public String getArticleChapterLink() {
        return articleChapterLink;
    }

    public void setArticleChapterLink(String articleChapterLink) {
        this.articleChapterLink = articleChapterLink;
    }

    public List<Isbn> getIsbns() {
        return isbns;
    }

    public void setIsbns(List<Isbn> isbns) {
        this.isbns = isbns;
    }

    public List<BuyLink> getBuyLinks() {
        return buyLinks;
    }

    public void setBuyLinks(List<BuyLink> buyLinks) {
        this.buyLinks = buyLinks;
    }

    public String getBookUri() {
        return bookUri;
    }

    public void setBookUri(String bookUri) {
        this.bookUri = bookUri;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(rank);
        dest.writeValue(rankLastWeek);
        dest.writeValue(weeksOnList);
        dest.writeValue(asterisk);
        dest.writeValue(dagger);
        dest.writeValue(primaryIsbn10);
        dest.writeValue(primaryIsbn13);
        dest.writeValue(publisher);
        dest.writeValue(description);
        dest.writeValue(price);
        dest.writeValue(title);
        dest.writeValue(author);
        dest.writeValue(contributor);
        dest.writeValue(contributorNote);
        dest.writeValue(bookImage);
        dest.writeValue(bookImageWidth);
        dest.writeValue(bookImageHeight);
        dest.writeValue(amazonProductUrl);
        dest.writeValue(ageGroup);
        dest.writeValue(bookReviewLink);
        dest.writeValue(firstChapterLink);
        dest.writeValue(sundayReviewLink);
        dest.writeValue(articleChapterLink);
        dest.writeList(isbns);
        dest.writeList(buyLinks);
        dest.writeValue(bookUri);
    }

    public int describeContents() {
        return  0;
    }

}
