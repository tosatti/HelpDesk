package com.tosatti.helpdesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tosatti.helpdesk.api.entity.ChangeStatus;

public interface ChangeStatusRepository extends MongoRepository<ChangeStatus, String> {
	
	Iterable<ChangeStatus> findByTicketIdOrderByDateChageStatusDesc(String ticketId);

}
