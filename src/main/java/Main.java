import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        Person [] PersonArr = new Person[5];
        PersonArr[0]=new Person("Степанов Александр Сергеевич","Начальник отдела",
                "sahaS1975@mail.ru","89155661213",100000,46);
        PersonArr[1]=new Person("Степанова Мария Сергеевич","Инженер",
                "mashaS192008@mail.ru","89213211114",50000,23);
        PersonArr[2]=new Person("Крылов Адексей Степанович","Руководитель проекта",
                "krilov@mail.ru","89236547891",80000,40);
        PersonArr[3]=new Person("Аронова Анастасия Геннадьевна","Ведущий конструктор",
                "nastyaAron@mail.ru","89154563219",70000,42);
        PersonArr[4]=new Person("Кулемин Игорь Витальевич","лаборант",
                "kuleck@mail.ru","89093216549",40000,21);

        for (int i=0; i<5; i++){
            if (PersonArr[i].getAge()>=40){
                PersonArr[i].info();
            }
        }

    }

}
