package ex_19_OOPS_Part2.inheritance.multilevelInheritance;

public class Lab170_Multilevel {

    public static void main(String[] args){

        Son venki = new Son();
        venki.bangaloreProperty();
        venki.extraMoney();
        venki.bhk3();


        Father paramesh = new Father();
        paramesh.extraMoney();
        paramesh.bhk3();

        GrandFather ajjappa = new GrandFather();
        ajjappa.bhk3();

//        Son s3 = new Father();  --->Dynamic dispatch child reference cant be given to parent
        Father paramesh1 = new Son(); //Dynamic dispatch
        GrandFather ajjappa2 = new Son();

        //from parent reference to child object we can access only parent specific data
        ajjappa2.bhk3();
    }
}
