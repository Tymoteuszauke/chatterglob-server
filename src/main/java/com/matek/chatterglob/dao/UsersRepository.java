package com.matek.chatterglob.dao;

import com.matek.chatterglob.models.User;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Mateusz on 02.06.2017.
 */
public interface UsersRepository extends PagingAndSortingRepository<User, Long> {
}
