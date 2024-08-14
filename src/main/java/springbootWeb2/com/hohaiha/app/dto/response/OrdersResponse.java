package springbootWeb2.com.hohaiha.app.dto.response;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import springbootWeb2.com.hohaiha.app.dto.request.RoleRequest;
import springbootWeb2.com.hohaiha.app.entity.Item;
import springbootWeb2.com.hohaiha.app.entity.User;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrdersResponse {
	private String id;
	private int totalQuantity;
	private int discount;
	private Date creationDate;
	private int totalPrice;
	private int Tax;
	private int finalTotalPrice;
	private String Address;
	private String shippingCode;
	private String notes;
	private String paymentMethod;
	private String status;
	private List<Item> item;
	private User user;
}
