package salesTotal.model.controller;

import java.util.List;

import salesTotal.model.vo.SalesTotalPrice;

public interface SalesService {

	List<SalesTotalPrice> salesTotalPriceaboutMonth();

	List<SalesTotalPrice> salesCardTotalPrice();

	List<SalesTotalPrice> salesCashTotalPrice();

}
