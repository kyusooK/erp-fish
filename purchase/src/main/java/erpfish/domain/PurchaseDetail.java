package erpfish.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

//<<< DDD / Value Object
@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseDetail {

    private Long unitPrice;

    private Integer qty;

    @Embedded
    private ItemId itemId;
}
//>>> DDD / Value Object
