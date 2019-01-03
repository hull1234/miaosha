package com.hll.miaosha.vo;

import java.math.BigDecimal;
import java.util.Date;

import com.hll.miaosha.domain.Goods;
import lombok.Data;

@Data
public class GoodsVo extends Goods {
	private Double miaoshaPrice;
	private Integer stockCount;
	private Date startDate;
	private Date endDate;
	private String goodName;
	private String goodTitle;
	private String goodImg;
	private String goodDetail;
	private BigDecimal goodPrice;
	private Integer goodStock;

}
