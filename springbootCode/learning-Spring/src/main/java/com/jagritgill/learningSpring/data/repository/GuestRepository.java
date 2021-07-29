package com.jagritgill.learningSpring.data.repository;

import com.jagritgill.learningSpring.data.entity.Guest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {
}
