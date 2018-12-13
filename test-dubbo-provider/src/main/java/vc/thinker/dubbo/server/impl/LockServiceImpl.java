package vc.thinker.dubbo.server.impl;

import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;

import vc.thinker.dubbo.service.LockService;

@Service(timeout=5000)
@Transactional
public class LockServiceImpl implements LockService{

	@Override
	public String findOne(Long id) {
		return "查询一个:" + id;
	}

	@Override
	public String listByType(Integer type) {
		return "查询列表:" + type;
	}

	@Override
	public Boolean delete(Long id) {
		return true;
	}
}
