package com.example.d0811.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class NameResponse {

  String name;
  String gender;
  double genderProbability;
  int age;
  int ageCount;
  String country;
  double countryProbability;

  public void setgenderProbability(double p){
    this.genderProbability = p * 100;
  }

  public void setCountryProbability(double p){
    this.countryProbability = p * 100;
  }

}
