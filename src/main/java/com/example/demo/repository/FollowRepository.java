package com.example.demo.repository;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Follow;

public interface FollowRepository extends JpaRepository<Follow, Integer>{

	// unFolow
	@Transactional
	int deleteByFromUserIdAndToUserId(int fromUserId, int toUserId);

	// 팔로우 유무
	int countByFromUserIdAndToUserId(int fromUserId, int toUserId);
}