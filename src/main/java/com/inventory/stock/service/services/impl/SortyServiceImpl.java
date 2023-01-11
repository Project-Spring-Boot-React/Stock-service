package com.inventory.stock.service.services.impl;

import com.inventory.stock.service.dto.EntryRequest;
import com.inventory.stock.service.dto.EntryResponse;
import com.inventory.stock.service.dto.SortyRequest;
import com.inventory.stock.service.enums.Status;
import com.inventory.stock.service.mappers.EntryMapper;
import com.inventory.stock.service.models.Entry;
import com.inventory.stock.service.models.Sorty;
import com.inventory.stock.service.repositories.EntryRepository;
import com.inventory.stock.service.repositories.StockRepository;
import com.inventory.stock.service.services.EntryService;
import com.inventory.stock.service.services.SortyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
@Slf4j
public class SortyServiceImpl implements SortyService {

    @Override
    public Sorty addSorty(SortyRequest sortyRequest) {
        return null;
    }

    @Override
    public List<Sorty> getSorties() {
        return null;
    }

    @Override
    public Sorty getSorty(UUID id) {
        return null;
    }

    @Override
    public boolean cancelSorty(UUID id) {
        return false;
    }
}
