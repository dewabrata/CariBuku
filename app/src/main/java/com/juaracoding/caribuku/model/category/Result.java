
package com.juaracoding.caribuku.model.category;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

import androidx.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result implements Serializable, Parcelable
{

    @SerializedName("list_name")
    @Expose
    private String listName;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("list_name_encoded")
    @Expose
    private String listNameEncoded;
    @SerializedName("oldest_published_date")
    @Expose
    private String oldestPublishedDate;
    @SerializedName("newest_published_date")
    @Expose
    private String newestPublishedDate;
    @SerializedName("updated")
    @Expose
    private String updated;
    public final static Creator<Result> CREATOR = new Creator<Result>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Result createFromParcel(Parcel in) {
            return new Result(in);
        }

        public Result[] newArray(int size) {
            return (new Result[size]);
        }

    }
    ;
    private final static long serialVersionUID = -3362645498888933031L;

    protected Result(Parcel in) {
        this.listName = ((String) in.readValue((String.class.getClassLoader())));
        this.displayName = ((String) in.readValue((String.class.getClassLoader())));
        this.listNameEncoded = ((String) in.readValue((String.class.getClassLoader())));
        this.oldestPublishedDate = ((String) in.readValue((String.class.getClassLoader())));
        this.newestPublishedDate = ((String) in.readValue((String.class.getClassLoader())));
        this.updated = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Result() {
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getListNameEncoded() {
        return listNameEncoded;
    }

    public void setListNameEncoded(String listNameEncoded) {
        this.listNameEncoded = listNameEncoded;
    }

    public String getOldestPublishedDate() {
        return oldestPublishedDate;
    }

    public void setOldestPublishedDate(String oldestPublishedDate) {
        this.oldestPublishedDate = oldestPublishedDate;
    }

    public String getNewestPublishedDate() {
        return newestPublishedDate;
    }

    public void setNewestPublishedDate(String newestPublishedDate) {
        this.newestPublishedDate = newestPublishedDate;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(listName);
        dest.writeValue(displayName);
        dest.writeValue(listNameEncoded);
        dest.writeValue(oldestPublishedDate);
        dest.writeValue(newestPublishedDate);
        dest.writeValue(updated);
    }

    public int describeContents() {
        return  0;
    }

    @NonNull
    @Override
    public String toString() {
        return this.getListName();
    }
}
