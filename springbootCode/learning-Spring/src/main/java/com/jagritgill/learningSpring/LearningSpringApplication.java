package com.jagritgill.learningSpring;

import com.jagritgill.learningSpring.data.entity.Guest;
import com.jagritgill.learningSpring.data.entity.Reservation;
import com.jagritgill.learningSpring.data.entity.Room;
import com.jagritgill.learningSpring.data.repository.GuestRepository;
import com.jagritgill.learningSpring.data.repository.ReservationRepository;
import com.jagritgill.learningSpring.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class LearningSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringApplication.class, args);
	}

}
