package com.tosatti.helpdesk.api.repository;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.tosatti.helpdesk.api.entity.Ticket;

public interface TicketRepository extends MongoRepository<Ticket, String> {
	
	Page<Ticket> findByUserIdOrderByDateDesc(Pageable pages, String userId);
	
	Page<Ticket> findByTitleIgnoreCaseContainingAndStatusIgnoreCaseContainingAndPriorityIgnoreCaseContainingOrderByDateDesc(
			String title, String status, String priority, Pageable pages);

	Page<Ticket> findByTitleIgnoreCaseContainingAndStatusIgnoreCaseContainingAndPriorityIgnoreCaseContainingAndUserIdOrderByDateDesc(
			String title, String status, String priority, Pageable pages);
	
	Page<Ticket> findByTitleIgnoreCaseContainingAndStatusIgnoreCaseContainingAndPriorityIgnoreCaseContainingAndAssignUserIdOrderByDateDesc(
			String title, String status, String priority, Pageable pages);
	
    Page<Ticket> findByNumber(Integer number, Pageable pages);
}
