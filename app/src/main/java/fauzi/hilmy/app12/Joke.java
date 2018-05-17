package fauzi.hilmy.app12;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by 26FaUZeE02 on 4/26/18.
 */

public class Joke {
    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("setup")
    @Expose
    private String setup;

    @SerializedName("punchline")
    @Expose
    private String punchline;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public String getPunchline() {
        return punchline;
    }

    public void setPunchline(String punchline) {
        this.punchline = punchline;
    }
}
