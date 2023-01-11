package com.inventory.stock.service.mappers.Impl;

import com.inventory.stock.service.dto.EntryRequest;
import com.inventory.stock.service.dto.EntryResponse;
import com.inventory.stock.service.dto.SortyRequest;
import com.inventory.stock.service.mappers.EntryMapper;
import com.inventory.stock.service.mappers.SortyMapper;
import com.inventory.stock.service.models.Entry;
import com.inventory.stock.service.models.Sorty;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class SortyMapperImpl implements SortyMapper {

    @Override
    public Sorty dtoToModel(SortyRequest requestDTO) {
        return Sorty
                .builder()
                .id(UUID.randomUUID())
                .qte(requestDTO.getQte())
                .productId(UUID.fromString(requestDTO.getProductId()))
                .unit(requestDTO.getUnit())
                .build();
    }
}
