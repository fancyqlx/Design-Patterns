package fancyqlx.Proxy;

public interface PersonBean {
    String getName();
    String getGender();
    String getInterests();
    int getHotorNotRating();

    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setHotorNotRating(int rating);

    void print();
}

class PersonBeanImpl implements PersonBean{
    String name;
    String gender;
    String interests;
    int rating;
    int ratingCount = 0;

    public PersonBeanImpl(String str){
        name = str;
    }


    @Override
    public String getName(){
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public int getHotorNotRating() {
        if(ratingCount == 0) return 0;
        return rating/ratingCount;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public void setHotorNotRating(int rating) {
        this.rating += rating;
        ratingCount++;
    }

    public void print(){
        System.out.println(name + ": "+gender+", "+"\n"+ "Interests: "+interests+"\nrating: "+ rating);
    }
}