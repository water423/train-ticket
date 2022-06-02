package adminbasic.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.UUID;

/**
 * @author fdse
 */
@ToString
@Data
@ApiModel
public class Contacts implements Serializable {

    @ApiModelProperty(name = "id",value = "id",dataType = "UUID",example = "75ce3fe9-5cdb-49e9-bd27-6df080a2f38b")
    private UUID id;

    @ApiModelProperty(name = "accountId",value = "accountId",dataType = "UUID",example = "4d2a46c7-71cb-4cf1-b5bb-b68406d9da6f")
    private UUID accountId;
    @ApiModelProperty(name = "name",value = "name",dataType = "String",example = "Contacts_One")
    private String name;
    @ApiModelProperty(name = "documentType",value = "documentType",dataType = "int",example = "1")
    private int documentType;
    @ApiModelProperty(name = "documentNumber",value = "documentNumber",dataType = "String",example = "DocumentNumber_One")
    private String documentNumber;
    @ApiModelProperty(name = "phoneNumber",value = "phoneNumber",dataType = "String",example = "ContactsPhoneNum_One")
    private String phoneNumber;


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
        Contacts other = (Contacts) obj;
        return name.equals(other.getName())
                && accountId.equals(other.getAccountId())
                && documentNumber.equals(other.getDocumentNumber())
                && phoneNumber.equals(other.getPhoneNumber())
                && documentType == other.getDocumentType();
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (id == null ? 0 : id.hashCode());
        return result;
    }
}
