package org.mykola.fraud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class FraudCheckService {

	private final FraudCheckHistoryRepository fraudCheckHistoryRepository;

	@Autowired
	public FraudCheckService(FraudCheckHistoryRepository fraudCheckHistoryRepository) {
		this.fraudCheckHistoryRepository = fraudCheckHistoryRepository;
	}

	public boolean isFraudulentCustomer(Integer customerId) {
		fraudCheckHistoryRepository.save(
				FraudCheckHistory.builder()
						.customerId(customerId)
						.isFraudster(false)
						.createdAt(LocalDateTime.now())
						.build()
		);
		return false;
	}

}
