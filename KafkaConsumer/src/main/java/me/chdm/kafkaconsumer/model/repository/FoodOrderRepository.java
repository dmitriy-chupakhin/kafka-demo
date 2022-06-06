package me.chdm.kafkaconsumer.model.repository;

import me.chdm.kafkaconsumer.model.FoodOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodOrderRepository extends JpaRepository<FoodOrder, Long> {
}
