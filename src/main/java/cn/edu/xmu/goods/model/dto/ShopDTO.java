package cn.edu.xmu.goods.model.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class ShopDTO implements Serializable {
    private Long id;
    private String name;
    private boolean state;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
}
