package com.petrov.lesson6.professions;
import com.petrov.lesson6.interfaces.Driver;

public class TruckDriver implements Driver {

   private String name;
   private String surname;
   private String patronymic;
   private int drivingExperience;


   public TruckDriver(String inputName, String inputSurname, String inputPatronymic, int inputDrivingExperience)
   {
       name = inputName;
       surname =inputSurname;
       patronymic = inputPatronymic;
       drivingExperience = inputDrivingExperience;
   }

   public String getFullName()
   {
       String fullName = patronymic + " " + name + " " + surname;
       return  fullName;
   }

   public int getDrivingExperience()
   {
       return drivingExperience;
   }

   public String getFullDriverInfo()
   {
       String fullDriverInfo = getFullName() + " Driving experience: " + drivingExperience;
       return fullDriverInfo;
   }
}
