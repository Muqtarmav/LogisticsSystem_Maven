package africa.semicolon.cheetah.dtos.requests;

import lombok.Data;

@Data
public class AddPackageRequest {
    private String senderName;
    private String senderPhone;
    private String receiverName;
    private String deliveryAddress;
    private String receiverPhone;
    private double packageWeight;
    private String packageDescription;


}
