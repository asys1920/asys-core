package com.asys1920.mapper;

import com.asys1920.dto.BillDTO;
import com.asys1920.model.Bill;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BillMapper {
    BillMapper INSTANCE = Mappers.getMapper(BillMapper.class);

    Bill billDTOtoBill(BillDTO bill);

    BillDTO billToBillDTO(Bill bill);
}
