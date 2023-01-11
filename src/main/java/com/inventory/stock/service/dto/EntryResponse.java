package com.inventory.stock.service.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.inventory.stock.service.enums.Status;
import com.inventory.stock.service.enums.Unit;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class EntryResponse {
    private UUID id;
    private BigDecimal price;
    private Integer quantity;
    private Unit unit;
    private String expireDate;
    private String lotNumber;
    private String file;
    private String numGoodCommand;
    private String productId;
    private String supplierId;
    private Status status;
    private String raison;
}
