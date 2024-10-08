package springbootWeb2.com.hohaiha.app.dto.request;

import java.sql.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrdersRequest {
	private int totalQuantity;
	private int discount;
	private Date creationDate;
	private int totalPrice;
	private int tax;
	private int finalTotalPrice;
	private String city;
	private String district;
	private String ward;
	private String numberAndStreet;
	private String shippingCode;
	private String notes;
	private String paymentMethod;
	private String status;
	private List<String> item;
	private String userId;
	private String staffId;
}
