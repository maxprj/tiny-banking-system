package com.banking.common.response;

import com.banking.common.view.TransactionListView;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransactionListResponse implements Serializable {
    public static final String MEDIA_TYPE = "application/vnd.transactionListResponse+json";

    private List<TransactionListView> items;
    private int page;
    private int size;
    private long total;

}
