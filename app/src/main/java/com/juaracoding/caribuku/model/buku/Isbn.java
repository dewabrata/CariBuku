
package com.juaracoding.caribuku.model.buku;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Isbn implements Serializable, Parcelable
{

    @SerializedName("isbn10")
    @Expose
    private String isbn10;
    @SerializedName("isbn13")
    @Expose
    private String isbn13;
    public final static Creator<Isbn> CREATOR = new Creator<Isbn>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Isbn createFromParcel(Parcel in) {
            return new Isbn(in);
        }

        public Isbn[] newArray(int size) {
            return (new Isbn[size]);
        }

    }
    ;
    private final static long serialVersionUID = 488534423738744131L;

    protected Isbn(Parcel in) {
        this.isbn10 = ((String) in.readValue((String.class.getClassLoader())));
        this.isbn13 = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Isbn() {
    }

    public String getIsbn10() {
        return isbn10;
    }

    public void setIsbn10(String isbn10) {
        this.isbn10 = isbn10;
    }

    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(isbn10);
        dest.writeValue(isbn13);
    }

    public int describeContents() {
        return  0;
    }

}
