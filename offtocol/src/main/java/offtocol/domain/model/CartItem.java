package offtocol.domain.model;


import java.io.Serializable;

import lombok.Data;



@Data
public class CartItem implements Serializable {


	private static final long serialVersionUID = 1L;


	private Goods goods;


}