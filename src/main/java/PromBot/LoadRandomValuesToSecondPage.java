package PromBot;

import org.openqa.selenium.WebDriver;

import java.util.Date;
import java.util.Random;

public class LoadRandomValuesToSecondPage {
    private WebDriver driver;

    public LoadRandomValuesToSecondPage(WebDriver driver) {
        this.driver = driver;
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
    public String getGender(){
        String[] gendr={"Мужчина","Женщина"};
        int random = new Random().nextInt(gendr.length);
        String randGender = (gendr[random]);
        return randGender;
    }
    public String getStatus(){
        String[] stat={"В браке","Есть дети"};
        int random = new Random().nextInt(stat.length);
        String randStatus = (stat[random]);
        return randStatus;
    }

    public int getDayOfBirthDay() {
        int randomDay = new Random().nextInt(31);
        return randomDay;
    }

    public int getMonthOfBirthDay() {
        int randomMonth = new Random().nextInt(12);
        return randomMonth;
    }

    public int getYearOfBirthDay() {
        int min = 1920;
        int max = 2020;
        System.out.println(new Random().ints(min,(max+1)).findFirst().getAsInt());
        return new Random().ints(min,(max+1)).findFirst().getAsInt();
    }

    public String getCity() {
        String [] cities = {"Винницкая область","Винница","Волынская область","Луцк","Днепропетровская область","Днепр",
                "Кривой Рог","Бахмут","Никополь","Киев"};
        int randomCity = new Random().nextInt(cities.length);
        String cit = (cities[randomCity]);
        return cit;
    }

    public int getMailIndex() {
        int mail = new Random().ints(1,(100000+1)).findFirst().getAsInt();
        return mail;
    }

    public int getPhoneNumber() {
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
    public String getHobby() {
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
    public String getEmail() {
        return  "aerq" + (new Date().getTime()) + "@gmail.com";
    }
}
