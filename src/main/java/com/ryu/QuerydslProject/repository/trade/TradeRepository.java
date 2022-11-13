package com.ryu.QuerydslProject.repository.trade;

import com.ryu.QuerydslProject.domain.trade.Trade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TradeRepository extends JpaRepository<Trade,Long> {
}
