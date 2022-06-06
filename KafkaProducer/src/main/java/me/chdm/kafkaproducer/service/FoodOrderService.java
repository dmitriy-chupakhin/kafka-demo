package me.chdm.kafkaproducer.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.chdm.kafkaproducer.model.FoodOrder;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class FoodOrderService {

    private final Producer producer;

    public String createFoodOrder(FoodOrder foodOrder) throws JsonProcessingException {
        return producer.sendMessage(foodOrder);
    }
}
