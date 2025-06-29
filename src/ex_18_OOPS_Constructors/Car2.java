package ex_18_OOPS_Constructors;

public class Car2 {
  String model;
  int year;

  Car2(){
      model ="xxx";
      year = 1900;
  }

  Car2(String model_name,int year_of_creation)
  {
      this.model = model_name;
      this.year = year_of_creation;
  }

  Car2(String model_name)
    {
        this.model = model_name;
    }
}
