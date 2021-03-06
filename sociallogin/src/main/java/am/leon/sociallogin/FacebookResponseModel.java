package am.leon.sociallogin;

import android.os.Parcel;
import android.os.Parcelable;

public class FacebookResponseModel implements Parcelable {

    private int id;
    private String name;
    private String gender;
    private String birthday;
    private String link;
    private String first_name;
    private String last_name;
    private String email;
    private Location hometown;
    private Location location;
    private String profilePic;

    private FacebookResponseModel(Parcel in) {
        id = in.readInt();
        name = in.readString();
        gender = in.readString();
        birthday = in.readString();
        link = in.readString();
        first_name = in.readString();
        last_name = in.readString();
        email = in.readString();
        hometown = in.readParcelable(Location.class.getClassLoader());
        location = in.readParcelable(Location.class.getClassLoader());
        profilePic = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(name);
        dest.writeString(gender);
        dest.writeString(birthday);
        dest.writeString(link);
        dest.writeString(first_name);
        dest.writeString(last_name);
        dest.writeString(email);
        dest.writeParcelable(hometown, flags);
        dest.writeParcelable(location, flags);
        dest.writeString(profilePic);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<FacebookResponseModel> CREATOR = new Creator<FacebookResponseModel>() {
        @Override
        public FacebookResponseModel createFromParcel(Parcel in) {
            return new FacebookResponseModel(in);
        }

        @Override
        public FacebookResponseModel[] newArray(int size) {
            return new FacebookResponseModel[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Location getHometown() {
        return hometown;
    }

    public void setHometown(Location hometown) {
        this.hometown = hometown;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getProfilePic() {
        profilePic = "https://graph.facebook.com/" + getId() + "/picture?type=large";
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }
}
