
package com.juaracoding.caribuku.model.buku;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelBuku implements Serializable, Parcelable
{

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("copyright")
    @Expose
    private String copyright;
    @SerializedName("num_results")
    @Expose
    private Integer numResults;
    @SerializedName("last_modified")
    @Expose
    private String lastModified;
    @SerializedName("results")
    @Expose
    private Results results;
    public final static Creator<ModelBuku> CREATOR = new Creator<ModelBuku>() {


        @SuppressWarnings({
            "unchecked"
        })
        public ModelBuku createFromParcel(Parcel in) {
            return new ModelBuku(in);
        }

        public ModelBuku[] newArray(int size) {
            return (new ModelBuku[size]);
        }

    }
    ;
    private final static long serialVersionUID = 295249369695345395L;

    protected ModelBuku(Parcel in) {
        this.status = ((String) in.readValue((String.class.getClassLoader())));
        this.copyright = ((String) in.readValue((String.class.getClassLoader())));
        this.numResults = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.lastModified = ((String) in.readValue((String.class.getClassLoader())));
        this.results = ((Results) in.readValue((Results.class.getClassLoader())));
    }

    public ModelBuku() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public Integer getNumResults() {
        return numResults;
    }

    public void setNumResults(Integer numResults) {
        this.numResults = numResults;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public Results getResults() {
        return results;
    }

    public void setResults(Results results) {
        this.results = results;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(status);
        dest.writeValue(copyright);
        dest.writeValue(numResults);
        dest.writeValue(lastModified);
        dest.writeValue(results);
    }

    public int describeContents() {
        return  0;
    }

}
