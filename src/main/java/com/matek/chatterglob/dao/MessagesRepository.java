package com.matek.chatterglob.dao;

import com.matek.chatterglob.models.Message;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Mateusz on 02.06.2017.
 */
public interface MessagesRepository extends PagingAndSortingRepository<Message, Long> {
}
