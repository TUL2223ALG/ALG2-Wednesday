package week040708_competition;

import java.time.LocalDate;

public enum Category {
    M19("Muzi do 20", 15, 19, Gender.MAN),
    M49("Muzi do 50", 20, 49, Gender.MAN),
    M50("Muzi nad 50", 50, 100, Gender.MAN),
    Z19("Zeny do 20", 15, 19, Gender.WOMAN),
    Z49("Zeny do 50", 20, 49, Gender.WOMAN),
    Z50("Zeny nad 50", 50, 100, Gender.WOMAN);
    
    private String description;
    private int minAge;
    private int maxAge;
    private Gender gender;

    private Category(String description, int minAge, int maxAge, Gender gender) {
        this.description = description;
        this.minAge = minAge;
        this.maxAge = maxAge;
        this.gender = gender;
    }

    public String getDescription() {
        return description;
    }

    public int getMinAge() {
        return minAge;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public Gender getGender() {
        return gender;
    }
    
    public static Category getCategory(int yob, Gender gender){
        int age = LocalDate.now().getYear() - yob;
        Category[] categories = Category.values();
        for (Category cat : categories) {
            if(cat.minAge <= age && cat.maxAge >= age && cat.gender.equals(gender)){
                return cat;
            }
        }
        throw new IllegalArgumentException("Nepatri do zadne kategorie");
        
    
}
 
}
