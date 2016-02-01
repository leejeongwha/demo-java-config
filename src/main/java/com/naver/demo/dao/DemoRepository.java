package com.naver.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.naver.demo.model.CmdEvntPrpt;

@Repository
public interface DemoRepository {
	List<CmdEvntPrpt> getCmdEvntPrpt();
}
