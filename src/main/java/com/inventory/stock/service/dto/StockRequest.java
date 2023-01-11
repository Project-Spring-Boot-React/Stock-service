package com.inventory.stock.service.dto;

import com.inventory.stock.service.enums.Status;
import com.inventory.stock.service.enums.Unit;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StockRequest {
    private UUID productId;
    private float quantity;
    private String unit;
    private String status;
}
