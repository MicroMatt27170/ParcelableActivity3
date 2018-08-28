package com.matthew.micromatt.parcelableactivity3.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {

    private String name;
    private String lastName;
    private int age;

    public User(){
        this.name = "";
        this.lastName = "";
        this.age = 0;
    }

    public User(String name, String lastName, int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAge(String ageString){
        try {
            this.age = Integer.parseInt(ageString);
        }
        catch (Exception e){

        }
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(lastName);
        parcel.writeInt(age);
    }

    public static final Parcelable.Creator<User> CREATOR
            = new Parcelable.Creator<User>(){
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int i) {
            return new User[i];
        }
    };

    private User(Parcel in){
        this.name = in.readString();
        this.lastName = in.readString();
        this.age = in.readInt();
    }
}
