package com.sicimike.structural.facade;

/**
 * 积分兑换礼品服务
 * @author sicimike
 * @create 2020-02-24 21:37
 */
public class ExchangeService {

    private UserService userService = new UserService();
    private PointService pointService = new PointService();
    private StockService stockService = new StockService();

    /**
     * 兑换礼品
     * 需要先校验用户是否是合法用户、用户积分是否足够、库存是否足够
     */
    public void exchange() {
        if (!userService.checkLegalUser()) {
            throw new RuntimeException("非法用户");
        }
        if (!pointService.checkUsablePoint()) {
            throw new RuntimeException("用户积分不足");
        }
        if (!stockService.checkUsableStock()) {
            throw new RuntimeException("库存不足");
        }

        // 执行兑换逻辑
    }
}
