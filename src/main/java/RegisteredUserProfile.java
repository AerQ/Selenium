import java.util.List;
import java.util.Random;

class Reg {
    public static void main(String[] args) {
        RegisteredUserProfile registeredUserProfile = new RegisteredUserProfile();
        System.out.println(registeredUserProfile);
    }
}

public class RegisteredUserProfile {
    private String nickName;
    private String secondName;
    private String patronymic;
//    private enum Gender {MAN, WOMAN, HAVECHILDREN, INMARRIAGE};
//    private int dayOfBirthDay;
//    private int monthOfBirthDay;
//    private int yearOfBirthDay;
//    private String country;
//    private String city;
    private int mailIndex;
    private int phoneNumber;
    private String selfDescription;
    private String interests;
//    private enum  Privacy {FIO,SOCIALWEBS,ABOUTMYSELF,HOBBY,INTERESTS};
//    private List<String> RegUsersProf;

    public RegisteredUserProfile() {
    }

    public RegisteredUserProfile(String nickName, String secondName, String patronymic, int mailIndex, int phoneNumber, String selfDescription, String interests) {
        this.nickName = nickName;
        this.secondName = secondName;
        this.patronymic = patronymic;
//        this.dayOfBirthDay = dayOfBirthDay;
//        this.monthOfBirthDay = monthOfBirthDay;
//        this.yearOfBirthDay = yearOfBirthDay;
//        this.country = country;
//        this.city = city;
        this.mailIndex = mailIndex;
        this.phoneNumber = phoneNumber;
        this.selfDescription = selfDescription;
        this.interests = interests;
    }

    public String getNickName() {
        String[] names = {"Adam", "John", "Jon", "Peter", "Alex", "Sam", "Gordon", "Ben", "Bendjamin", "Sander", "Anna", "Jade", "Kitana", "Milena",
                "Sirena", "Aleksander", "Alexa", "Ann", "Max", "Philip", "Antonio", "Dan", "Martin", "Ivan", "Mickel", "Morris", "Khal", "Daenerys",
                "Frodo", "Gendalf", "Aragorn", "Boromir", "Faramir", "Gimli", "Legolas", "Saruman", "Torin", "Golum", "Ralph", "Clarens", "David"};
        int x = new Random().nextInt(names.length);
        String z = (names[x]);
        return z;
    }

    public String getSecondName() {
        String[] secNames = {"Ivanov", "Petrov", "Jmachenko", "Boltov", "Ralov", "Gayko", "Silpo", "Cmov", "Genric", "Balev"};
        int random = new Random().nextInt(secNames.length);
        String lastRandName = (secNames[random]);
        return lastRandName;
    }

    public String getPatronymic() {
        String[] patron = {"Ivanovich", "Petrovich", "Jmachenkoich", "Boltovich", "Ralovich", "Gaykoich", "Silpoich", "Cmovich", "Genricich", "Balevich",
                "Ivanovvna", "Petrovna", "Jmachenkovna", "Boltovna", "Ralovna", "Gaykvna", "Silpvna", "Cmovna", "Genricichvna", "Balevna"};
        int random = new Random().nextInt(patron.length);
        String randPatronymic = (patron[random]);
        return randPatronymic;
    }
//
//    public Gender getGender() {
//        int gendre = new Random().nextInt(Gender.values().length);
//        return Gender.values()[gendre];
//    }

//    public int getDayOfBirthDay() {
//        int randomDay = new Random().nextInt(31);
//        return randomDay;
//    }
//
//    public int getMonthOfBirthDay() {
//        int randomMonth = new Random().nextInt(12);
//        return randomMonth;
//    }
//
//    public int getYearOfBirthDay() {
//        int min = 1950;
//        int max = 2019;
//        System.out.println(new Random().ints(min,(max+1)).findFirst().getAsInt());
//        return new Random().ints(min,(max+1)).findFirst().getAsInt();
//    }

//    public String getCountry() {
//        String countryes = "Ukraine";
//        return countryes;
//    }

//    public String getCity() {
//        String [] cities = {"Kyiv","Lviv","Zaporizhzhya","Lutsk","Kharkiv","Uczhgorod","Mykolaiv","Odessa","Dnipro","Sumy"};
//        int randomCity = new Random().nextInt(cities.length);
//        String cit = (cities[randomCity]);
//        return cit;
//    }

    public int getMailIndex() {
        int mail = new Random().ints(1,(100000+1)).findFirst().getAsInt();
        return mail;
    }

    private int getPhoneNumber() {
        int phoneNumber = new Random().ints(1,(1000000000+1)).findFirst().getAsInt();
        return phoneNumber;
    }

    public String getSelfDescription() {
        String textFish = "\"But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born" +
                " and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the " +
                "truth, the master-builder of human happiness. No one rejects, dislikes, or avoids pleasure itself, because it is pleasure," +
                " but because those who do not know how to pursue pleasure rationally encounter consequences that are extremely painful." +
                " Nor again is there anyone who loves or pursues or desires to obtain pain of itself, because it is pain, but because ";
        return textFish;
    }

    public String getInterests() {
        String []inter = {"Sport","Fishing","GYM","Cooking","Relaxing","Studyng"};
        int random = new Random().nextInt(inter.length);
            String result = (inter[random]);
        return result;
    }
//
//    public Privacy getPrivacy() {
//        int privacy = new Random().nextInt(Privacy.values().length);
//        return Privacy.values()[privacy];
//    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("nickName").append(nickName).append("\n");
        sb.append("secondName").append(secondName).append("\n");
        sb.append("patronymic").append(patronymic).append("\n");
//        sb.append("dayOfBirthDay").append(dayOfBirthDay);
//        sb.append("monthOfBirthDay").append(monthOfBirthDay);
//        sb.append("yearOfBirthDay").append(yearOfBirthDay);
//        sb.append("country").append(country).append("\n");
//        sb.append("city").append(city).append("\n");
        sb.append("MailIndex").append(mailIndex).append("\n");
        sb.append("phoneNumber").append(phoneNumber);
        sb.append("selfDescription").append(selfDescription).append("\n");
        sb.append("interests").append(interests).append("\n");
        return sb.toString();
    }
}
