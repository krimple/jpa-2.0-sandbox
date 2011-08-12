package com.chariot.jpademo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Employee {

  @OneToMany(mappedBy = "employee",
          cascade = {CascadeType.PERSIST/*, CascadeType.REMOVE*/})
  private Set<Review> reviews = new HashSet<Review>();

  public void addReview(Review r) {
      r.setEmployee(this);
      reviews.add(r);
  }

    public void removeReview(Review r) {
        reviews.remove(r);
    }
    
    public Set<Review> getReviews() {
        return reviews;
    }



    public void setReviews(Set<Review> reviews) {
        this.reviews = reviews;
    }

    @Id
  @GeneratedValue
  private Long id;

  private String firstName;
    
  private String lastName;

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
