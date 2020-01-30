package com.asys1920.mapper;

import com.asys1920.dto.BalanceDTO;
import com.asys1920.model.Balance;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BalanceMapper {
    BalanceMapper INSTANCE = Mappers.getMapper(BalanceMapper.class);

    Balance balanceDTOToBalance(BalanceDTO balanceDTO);

    BalanceDTO balanceToBalanceDTO(Balance balance);
}