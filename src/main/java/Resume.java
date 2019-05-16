public class Resume{
    private String mTitle;
    private String mCompany;
    private String mLocation;
    private String mDescription;
    private String mDate;
    private String mEnd;
    
    public Resume(String title, String company, String location, String description, String date, String end) {
        mTitle = title;
        mCompany = company;
        mLocation = location;
        mDescription = description;
        mDate = date;
        mEnd = end;
    }
    public String getTitle(){
        return mTitle;
    }
    public String getCompany(){
        return mCompany;
    }
    public String getLocation(){
        return mLocation;
    }
    public String getDescription(){
        return mDescription;
    }
    public String getDate(){
        return mDate;
    }
    public String getEnd(){
        return mEnd;
    }
}