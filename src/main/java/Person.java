public class Person {
    private String name;
    private String post;
    private String eMail;
    private String phoneNumber;
    private int Wages;
    private int age;

    public Person(String name, String post, String eMail, String phoneNumber, int Wages, int age){
        this.name = name;
        this.post = post;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.Wages = Wages;
        this.age = age;}

    public void info () {
        System.out.println("ФИО сотрудника: " + name + " ; Должность: "+ post
                +" ; Адрес электронной почты: "+ eMail+" ; Номер телефона: "+ phoneNumber+" ; Зарплата: "+ Wages+" ; Возраст: "+age);

    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


}
