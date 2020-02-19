package com.asys1920.mapper;

import com.asys1920.dto.OrderDTO;
import com.asys1920.model.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    Order orderDTOToOrder(OrderDTO orderDTO);

    OrderDTO orderToOrderDTO(Order order);
}
