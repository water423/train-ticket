package adminorder.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.UUID;

/**
 * @author fdse
 */
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class Order {
    @ApiModelProperty(name = "id",value = "id",dataType = "UUID",example = "5ad7750b-a68b-49c0-a8c0-32776b067703")
    private UUID id;

    @ApiModelProperty(name = "boughtDate",value = "boughtDate",dataType = "Date",example = "1652520330126")
    private Date boughtDate;

    @ApiModelProperty(name = "travelDate",value = "travelDate",dataType = "Date",example = "1501257600000")
    private Date travelDate;

    @ApiModelProperty(name = "travelTime",value = "travelTime",dataType = "Date",example = "1367629320000")
    private Date travelTime;

    /**
     * Which Account Bought it
     */
    @ApiModelProperty(name = "accountId",value = "accountId",dataType = "UUID",example = "4d2a46c7-71cb-4cf1-b5bb-b68406d9da6f")
    private UUID accountId;

    /**
     * Tickets bought for whom....
     */
    @ApiModelProperty(name = "contactsName",value = "contactsName",dataType = "String",example = "Contacts_One")
    private String contactsName;

    @ApiModelProperty(name = "documentType",value = "documentType",dataType = "int",example = "1")
    private int documentType;

    @ApiModelProperty(name = "contactsDocumentNumber",value = "contactsDocumentNumber",dataType = "String",example = "DocumentNumber_One")
    private String contactsDocumentNumber;

    @ApiModelProperty(name = "trainNumber",value = "trainNumber",dataType = "String",example = "G1237")
    private String trainNumber;

    @ApiModelProperty(name = "coachNumber",value = "coachNumber",dataType = "int",example = "5")
    private int coachNumber;

    @ApiModelProperty(name = "seatClass",notes = "adminorder.entity.SeatClass",value = "seatClass",dataType = "int",example = "2")
    private int seatClass;

    @ApiModelProperty(name = "seatNumber",value = "seatNumber",dataType = "String",example = "FirstClass-30")
    private String seatNumber;

    @ApiModelProperty(name = "from",value = "from",dataType = "String",example = "nanjing")
    private String from;

    @ApiModelProperty(name = "to",value = "to",dataType = "String",example = "shanghaihongqiao")
    private String to;

    @ApiModelProperty(name = "status",notes = "adminorder.entity.OrderStatus",value = "status",dataType = "int",example = "0")
    private int status;

    @ApiModelProperty(name = "price",value = "price",dataType = "String",example = "100.0")
    private String price;


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Order other = (Order) obj;
        return boughtDate.equals(other.getBoughtDate())
                && travelDate.equals(other.getTravelDate())
                && travelTime.equals(other.getTravelTime())
                && accountId.equals(other.getAccountId())
                && contactsName.equals(other.getContactsName())
                && contactsDocumentNumber.equals(other.getContactsDocumentNumber())
                && documentType == other.getDocumentType()
                && trainNumber.equals(other.getTrainNumber())
                && coachNumber == other.getCoachNumber()
                && seatClass == other.getSeatClass()
                && seatNumber.equals(other.getSeatNumber())
                && from.equals(other.getFrom())
                && to.equals(other.getTo())
                && status == other.getStatus()
                && price.equals(other.price);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (id == null ? 0 : id.hashCode());
        return result;
    }
}
