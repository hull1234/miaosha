package com.hll.miaosha.vo;

import com.hll.miaosha.domain.OrderInfo;
import lombok.Data;

@Data
public class OrderDetailVo {
	private GoodsVo goods;
	private OrderInfo order;
}
