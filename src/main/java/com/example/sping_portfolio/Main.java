package com.example.sping_portfolio;

import com.example.sping_portfolio.controllers.student.User;
import com.example.sping_portfolio.controllers.student.UserJpaRespository;
import com.example.sping_portfolio.controllers.student.UserSqlRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class Main implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
    @Autowired
    private UserJpaRespository userJpaRespository;
    private UserSqlRespository userSqlRespository;
    @Override
    public void run(String... args) throws Exception {

        //    set database awd as
       /* SimpleDateFormat spf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = spf.parse("1982/02/02");
        User user1 = new User("test@gmail.com","teamname", 12345);
        userJpaRespository.save(user1);


        User user1= new User( "test@gmail.com","test", date);
        userRepository.save(user1);
        User user2= new User( "test2@gmail.com","test2", date);
        System.out.println(user1);
        userRepository.save(user2);
*/

    }
}

/*
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);


    }

}*/