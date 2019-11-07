
package com.juaracoding.caribuku.model.buku;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BuyLink implements Serializable, Parcelable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;
    public final static Creator<BuyLink> CREATOR = new Creator<BuyLink>() {


        @SuppressWarnings({
            "unchecked"
        })
        public BuyLink createFromParcel(Parcel in) {
            return new BuyLink(in);
        }

        public BuyLink[] newArray(int size) {
            return (new BuyLink[size]);
        }

    }
    ;
    private final static long serialVersionUID = 8199094248937785578L;

    protected BuyLink(Parcel in) {
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
    }

    public BuyLink() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(name);
        dest.writeValue(url);
    }

    public int describeContents() {
        return  0;
    }

}
