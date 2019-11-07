
package com.juaracoding.caribuku.model.buku;

import java.io.Serializable;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Results implements Serializable, Parcelable
{

    @SerializedName("list_name")
    @Expose
    private String listName;
    @SerializedName("list_name_encoded")
    @Expose
    private String listNameEncoded;
    @SerializedName("bestsellers_date")
    @Expose
    private String bestsellersDate;
    @SerializedName("published_date")
    @Expose
    private String publishedDate;
    @SerializedName("published_date_description")
    @Expose
    private String publishedDateDescription;
    @SerializedName("next_published_date")
    @Expose
    private String nextPublishedDate;
    @SerializedName("previous_published_date")
    @Expose
    private String previousPublishedDate;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("normal_list_ends_at")
    @Expose
    private Integer normalListEndsAt;
    @SerializedName("updated")
    @Expose
    private String updated;
    @SerializedName("books")
    @Expose
    private List<Book> books = null;
    @SerializedName("corrections")
    @Expose
    private List<Object> corrections = null;
    public final static Creator<Results> CREATOR = new Creator<Results>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Results createFromParcel(Parcel in) {
            return new Results(in);
        }

        public Results[] newArray(int size) {
            return (new Results[size]);
        }

    }
    ;
    private final static long serialVersionUID = -3404360576479073101L;

    protected Results(Parcel in) {
        this.listName = ((String) in.readValue((String.class.getClassLoader())));
        this.listNameEncoded = ((String) in.readValue((String.class.getClassLoader())));
        this.bestsellersDate = ((String) in.readValue((String.class.getClassLoader())));
        this.publishedDate = ((String) in.readValue((String.class.getClassLoader())));
        this.publishedDateDescription = ((String) in.readValue((String.class.getClassLoader())));
        this.nextPublishedDate = ((String) in.readValue((String.class.getClassLoader())));
        this.previousPublishedDate = ((String) in.readValue((String.class.getClassLoader())));
        this.displayName = ((String) in.readValue((String.class.getClassLoader())));
        this.normalListEndsAt = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.updated = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.books, (com.juaracoding.caribuku.model.buku.Book.class.getClassLoader()));
        in.readList(this.corrections, (Object.class.getClassLoader()));
    }

    public Results() {
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public String getListNameEncoded() {
        return listNameEncoded;
    }

    public void setListNameEncoded(String listNameEncoded) {
        this.listNameEncoded = listNameEncoded;
    }

    public String getBestsellersDate() {
        return bestsellersDate;
    }

    public void setBestsellersDate(String bestsellersDate) {
        this.bestsellersDate = bestsellersDate;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getPublishedDateDescription() {
        return publishedDateDescription;
    }

    public void setPublishedDateDescription(String publishedDateDescription) {
        this.publishedDateDescription = publishedDateDescription;
    }

    public String getNextPublishedDate() {
        return nextPublishedDate;
    }

    public void setNextPublishedDate(String nextPublishedDate) {
        this.nextPublishedDate = nextPublishedDate;
    }

    public String getPreviousPublishedDate() {
        return previousPublishedDate;
    }

    public void setPreviousPublishedDate(String previousPublishedDate) {
        this.previousPublishedDate = previousPublishedDate;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Integer getNormalListEndsAt() {
        return normalListEndsAt;
    }

    public void setNormalListEndsAt(Integer normalListEndsAt) {
        this.normalListEndsAt = normalListEndsAt;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Object> getCorrections() {
        return corrections;
    }

    public void setCorrections(List<Object> corrections) {
        this.corrections = corrections;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(listName);
        dest.writeValue(listNameEncoded);
        dest.writeValue(bestsellersDate);
        dest.writeValue(publishedDate);
        dest.writeValue(publishedDateDescription);
        dest.writeValue(nextPublishedDate);
        dest.writeValue(previousPublishedDate);
        dest.writeValue(displayName);
        dest.writeValue(normalListEndsAt);
        dest.writeValue(updated);
        dest.writeList(books);
        dest.writeList(corrections);
    }

    public int describeContents() {
        return  0;
    }

}
