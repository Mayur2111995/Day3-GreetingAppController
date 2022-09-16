package com.example.greeting_app_development.Repository;

import com.example.greeting_app_development.Model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting,Integer> {


}
